package neueduexam.GZKservicelmp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neueduexam.GZKservice.GZKUserService;
import neueduexam.dao.questionlibMapper;
import neueduexam.dao.userMapper;
import neueduexam.dao.userbuylibMapper;
import neueduexam.dao.userhavelibMapper;
import neueduexam.entity.personexampaper;
import neueduexam.entity.personexampaperExample;
import neueduexam.entity.questionlib;
import neueduexam.entity.questionlibExample;
import neueduexam.entity.user;
import neueduexam.entity.userExample;
import neueduexam.entity.userbuylib;
import neueduexam.entity.userExample.Criteria;
import neueduexam.entity.userbuylibExample;
import neueduexam.entity.userhavelib;
@Service
public class GZKUserServiceImp implements GZKUserService {
	@Autowired
	userMapper usermapper;
	@Autowired
	questionlibMapper questionlibmapper;
	@Autowired
	userbuylibMapper userbuylibmapper;
	@Autowired
	userhavelibMapper userhavelibmapper;
	public List<user> login(String phone)
	{
		userExample e = new userExample();
		Criteria cc = e.createCriteria();
		cc.andPhoneEqualTo(phone);
		List<user> list=usermapper.selectByExample(e);
		return list;
	}
	public List<user> identity(String identityCard)
	{
		userExample e = new userExample();
		Criteria cc = e.createCriteria();
		cc.andIdentitycardEqualTo(identityCard);
		List<user> list=usermapper.selectByExample(e);
		return list;
	}
	 public int register(String phone,String password,
			 String realName,String identityCard,String nickName,
			 String email
			 )
	 {
		 user user=new user();
		 user.setPhone(phone);
		 user.setPassword(password);
		 user.setRealname(realName);
		 user.setIdentitycard(identityCard);
		 user.setNickname(nickName);
		 user.setEmail(email);
		 user.setNumofquestions(0);
		 user.setAccuracy("0");
		 user.setPoints(0);
		 user.setHeadphoto("static/assets/img/avatar.jpg");
		 user.setType("学生");
		 return usermapper.insertSelective(user);
	 }
	 public List<questionlib> selectlist(String search)
	 {
		 questionlibExample e = new questionlibExample();
		 neueduexam.entity.questionlibExample.Criteria cc = e.createCriteria();
		cc.andLibpriceGreaterThan(-1);
		cc.andLibnameLike("%"+search+"%");
		List<questionlib> list=questionlibmapper.selectByExample(e);
		 return list;
	 }
	 public List<questionlib> selectlist(int  id)
	 {
		 questionlibExample e = new questionlibExample();
		 neueduexam.entity.questionlibExample.Criteria cc = e.createCriteria();
		cc.andLibpriceGreaterThan(-1);
		cc.andLibidEqualTo(id);
		List<questionlib> list=questionlibmapper.selectByExample(e);
		 return list;
	 }
	 public List<userbuylib> selectByid(int id)
	 {
		 userbuylibExample e=new userbuylibExample();
		 neueduexam.entity.userbuylibExample.Criteria cc = e.createCriteria();
		 cc.andUseridEqualTo(id);
		 List<userbuylib> list= userbuylibmapper.selectByExample(e);
		 return list;
	 }
	 public int buy(user user,questionlib questionlib)
	 {
		 user.setPoints(user.getPoints()-questionlib.getLibprice());
		 usermapper.updateByPrimaryKeySelective(user);
		 userbuylib userbuylib=new userbuylib();
		 userbuylib.setLibid(questionlib.getLibid());
		 userbuylib.setUserid(user.getUserid());
		 userbuylibmapper.insert(userbuylib);
		 questionlib.setNumofpurchases(questionlib.getNumofpurchases()+1);
		 questionlibmapper.updateByPrimaryKey(questionlib);
		 userhavelib userhavelib=new userhavelib();
		 userhavelib.setLibid(questionlib.getLibid());
		 userhavelib.setUserid(user.getUserid());
		 return userhavelibmapper.insertSelective(userhavelib);
	 }
}
