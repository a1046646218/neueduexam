package neueduexam.DTFservice;

import java.util.HashMap;
import java.util.List;

import neueduexam.entity.questionlib;

public interface QuestionlibService {
	public List<questionlib> getquestionlibByid(int userid);
	public HashMap<String,Integer> geteasyNumByid(int libid);
}
