package neueduexam.DTFservicelmp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neueduexam.DTFservice.testhomeService;
import neueduexam.dao.examandquestionMapper;
import neueduexam.dao.exampaperMapper;
import neueduexam.dao.invitationMapper;
import neueduexam.dao.personexampaperMapper;
import neueduexam.dao.personquestionMapper;
import neueduexam.dao.questionMapper;
import neueduexam.dao.testpaperMapper;
import neueduexam.entity.examandquestion;
import neueduexam.entity.examandquestionExample;
import neueduexam.entity.exampaper;
import neueduexam.entity.invitation;
import neueduexam.entity.invitationExample;
import neueduexam.entity.invitationExample.Criteria;
import neueduexam.entity.personexampaper;
import neueduexam.entity.personquestion;
import neueduexam.entity.question;
import neueduexam.entity.testpaper;

@Service
public class testhomeServiceImp implements testhomeService{

	@Autowired
	testpaperMapper testpapermapper; 
	@Autowired
	exampaperMapper exampapermapper;
	@Autowired
	questionMapper questionmapper;
	@Autowired
	examandquestionMapper examandquestionmapper;
	@Autowired
	personexampaperMapper personexampapermapper;  
	@Autowired
	personquestionMapper personquestionmapper;
	@Autowired
	invitationMapper invitationmapper; 
	
	
	@Override
	public List<question> getquestionList(int testid) {
		testpaper tp = testpapermapper.selectByPrimaryKey(testid);
		List<question> queslist = new ArrayList<>();
		examandquestionExample E = new examandquestionExample();
		neueduexam.entity.examandquestionExample.Criteria cc = E.createCriteria();
		cc.andExamidEqualTo(tp.getExamid());
		List<examandquestion> li = examandquestionmapper.selectByExample(E);
		for(int i=0;i<li.size();i++) {
			queslist.add(questionmapper.selectByPrimaryKey(li.get(i).getQuesid()));
		}
		return queslist;
	}

	@Override
	public List<examandquestion> getscoreList(int testid) {
		testpaper tp = testpapermapper.selectByPrimaryKey(testid);
		List<question> queslist = new ArrayList<>();
		examandquestionExample E = new examandquestionExample();
		neueduexam.entity.examandquestionExample.Criteria cc = E.createCriteria();
		cc.andExamidEqualTo(tp.getExamid());
		List<examandquestion> li = examandquestionmapper.selectByExample(E);
		return li;
	}

	@Override
	public testpaper gettestmsg(int testid) {
		testpaper tp = testpapermapper.selectByPrimaryKey(testid);
		return tp;
	}

	@Override
	public int insertpersonpaper(personexampaper pex) {
		int i = personexampapermapper.insertandgetkey(pex);
		return pex.getPexamid();
	}

	@Override
	public int insertpersonquestion(personquestion pq) {
		return personquestionmapper.insert(pq);
	}

	@Override
	public int updataState(int testid,int userid) {
		invitationExample E = new invitationExample();
		Criteria cc = E.createCriteria();
		cc.andStudentidEqualTo(userid);
		cc.andTestidEqualTo(testid);
		invitation in = new invitation();
		in.setState(Integer.toString(1));
		invitationmapper.updateByExampleSelective(in, E);
		return 1;
	}
	
}
