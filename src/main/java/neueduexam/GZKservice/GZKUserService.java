package neueduexam.GZKservice;

import java.util.List;

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
		 );
List<questionlib> selectlist(String search);
List<questionlib> selectlist(int  id);
List<userbuylib> selectByid(int id);
int buy(user user,questionlib questionlib);
}