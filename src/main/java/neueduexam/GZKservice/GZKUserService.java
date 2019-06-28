package neueduexam.GZKservice;

import java.util.List;

import neueduexam.entity.exampaper;
import neueduexam.entity.question;
import neueduexam.entity.questionlib;
import neueduexam.entity.questionlibExample;
import neueduexam.entity.user;
import neueduexam.entity.userbuylib;
import neueduexam.entity.userbuylibExample;

public interface GZKUserService {
 List<user> login(String phone);
 List<user> identity(String identityCard);
 int register(String phone,String password,
		 String realName,String identityCard,String nickName
		 ,String email
		 )throws Exception;
List<questionlib> selectlist(String search);
List<questionlib> selectlistbytype(String search);
List<questionlib> selectlist(int  id);
List<userbuylib> selectByid(int id);
int buy(user user,questionlib questionlib);
public List<question> getquestionlistbylibid(Integer libid);
public List<question> getquestionlistbyquesid(String[] s);
public int insertexampaper(user user,int single,
		int mul,int jud,int tian,int jian,String examname,
		String examprotype,String examprofile);
public int insertexamquestion(String[] ID,String[] fen,int max); 
public int delquestion(String ID[],int libid);
public List<questionlib> selectlist1(int  id);
public List<questionlib> selectlistbypro(String search);
}
