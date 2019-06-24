package neueduexam.MJcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import neueduexam.MJservice.UserInformationService;
import neueduexam.entity.user;

@Controller
public class UserInformationController {

	@Autowired
	UserInformationService userservice;
	
	@RequestMapping("/totestcode")
	public String totestcode() {
		return "testcodemj";
	}
	@RequestMapping("/home")
	public String mojiaohome() {
		return "mojiaohome";
	}

	@RequestMapping("/updateByUserId")
	public String updateByUserId(HttpServletRequest request,HttpServletResponse response,user user) {
		user u = (user)request.getSession().getAttribute("user");
		u.setNickname(user.getNickname());
		u.setRealname(user.getRealname());
		u.setIdentitycard(user.getIdentitycard());
		u.setEmail(user.getEmail());
		u.setPhone(user.getPhone());
		u.setProfile(user.getProfile());
		user.setUserid(u.getUserid());
		request.getSession().setAttribute("user", u);
		userservice.updateByUserId(user);
		System.out.println(user.getProfile()+"    ==========");
//		userService.updateByUserId(user);
		return "studenthome";
	}
	
}
