package neueduexam.MJcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import neueduexam.MJservice.ChangePasswordService;
import neueduexam.entity.user;

@RestController
public class ChangePasswordController{
	@Autowired
	ChangePasswordService changepasswordservice;
	@RequestMapping("/changePassword")
	public int  updatePassword(HttpServletRequest request,String password){
		user u = (user)request.getSession().getAttribute("user");
		int i = changepasswordservice.updatePassword(u.getUserid(),password);
		return i;
	}
}
