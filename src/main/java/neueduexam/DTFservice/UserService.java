package neueduexam.DTFservice;

import java.util.List;

import org.springframework.stereotype.Service;

import neueduexam.entity.user;

public interface UserService {
	public List<user> getbyidexmaple(int i);
	public user getuserbyid(int i);
	public int UserBuyScore(int userid,int score,String content);
}