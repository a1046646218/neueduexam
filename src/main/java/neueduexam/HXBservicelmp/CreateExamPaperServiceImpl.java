package neueduexam.HXBservicelmp;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import neueduexam.HXBcontroller.ExamData;
import neueduexam.HXBservice.CreateExamPaperService;
import neueduexam.dao.*;
import neueduexam.entity.examandquestion;
import neueduexam.entity.exampaper;
import neueduexam.entity.user;


@Service
public class CreateExamPaperServiceImpl implements CreateExamPaperService {
	
	@Autowired
	questionandlibMapper questionandlibMapper;
	@Autowired
	questionMapper questionMapper;
	@Autowired
	userMapper userMapper;
	@Autowired
	exampaperMapper exampaperMapper;
	@Autowired
	examandquestionMapper examandquestionMapper;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public String createExamPaper(ExamData examData) {
		
		//生成试卷记录,返回新生成的试卷id
		int examid = insertQuestionLib(examData);

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
			//循环处理一种类型的题目，顺序依次是单选、多选、判断、填空、简答
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
				//采用循环队列的算法，来保证生成的试卷题目不会产生重复
				int index = (int)(Math.random()* AllNums);
				for(int j=0;j<ReqQuesNum;j++) {
					examandquestion  eandq = new examandquestion();
					eandq.setExamid(examid);
					eandq.setQuesscore(score);
					int quesId = list.get(index);
					eandq.setQuesid(quesId);
					examandquestionMapper.insert(eandq);
					index = (index +1) % AllNums; 
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

	
	
	private int insertQuestionLib(ExamData examData) {
		//生成exampaper记录
		exampaper e = new exampaper();
		e.setExamname(examData.getTestName());
		e.setExamtype(examData.getTestType());
		e.setExamprofile(examData.getTestProfile());
		e.setEuserid(examData.getUserId());
		user user = userMapper.selectByPrimaryKey(examData.getUserId());
		e.setEnickname(user.getNickname());
		List<Integer> quesNums = examData.getQuesNums();
		e.setNumofquestions(quesNums.get(0)+quesNums.get(1)+quesNums.get(2)+quesNums.get(3)+quesNums.get(4));
		e.setNumofsingle(quesNums.get(0));
		e.setNumofmultiple(quesNums.get(1));
		e.setNumofjudge(quesNums.get(2));
		e.setNumofblank(quesNums.get(3));
		e.setNumofanswer(quesNums.get(4));
		exampaperMapper.insertExceptId(e);
		return e.getExamid();
	}

	
	
}
