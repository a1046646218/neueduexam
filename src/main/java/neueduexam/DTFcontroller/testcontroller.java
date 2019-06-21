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
	
	@RequestMapping("/test111")
	public String test111(HttpServletRequest res) {
		user user = userservice.getuserbyid(1);
		res.getSession().setAttribute("user", user);
		return "teacherhasexam";
	}
	@RequestMapping("/test222")
	public String test222(HttpServletRequest res) {
		user user = userservice.getuserbyid(4);
		res.getSession().setAttribute("user", user);
		return "studenthome";
	}
	@RequestMapping("/group")
	public String group(int groupid,HttpServletRequest resq) {
		user user = userservice.getuserbyid(3);
		resq.getSession().setAttribute("user", user);
		resq.setAttribute("groupid", groupid);
		System.out.println(groupid);
		return "chatandhomework";
	}
	
}
