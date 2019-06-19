package neueduexam.DTFcontroller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import neueduexam.DTFservice.UserService;
import neueduexam.entity.user;

@RestController
public class UserControllerAjaxDTF {
	
	@Autowired
	UserService userservice; 
	
	@RequestMapping("/ispasswordtrue")
	public String ispasswordtrue(String pass,HttpServletRequest resq) {
		user u = (user)resq.getSession().getAttribute("user");
		if(u.getPassword().equals(pass)) {
			return "1";
		}else {
			return "0";
		}
	}
	
	@RequestMapping("/addpaypoint")
	public String addpaypoint(String price,String content,HttpServletRequest resq) {
		user u = (user)resq.getSession().getAttribute("user");
		int i = 0;
		if("0.1".equals(price)) {
			i = userservice.UserBuyScore(u.getUserid(),100,content);
		}else {
			i = userservice.UserBuyScore(u.getUserid(),500,content);
		}
		return Integer.toString(i);
		
	}
}
