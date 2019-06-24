package neueduexam.HLservicelmp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neueduexam.HLservice.QuestionService;
import neueduexam.dao.questionMapper;
import neueduexam.dao.questionandlibMapper;
import neueduexam.dao.questionlibMapper;
import neueduexam.entity.question;
import neueduexam.entity.questionExample;
@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	questionMapper questionmapper;
	
	@Autowired
	questionlibMapper questionlibmapper;
	
	@Autowired
	questionandlibMapper questionandlibmapper;
	
	@Override
	public int addquestion(question q) {
		
		int i=questionmapper.insertSelectandgetid(q);
		return i;
	}

	@Override
	public question selectByPrimaryKey(Integer quesid) {
		  question question=questionmapper.selectByPrimaryKey(quesid);
		  return question;
	}


	
		
	
	

}
