package neueduexam.DTFservicelmp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neueduexam.DTFservice.TestPaperService;
import neueduexam.dao.examandquestionMapper;
import neueduexam.dao.questionMapper;
import neueduexam.dao.testpaperMapper;
import neueduexam.entity.examandquestion;
import neueduexam.entity.examandquestionExample;
import neueduexam.entity.question;
import neueduexam.entity.questionandlibExample;
import neueduexam.entity.testpaper;
import neueduexam.entity.testpaperExample;
import neueduexam.entity.testpaperExample.Criteria;

@Service
public class TestPaperServiceImp implements TestPaperService{
	
	
	@Autowired
	testpaperMapper testpapermapper;
	@Autowired
	questionMapper questionmapper;
	@Autowired
	examandquestionMapper examandquestionmapper;
	
	@Override
	public List<testpaper> gettestPaperbyID(int userid) {
		testpaperExample e = new testpaperExample();
		Criteria cc = e.createCriteria();
		cc.andUseridEqualTo(userid);
		List<testpaper> list = testpapermapper.selectByExample(e);
		return list;
	}

	@Override
	public List<question> getquestionlistbyTestid(int testid) {
		testpaper ex = testpapermapper.selectByPrimaryKey(testid);
		List<question> list = new ArrayList<>();
		if(ex!=null) {
			examandquestionExample E = new examandquestionExample();
			neueduexam.entity.examandquestionExample.Criteria cc = E.createCriteria();
			cc.andExamidEqualTo(ex.getExamid());
			List<examandquestion> li = examandquestionmapper.selectByExample(E);
			for(int i=0;i<li.size();i++) {
				list.add(questionmapper.selectByPrimaryKey(li.get(i).getQuesid()));
			}
			return list;
		}
		
		return list;
	}

	@Override
	public int createandgetID(testpaper testpaper) {
		testpapermapper.insertandgetID(testpaper);
		return testpaper.getTestid();
	}
	
	
}
