package neueduexam.HXBservicelmp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import neueduexam.dao.*;
import neueduexam.entity.question;
import neueduexam.entity.questionandlib;
import neueduexam.entity.questionandlibExample;
import neueduexam.entity.questionlibExample;
@Service
public class DeleteQuestionServiceImpl implements neueduexam.HXBservice.DeleteQuestionService {

	@Autowired
	questionMapper questionMapper;
	@Autowired
	questionandlibMapper questionandlibMapper;
	@Autowired
	questionlibMapper questionlibMapper;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public int deleteQuestionById(int quesId) {
		
		
		question q = questionMapper.selectByPrimaryKey(quesId);
		
		if(q!=null) {
			
			//找到题目的类型
			String quesType = q.getQuestype();
			
			//在题目表中删除该题库
			questionMapper.deleteByPrimaryKey(quesId);
			
			//找到被操作的题库id
			questionandlibExample qE = new questionandlibExample();
			qE.createCriteria().andQuesidEqualTo(quesId);
			List<questionandlib> list = questionandlibMapper.selectByExample(qE);
			Integer libId = list.get(0).getLibid();
			
			//删除题库题目关联表
			questionandlibMapper.deleteByExample(qE);
			
			//删除题库拥有题目的数量
			int i =0;
			switch(quesType) {
			case "0":
				i = questionlibMapper.deleteSingleNumberBylibId(libId);break;
			case "1":
				i = questionlibMapper.deleteMultipleNumberBylibId(libId);break;
			case "2":
				i = questionlibMapper.deleteJudgeNumberBylibId(libId);break;
			case "3":
				i = questionlibMapper.deleteBlankNumberBylibId(libId);break;
			case "4":
				i = questionlibMapper.deleteAnswerNumberBylibId(libId);break;
			}
			return i;
		}else {
			System.out.println("没有找到");
			return 0;
		}
	}



}
