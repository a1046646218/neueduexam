package neueduexam.MJcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import neueduexam.MJservice.InvitationCodeService;

@Controller
public class InvitationCodeController {
	@Autowired
	InvitationCodeService invitationcodeService;
	@RequestMapping("/totestcode")
	public String updateByUserId(HttpServletRequest request,HttpServletResponse response,
			       int studentid,String invitecode) {
		
		
		return null;
		
	}
	

}
