package neueduexam.weConnectionController;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import neueduexam.entity.user;

@Controller
public class wewinConnect {
	@RequestMapping("/home")
	public String mojiaohome() {
		return "mojiaohome";
	}
	@RequestMapping("/loginoutMJ")
	public String loginoutMJ(HttpServletRequest res) {
		System.out.println("ss");
		res.getSession().removeAttribute("user");
		return "redirect:tologin";
	}
	@RequestMapping("/getinpeoplehome")
	public String getinpeoplehome(HttpServletRequest res) {
		user u = (user)res.getSession().getAttribute("user");
		if("学生".equals(u.getType())) {
			return "studentalreadyexamHL";
		}else {
			return "teacherhasexam";
		}
	}
	@RequestMapping("/tostudenthome")
	public String tostudenthome() {
		return "studenthome";
	}
	@RequestMapping("/toteacherhome")
	public String teacherhome() {
		return "teacherhome";
	}
	@RequestMapping("/toteacherpayrecord")
	public String tostudentpayrecord() {
		return "teacherpayrecord";
	}
}
