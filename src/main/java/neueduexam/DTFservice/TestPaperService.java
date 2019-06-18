package neueduexam.DTFservice;

import java.util.HashMap;
import java.util.List;

import neueduexam.entity.question;
import neueduexam.entity.testpaper;

public interface TestPaperService {
	public List<testpaper> gettestPaperbyID(int userid);
	public List<question> getquestionlistbyTestid(int testid);
}
