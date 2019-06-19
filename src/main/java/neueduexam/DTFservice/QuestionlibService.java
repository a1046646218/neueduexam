package neueduexam.DTFservice;

import java.util.HashMap;
import java.util.List;

import neueduexam.entity.questionlib;
import neueduexam.entity.user;

public interface QuestionlibService {
	public List<questionlib> getquestionlibByid(int userid);
	public HashMap<String,Integer> geteasyNumByid(int libid);
	public int createQuestionlib(String clibname,String clibtype,String clibpro,user u);
	public int removeQuestionlib(user u,int libid);
	public int changesalelib(int libid,int point);
}
