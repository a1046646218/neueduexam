package neueduexam.DTFservice;

import java.util.List;

import neueduexam.entity.examandquestion;
import neueduexam.entity.personexampaper;
import neueduexam.entity.personquestion;
import neueduexam.entity.question;
import neueduexam.entity.testpaper;

public interface testhomeService {
	public List<question> getquestionList(int testid);
	public List<examandquestion> getscoreList(int testid);
	public testpaper gettestmsg(int testid);
	public int insertpersonpaper(personexampaper pex);
	public int insertpersonquestion(personquestion pq);
	public int updataState(int testid,int userid);
}
