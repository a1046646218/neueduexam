package neueduexam.DTFservicelmp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neueduexam.DTFservice.homeService;
import neueduexam.dao.homeworkMapper;
import neueduexam.entity.homework;
import neueduexam.entity.homeworkExample;
import neueduexam.entity.homeworkExample.Criteria;

@Service
public class homeServiceImp implements homeService{

	@Autowired
	homeworkMapper homeworkmapper;

	@Override
	public List<homework> gethomeworklistbygroupid(int groupid) {
		homeworkExample e = new homeworkExample();
		Criteria cc = e.createCriteria();
		cc.andGroupidEqualTo(groupid);
		List<homework> list = homeworkmapper.selectByExample(e);
		return list;
	}

	@Override
	public int addhomework(int groupid, String content) {
		homework hw = new homework();
		hw.setContent(content);
		hw.setGroupid(groupid);
		Date date = new Date();
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		hw.setHwdate(sdf.format(date));
		int insert = homeworkmapper.insert(hw);
		return insert;
	}
	
}
