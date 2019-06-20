package neueduexam.HLservicelmp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neueduexam.HLservice.ExampaperService;
import neueduexam.HLservice.PersonExampaperService;
import neueduexam.dao.personexampaperMapper;
import neueduexam.entity.personexampaper;
@Service
public class PersonExampaperServiceImpl implements PersonExampaperService {
	@Autowired
	personexampaperMapper personexampapermapper;
	@Override
	public personexampaper selectByPrimaryKey(Integer pexamid) {
		personexampaper personexampaper=personexampapermapper.selectByPrimaryKey(pexamid);
		return null;
	}

}
