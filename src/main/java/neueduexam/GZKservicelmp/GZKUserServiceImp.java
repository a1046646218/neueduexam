package neueduexam.GZKservicelmp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neueduexam.DTFservice.QuestionlibService;
import neueduexam.GZKservice.GZKUserService;
import neueduexam.HLservice.QuestionService;
import neueduexam.HXBservice.DeleteQuestionService;
import neueduexam.api.SHAjiamiApi;
import neueduexam.dao.examandquestionMapper;
import neueduexam.dao.exampaperMapper;
import neueduexam.dao.questionMapper;
import neueduexam.dao.questionandlibMapper;
import neueduexam.dao.questionlibMapper;
import neueduexam.dao.recordMapper;
import neueduexam.dao.userMapper;
import neueduexam.dao.userbuylibMapper;
import neueduexam.dao.userhavelibMapper;
import neueduexam.entity.examandquestion;
import neueduexam.entity.examandquestionExample;
import neueduexam.entity.exampaper;
import neueduexam.entity.exampaperExample;
import neueduexam.entity.personexampaper;
import neueduexam.entity.personexampaperExample;
import neueduexam.entity.question;
import neueduexam.entity.questionandlib;
import neueduexam.entity.questionandlibExample;
import neueduexam.entity.questionlib;
import neueduexam.entity.questionlibExample;
import neueduexam.entity.record;
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
	@Autowired
	questionMapper questionmapper;
	@Autowired
	questionandlibMapper questionandlibmapper;
	@Autowired
	exampaperMapper exampapermapper;
	@Autowired
	examandquestionMapper examandquestionmapper;
	@Autowired
	QuestionService questionService;
	@Autowired
	QuestionlibService questionlibService;
	@Autowired
	DeleteQuestionService deleteQuestionService;
	@Autowired
	recordMapper recordmapper;
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
			 ) throws Exception
	 {
		 user user=new user();
		 SHAjiamiApi SHAjiamiApi=new SHAjiamiApi();
		 password =SHAjiamiApi.shaEncode(password);
		 System.out.println(password);
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
		cc.andLibpriceGreaterThan(0);
		cc.andLibnameLike("%"+search+"%");
		List<questionlib> list=questionlibmapper.selectByExample(e);
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getLibprofile().length()>49)
			{
			list.get(i).setLibprofile(list.get(i).getLibprofile().substring(0, 50)+"...");
		
			}
		}
		 return list;
	 }
	 
	 public List<questionlib> selectlistbypro(String search)
	 {
		 questionlibExample e = new questionlibExample();
		 neueduexam.entity.questionlibExample.Criteria cc = e.createCriteria();
		cc.andLibpriceGreaterThan(0);
		cc.andLibprofileLike("%"+search+"%");
		List<questionlib> list=questionlibmapper.selectByExample(e);
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getLibprofile().length()>49)
			{
			list.get(i).setLibprofile(list.get(i).getLibprofile().substring(0, 50)+"...");
		
			}
		}
		 return list;
	 }
	 public List<questionlib> selectlistbytype(String search)
	 {
		questionlibExample e = new questionlibExample();
		neueduexam.entity.questionlibExample.Criteria cc = e.createCriteria();
		cc.andLibpriceGreaterThan(0);
		cc.andLibtypeLike("%"+search+"%");
		List<questionlib> list=questionlibmapper.selectByExample(e);
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getLibprofile().length()>49)
			{
			list.get(i).setLibprofile(list.get(i).getLibprofile().substring(0, 50)+"...");
			}
		}
			
		 return list;
	 }
	 
	 public List<questionlib> selectlist1(int  id)
	 {
		 questionlibExample e = new questionlibExample();
		 neueduexam.entity.questionlibExample.Criteria cc = e.createCriteria();
		 cc.andUseridEqualTo(id);
		 List<questionlib> list=questionlibmapper.selectByExample(e);
		 return list;
	 }
	
	 public List<questionlib> selectlist(int  id)
	 {
		 questionlibExample e = new questionlibExample();
		 neueduexam.entity.questionlibExample.Criteria cc = e.createCriteria();
		cc.andLibpriceGreaterThan(0);
		cc.andLibidEqualTo(id);
		List<questionlib> list=questionlibmapper.selectByExample(e);
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getLibprofile().length()>50)
			{
			list.get(i).setLibprofile(list.get(i).getLibprofile().substring(0, 50)+"...");
			}
		}
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
		 List<question> list=getquestionlistbylibid(questionlib.getLibid());
		 user.setPoints(user.getPoints()-questionlib.getLibprice());
		 int id1=questionlib.getUserid();
		 String name=questionlib.getNickname();
		 int point=questionlib.getLibprice();
		 usermapper.updateByPrimaryKeySelective(user);
		 user u=usermapper.selectByPrimaryKey(questionlib.getUserid());
		 u.setPoints(u.getPoints()+questionlib.getLibprice());
		 usermapper.updateByPrimaryKeySelective(u);
		 userbuylib userbuylib=new userbuylib();
		 userbuylib.setLibid(questionlib.getLibid());
		 userbuylib.setUserid(user.getUserid());
		 userbuylibmapper.insert(userbuylib);
		 questionlib.setNumofpurchases(questionlib.getNumofpurchases()+1);
		 questionlibmapper.updateByPrimaryKey(questionlib);
		 int id=questionlibService.createQL(questionlib, user);
		 for(int i=0;i<list.size();i++)
		 {
	     question q=new question();
	     q=list.get(i);
	     q.setQuesid(null);
		 questionService.addquestion(q);
		 questionandlib questionandlib=new questionandlib();
		 questionandlib.setLibid(id);
		 questionandlib.setQuesid(q.getQuesid());
		 questionandlibmapper.insertSelective(questionandlib);
		 }
		 record record=new record();
		 record.setBuyerid(user.getUserid());
		 record.setBuyername(user.getNickname());
		 record.setSellerid(id1);
		 record.setSellername(name);
		 record.setCost(point);
		 record.setGoodsname("购买题库");
		 Date date=new Date();
		 record.setDate(date);
		 recordmapper.insertSelective(record);
		 return 1;
		 
	 }
	 
	 public List<question> getquestionlistbylibid(Integer libid)
	 {
		 
		    List<question> queslist = new ArrayList<>();
		    
			
		    questionandlibExample E  = new questionandlibExample();
			neueduexam.entity.questionandlibExample.Criteria cc = E.createCriteria();
			cc.andLibidEqualTo(libid);
			List<questionandlib> li = questionandlibmapper.selectByExample(E);
			for(int i=0;i<li.size();i++) {
				queslist.add(questionmapper.selectByPrimaryKey(li.get(i).getQuesid()));
			}
			return queslist;
	 }
	 
	 public List<question> getquestionlistbyquesid(String[] s)
	 {
		 List<question> queslist = new ArrayList<>();
		 for(int i=0;i<s.length;i++) {
				queslist.add(questionmapper.selectByPrimaryKey(Integer.parseInt(s[i])));
			}
		 return queslist;
	 }
	 
	 public int insertexampaper(user user,int single,
				int mul,int jud,int tian,int jian,String examname,
				String examprotype,String examprofile) {
		 exampaper exampaper=new exampaper();
		 exampaperExample exampaperExample=new exampaperExample();
		 exampaper.setEnickname(user.getNickname());
		 exampaper.setEuserid(user.getUserid());
		 exampaper.setExamname(examname);
		 exampaper.setExamprofile(examprofile);
		 exampaper.setExamtype(examprotype);
		 exampaper.setNumofanswer(jian);
		 exampaper.setNumofblank(tian);
		 exampaper.setNumofjudge(jud);
		 exampaper.setNumofmultiple(mul);
		 exampaper.setNumofsingle(single);
		 exampaper.setNumofquestions(single+mul+jud+tian+jian);
		 exampapermapper.insertSelective(exampaper);
		 List<exampaper> list=exampapermapper.selectByExample(exampaperExample);
		 int max=1;
		 for(int i=0;i<list.size();i++)
		 {
			 if(max<list.get(i).getExamid())
			 {
				 max=list.get(i).getExamid();
			 }
		 }
		 return max;
	 }
	 
	 public int insertexamquestion(String[] ID,String[] fen,int max) 
	 {
		 examandquestion examandquestion=new examandquestion();
		 for(int i=0;i<ID.length;i++)
		 {
			 examandquestion.setExamid(max);
			 examandquestion.setQuesid(Integer.parseInt(ID[i]));
			 examandquestion.setQuesscore(Integer.parseInt(fen[i]));
			 examandquestionmapper.insertSelective(examandquestion);
		 }
		 return 1;
	 }
	 
	 public int delquestion(String ID[],int libid) 
	 {
		 int a=0;
		 for(int i=0;i<ID.length;i++)
		 { 
			 deleteQuestionService.deleteQuestionById(Integer.parseInt(ID[i]));
		 }
		 return a;
	 }
	
	
}
