package neueduexam.DTFcontroller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import neueduexam.DTFservice.UserService;
import neueduexam.entity.user;

@Controller
public class testcontroller {
	
	
	@Autowired
	UserService userservice;
	
	@RequestMapping("/group")
	public String group(int groupid,HttpServletRequest resq) {
		resq.setAttribute("groupid", groupid);
		System.out.println(groupid);
		return "chatandhomework";
	}
	@RequestMapping("/testhome")
	public String testhome(int testid,HttpServletRequest res) {
		user user = userservice.getuserbyid(3);
		res.getSession().setAttribute("user", user);
		res.setAttribute("testid", testid);
		return "testhomeHL";
	}
}
