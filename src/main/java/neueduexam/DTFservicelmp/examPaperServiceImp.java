package neueduexam.DTFservicelmp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neueduexam.DTFservice.ExamPaperService;
import neueduexam.dao.exampaperMapper;
import neueduexam.entity.exampaper;
import neueduexam.entity.exampaperExample;
import neueduexam.entity.exampaperExample.Criteria;

@Service
public class examPaperServiceImp implements ExamPaperService{

	@Autowired
	exampaperMapper exampapermapper;

	@Override
	public List<exampaper> getexampaperListbyuserid(int userid) {
		exampaperExample e = new exampaperExample();
		Criteria cc = e.createCriteria();
		cc.andEuseridEqualTo(userid);
		List<exampaper> list = exampapermapper.selectByExample(e);
		return list;
	} 
	
	
}
