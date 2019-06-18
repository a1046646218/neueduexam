package neueduexam.HXBcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import neueduexam.HXBservice.InvitationService;
import neueduexam.HXBservice.TestPaperService;

@RestController
public class JsonController {
	
	@Autowired
	InvitationService invitationService;
	

	
	@RequestMapping("/invitationJson")
	public String getInvitationJson(String testId) {
		String json = invitationService.selectInvitationByTestId("1");
		return json;
	}
	
	@RequestMapping("/getTestName")
	public String getTestName(String testId) {
		
		return null;
	}
}
