package neueduexam.HLservice;

import neueduexam.entity.questionlib;

public interface QuestionlibService {

	 questionlib selectByPrimaryKey(Integer libid);
	 int updateByPrimaryKeySelective(questionlib q);
}
