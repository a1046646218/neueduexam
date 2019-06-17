package neueduexam.HXBcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {
	
	@RequestMapping("/invitationJson")
	public String getInvitationJson(String testId) {
		
		return null;
	}
}
