package neueduexam.HXBservicelmp;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import neueduexam.HXBcontroller.ExamData;
import neueduexam.HXBservice.CreateExamPaperService;
import neueduexam.dao.*;

import neueduexam.entity.questionandlib;
import neueduexam.entity.questionlib;
import neueduexam.entity.userhavelib;

@Service
public class CreateExamPaperServiceImpl implements CreateExamPaperService {
	
	@Autowired
	questionandlibMapper questionandlibMapper;
	@Autowired
	questionMapper questionMapper;
	@Autowired
	questionlibMapper questionlibMapper ;
	@Autowired
	userMapper userMapper;
	@Autowired
	userhavelibMapper userhavelibMapper;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public String createExamPaper(ExamData examData) {
		
		//生成题库记录,返回新生成的题库id
		int libid = insertQuestionLib(examData);
		//生成用户拥有题库记录
		insertUserHaveLib(libid,examData.getUserId());

		
		//根据libId，找出所有的quesId
		List<Integer> quesIdList = selectQuesIdByLibIds(examData.getLibIds());

		//将题目分类
		List<Integer> singleIdList = new ArrayList<Integer>();
		List<Integer> multipleIdList = new ArrayList<Integer>();
		List<Integer> judgeIdList = new ArrayList<Integer>();
		List<Integer> blankIdList = new ArrayList<Integer>();
		List<Integer> answerIdList = new ArrayList<Integer>();
		
		for(int quesId:quesIdList) {
			String questype =	questionMapper.selectQuesTypeByPrimaryKey(quesId);
			switch(questype) {
			case "0":
				singleIdList.add(quesId);
				break;
			case "1":
				multipleIdList.add(quesId);
				break;
			case "2":
				judgeIdList.add(quesId);
				break;
			case "3":
				blankIdList.add(quesId);
				break;
			case "4":
				answerIdList.add(quesId);
				break;
			}
		}

		
		for(int i=0;i<5;i++) {
			int score = examData.getScores().get(i);
			int ReqQuesNum = examData.getQuesNums().get(i);
			List<Integer> list = null;
			switch(i) {
			case 0:	
				list = singleIdList;break;
			case 1:
				list = multipleIdList;break;
			case 2:
				list = judgeIdList;break;
			case 3:
				list= blankIdList;break;
			case 4:
				list = answerIdList;break;
			}
			if(score>0) {
				int AllNums = list.size();
				int index = (int)(Math.random()* AllNums);
				for(int j=0;j<ReqQuesNum;j++) {
					questionandlib record = new questionandlib();
					record.setLibid(libid);
					int quesId = list.get(index);
					index = (index +1) % AllNums; 
					record.setQuesid(quesId);
					questionandlibMapper.insert(record);
				}
			}
		}
		
		return "Ok";
	}

	private List<Integer> selectQuesIdByLibIds(List<Integer> libIds) {
		List<Integer> quesIdList = new ArrayList<Integer>();
		//查询所有的题目id
		for(int libId : libIds) {
			List<Integer> list = questionandlibMapper.selectquesIdByLibId(libId);
			for(int i:list) {
				//System.out.println(i);
				quesIdList.add(i);
			}
		}
		return quesIdList;
	}

	private void insertUserHaveLib(int libid, int userId) {
		userhavelib u = new userhavelib();
		u.setLibid(libid);
		u.setUserid(userId);
		userhavelibMapper.insert(u);
	}
	
	
	private int insertQuestionLib(ExamData examData) {
		List<Integer> quesNums = examData.getQuesNums();
		//生成题库记录
		questionlib q = new questionlib();
		q.setLibname(examData.getTestName());
		String nickName = userMapper.selectByPrimaryKey(examData.getUserId()).getNickname();
		q.setNickname(nickName);
		q.setQuesamount(quesNums.get(0)+quesNums.get(1)+quesNums.get(2)+quesNums.get(3)+quesNums.get(4));
		q.setLibtype(examData.getTestType());
		q.setLibprofile(examData.getTestProfile());
		q.setLibprice(-1);
		q.setNumofsingle(quesNums.get(0));
		q.setNumofmultiple(quesNums.get(1));
		q.setNumofjudge(quesNums.get(2));
		q.setNumofblank(quesNums.get(3));
		q.setNumofanswer(quesNums.get(4));
		q.setUserid(examData.getUserId());
		q.setOther1(null);
		q.setOther2(null);
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		q.setPublishtime(df.format(new Date()));
		questionlibMapper.insertExceptId(q);
		return q.getLibid();
	}

	
	
}
