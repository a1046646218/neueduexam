package neueduexam.HLservicelmp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neueduexam.HLservice.QuestionService;
import neueduexam.HLservice.QuestionlibService;
import neueduexam.dao.questionlibMapper;
import neueduexam.entity.questionlib;

@Service
public class QuestionlibServiceImpl implements QuestionlibService  {

	@Autowired
	questionlibMapper questionlibmapper;
	
	@Override
	public questionlib selectByPrimaryKey(Integer libid) {
		questionlib questionlib=questionlibmapper.selectByPrimaryKey(libid);
		return questionlib;
	}

	@Override
	public int updateByPrimaryKeySelective(questionlib qlib) {
		int j=questionlibmapper.updateByPrimaryKeySelective(qlib);
		return j;
	}

}
