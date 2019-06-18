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
		return "studentalreadyexam";
	}
	
}
