package neueduexam.HLservicelmp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neueduexam.HLservice.ExampaperService;
import neueduexam.dao.examandquestionMapper;
import neueduexam.dao.exampaperMapper;
import neueduexam.dao.questionMapper;
import neueduexam.dao.questionandlibMapper;
import neueduexam.entity.examandquestion;
import neueduexam.entity.examandquestionExample;
import neueduexam.entity.exampaper;
import neueduexam.entity.question;

@Service
public class ExampaperServiceImpl implements ExampaperService {

	@Autowired
	exampaperMapper exampapermapper;
	@Autowired
	questionMapper questionmapper;
	@Autowired
	examandquestionMapper examandquestionmapper;
	
	@Override
	public exampaper selectByPrimaryKey(Integer examid) {
		
        exampaper exampaper=exampapermapper.selectByPrimaryKey(examid);
		return exampaper;
	}

	@Override
	public List<question> getquestionlistbyexamid(Integer examid) {
		
		    List<question> queslist = new ArrayList<>();
		    
		
			examandquestionExample E = new examandquestionExample();
			neueduexam.entity.examandquestionExample.Criteria cc = E.createCriteria();
			cc.andExamidEqualTo(examid);
			List<examandquestion> li = examandquestionmapper.selectByExample(E);
			for(int i=0;i<li.size();i++) {
				queslist.add(questionmapper.selectByPrimaryKey(li.get(i).getQuesid()));
			}
			return queslist;
	}
/*
	@Override
	public List<Integer> getscorelistbyexamid(Integer examid) {
		List<Integer> scorelist = new ArrayList<>();
		examandquestionExample E = new examandquestionExample();
		neueduexam.entity.examandquestionExample.Criteria cc = E.createCriteria();
		cc.andExamidEqualTo(examid);
		List<examandquestion> li = examandquestionmapper.selectByExample(E);
		for(int i=0;i<li.size();i++) {
			scorelist.add(li.get(i).getQuesscore());
		}
		return scorelist;
	}*/

}
