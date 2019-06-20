package neueduexam.HLservicelmp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neueduexam.HLservice.QuestionandlibService;
import neueduexam.HLservice.QuestionlibService;
import neueduexam.dao.questionandlibMapper;
import neueduexam.dao.questionlibMapper;
import neueduexam.entity.questionandlib;

@Service
public class QuestionandlibServiceImpl implements QuestionandlibService{

	@Autowired
	questionandlibMapper questionandlibmapper;
	
	
	@Override
	public int insertSelective(questionandlib qandlib) {
		int i=questionandlibmapper.insertSelective(qandlib);
		return i;
	}
	
}
