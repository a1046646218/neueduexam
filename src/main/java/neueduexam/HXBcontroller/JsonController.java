package neueduexam.HXBcontroller;

import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import neueduexam.HXBservice.CreateExamPaperService;
import neueduexam.HXBservice.ExamLibService;
import neueduexam.HXBservice.HxbUserService;
import neueduexam.HXBservice.InvitationService;
import neueduexam.HXBservice.QuestionLibService;
import neueduexam.HXBservice.SelectQuestionListService;
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
	@Autowired
	CreateExamPaperService createExamService;
	@Autowired
	SelectQuestionListService selectQuestionListService;
	@Autowired
	HxbUserService userService;
	
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
	
	@RequestMapping("/createTestPaperJson")
	public String createTestPaperJson(@RequestBody ExamData examData) {
		
		System.out.println(examData.toString());
		//test
		int userId = 1;
		examData.setUserId(userId);
		 createExamService.createExamPaper(examData);
		return "ok";
	}	
	@RequestMapping("/getQuestionListJson")
	public String getQuestionListJson(int libId,String quesType) {
		String json = selectQuestionListService.getQuestionList(libId, quesType);
		System.out.println(json);
		return json;
	}
	@RequestMapping("/test99")
	public String test() {
		String json = selectQuestionListService.getQuestionList(1, "0"); 
		System.out.println(json);
		return json;
	}
	@RequestMapping("/getUserListJson")
	public String getUserListJson() {
		//System.out.println("哈哈");
		String json = userService.getUserList();
		System.out.println(json);
		return json;
	}
	@RequestMapping("/updateStudentType")
	public int updateStudentType(Integer userId,String type) {
		Integer result = userService.updateStudent(userId,type);
		System.out.println(result);
		return result;
	}
	
}
