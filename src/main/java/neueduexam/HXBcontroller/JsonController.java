package neueduexam.HXBcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import neueduexam.HXBservice.ExamLibService;
import neueduexam.HXBservice.InvitationService;
import neueduexam.HXBservice.TestSituationService;
@RestController
public class JsonController {
	
	@Autowired
	InvitationService invitationService;
	@Autowired
	TestSituationService testSituationService;
	@Autowired
	ExamLibService examLibService;

	
	@RequestMapping("/invitationJson")
	public String getInvitationJson(String testId) {
		//测试
		String json = invitationService.selectInvitationByTestId("1");
		return json;
	}
	
	@RequestMapping("/testSituationJson")
	public String getTestSituationJson(String testId) {
		//测试
		String json = testSituationService.selectTestSituationByTestId("1");
		return json;
	}
	@RequestMapping("/examLibNameJson")
	public String getExamLibNameJson(String userId) {
		//测试
		String json = examLibService.selectSimpleExamlibByUserId("1");
		return json;
	}
	
}
