package neueduexam.HXBcontroller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import neueduexam.HXBservice.ExamLibService;
import neueduexam.HXBservice.InvitationService;
import neueduexam.HXBservice.QuestionLibService;
import neueduexam.HXBservice.TestSituationService;
@RestController
public class JsonController {
	
	@Autowired
	InvitationService invitationService;
	@Autowired
	TestSituationService testSituationService;
	@Autowired
	ExamLibService examLibService;
	@Autowired
	QuestionLibService questionLibService;
	
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
	
	@RequestMapping("/questionNumberJson")
	public String getKindsOfQuestionJson(@RequestBody List<Integer> ids){
		for(int i:ids)
			System.out.println(i);
		String json = questionLibService.selectNumOfQuestionsByLibList(ids);
		System.out.println(json);
		return json;
	}
	
}
