package neueduexam.MJcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import neueduexam.MJservice.InvitationCodeService;
import neueduexam.entity.invitation;
import neueduexam.entity.user;

@RestController
public class InvitationCodeController {
	@Autowired
	InvitationCodeService invitationcodeService;
	@RequestMapping("/toinvitecode")
	public String selectStuidandInvCode(HttpServletRequest request,HttpServletResponse response,
			         String invitecode) {
		
		user u = (user)request.getSession().getAttribute("user");	
		int i = invitationcodeService.selectByExample(u.getUserid(),invitecode);
		System.out.println(i+"========================");
		return Integer.toString(i);
	
	}
	

}
