package neueduexam.HLservicelmp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neueduexam.HLservice.PersonquestionService;
import neueduexam.dao.personquestionMapper;
import neueduexam.entity.personquestion;
import neueduexam.entity.personquestionExample;

@Service
public class PersonquestionServiceImpl implements PersonquestionService {
	
	@Autowired
	personquestionMapper personquestionmapper;
	@Override
	public List<personquestion> getperqueslistbypexamid(Integer pexamid) {
		 List<personquestion> perqueslist = new ArrayList<>();
		 
		 personquestionExample E=new personquestionExample();
		 neueduexam.entity.personquestionExample.Criteria cc = E.createCriteria();
		 cc.andPexamidEqualTo(pexamid);
		 
		 perqueslist=personquestionmapper.selectByExample(E);
		return perqueslist;
		
	}
	@Override
	public int updateByPrimaryKeySelective(personquestion perques) {
		int i=personquestionmapper.updateByPrimaryKeySelective(perques);
		return i;
	}

}
