package neueduexam.DTFservicelmp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neueduexam.DTFservice.UserService;
import neueduexam.dao.recordMapper;
import neueduexam.dao.userMapper;
import neueduexam.entity.record;
import neueduexam.entity.user;
import neueduexam.entity.userExample;
import neueduexam.entity.userExample.Criteria;

@Service
public class UserServiceImp implements UserService{

	@Autowired
	userMapper usermapper;
	@Autowired
	recordMapper recordmapper;
	
	public List<user> getbyidexmaple(int i){
		userExample e =new userExample();
		Criteria cc = e.createCriteria();
		cc.andTypeEqualTo("老师");
		List<user> li = usermapper.selectByExample(e);
		return li;
	}

	@Override
	public user getuserbyid(int i) {
		user u = usermapper.selectByPrimaryKey(i);
		System.out.println(u.getEmail());
		return u;
	}

	@Override
	public int UserBuyScore(int userid,int score,String content) {
		user user = usermapper.selectByPrimaryKey(userid);
		user u = new user();
		u.setUserid(userid);
		u.setPoints(user.getPoints()+score);
		int i = usermapper.updateByPrimaryKeySelective(u);
		record rec = new record();
		rec.setBuyerid(userid);
		rec.setBuyername(user.getNickname());
		rec.setCost(score/10);
		rec.setSellerid(-1);
		rec.setSellername("官方");
		rec.setDate(new Date());
		rec.setGoodsname("用户积分");
		rec.setOther1(content);
		int insert = recordmapper.insert(rec);
		return insert;
	}
}