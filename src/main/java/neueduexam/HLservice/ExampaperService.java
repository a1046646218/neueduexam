package neueduexam.HLservice;

import java.util.List;

import neueduexam.entity.exampaper;
import neueduexam.entity.question;

public interface ExampaperService {

	  public exampaper selectByPrimaryKey(Integer examid);
	  public List<question> getquestionlistbyexamid(Integer examid);
	 /* public List<Integer> get scorelistbyexamid(Integer examid);*/
	  
}
