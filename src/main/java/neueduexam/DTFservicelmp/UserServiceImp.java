package neueduexam.DTFservicelmp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neueduexam.DTFservice.UserService;
import neueduexam.dao.recordMapper;
import neueduexam.dao.userMapper;
import neueduexam.entity.record;
import neueduexam.entity.recordExample;
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

	@Override
	public List<record> getDayRecord(int i) {
		recordExample e = new recordExample();
		neueduexam.entity.recordExample.Criteria cc = e.createCriteria();
		cc.andDateBetween(getDateString(i-1), getDateString(i));
		List<record> list = recordmapper.selectByExample(e);
		return list;
	}
	
	public static Date getDateString(int i) {
		Date date=new Date();//取时间
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		calendar.add(calendar.DATE,i);//把日期往后增加一天.整数往后推,负数往前移动
		date=calendar.getTime(); //这个时间就是日期往后推一天的结果 
		return date;
	}

	@Override
	public List<record> getNowRecord(int i) {
		recordExample e = new recordExample();
		neueduexam.entity.recordExample.Criteria cc = e.createCriteria();
		cc.andRecordidGreaterThan(i);
		List<record> li = recordmapper.selectByExample(e);
		return li;
	}
}