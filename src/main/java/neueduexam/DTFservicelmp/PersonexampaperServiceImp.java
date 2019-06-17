package neueduexam.DTFservicelmp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neueduexam.DTFservice.PersonexampaperService;
import neueduexam.dao.personexampaperMapper;
import neueduexam.entity.personexampaper;
import neueduexam.entity.personexampaperExample;
import neueduexam.entity.personexampaperExample.Criteria;

@Service
public class PersonexampaperServiceImp implements PersonexampaperService{
	
	@Autowired
	personexampaperMapper personexampapermapper;

	@Override
	public List<personexampaper> getAlreadyPaperByUserID(int i) {
		personexampaperExample e = new personexampaperExample();
		Criteria cc = e.createCriteria();
		cc.andStateEqualTo("已评分");
		cc.andStuidEqualTo(i);
		List<personexampaper> list = personexampapermapper.selectByExample(e);
		return list;
	}

	@Override
	public List<personexampaper> getNotAlreadyPaperByUserID(int i) {
		personexampaperExample e = new personexampaperExample();
		Criteria cc = e.createCriteria();
		cc.andStateEqualTo("未评分");
		cc.andStuidEqualTo(i);
		List<personexampaper> list = personexampapermapper.selectByExample(e);
		return list;
	}
	
}
