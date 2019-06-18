package neueduexam.DTFservicelmp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neueduexam.DTFservice.QuestionlibService;
import neueduexam.dao.questionMapper;
import neueduexam.dao.questionandlibMapper;
import neueduexam.dao.questionlibMapper;
import neueduexam.entity.question;
import neueduexam.entity.questionandlib;
import neueduexam.entity.questionandlibExample;
import neueduexam.entity.questionlib;
import neueduexam.entity.questionlibExample;
import neueduexam.entity.questionlibExample.Criteria;

@Service
public class QuestionlibServiceImp implements QuestionlibService{
	
	@Autowired
	questionlibMapper questionlibmapper;
	@Autowired
	questionandlibMapper questionandlibmapper; 
	@Autowired
	questionMapper questionmapper; 
	
	@Override
	public List<questionlib> getquestionlibByid(int userid) {
		questionlibExample e = new questionlibExample();
		Criteria cc = e.createCriteria();
		cc.andUseridEqualTo(userid);
		List<questionlib> list = questionlibmapper.selectByExample(e);
		return list;
	}

	@Override
	public HashMap<String,Integer> geteasyNumByid(int libid) {
		questionandlibExample eql = new questionandlibExample();
		neueduexam.entity.questionandlibExample.Criteria cc = eql.createCriteria();
		cc.andLibidEqualTo(libid);
		List<questionandlib> all = questionandlibmapper.selectByExample(eql);
		HashMap<String,Integer> li = new HashMap<String,Integer>();
		li.put("e1", 0);
		li.put("e2", 0);
		li.put("e3", 0);
		for(int i=0;i<all.size();i++) {
			question q = questionmapper.selectByPrimaryKey(all.get(i).getQuesid());
			if("简单".equals(q.getDifficulty())) {
				li.put("e1", li.get("e1")+1);
			}else if("中等".equals(q.getDifficulty())) {
				li.put("e2", li.get("e2")+1);
			}else {
				li.put("e3", li.get("e3")+1);
			}
		}
		return li;
	}
	
}
