package neueduexam.HXBcontroller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {
	
	@RequestMapping("/toinvitation")
	public String toIntivation(int testid,HttpServletRequest res) {
		res.setAttribute("testid", testid);
		return "invitation";
	}
	
	@RequestMapping("/totestsituation")
	public String toIntivation2(int testid,HttpServletRequest res) {
		res.setAttribute("testid", testid);
		return "testSituation";
	}
	
	
	@RequestMapping("/toautocreateExamLib")
	public String toAutoCreateExamLib() {
		return "autoCreateExamLib";
	}
	@RequestMapping("/toStuCheckQuestionLib")
	public String toCheckQuestionLib(int libid,HttpServletRequest res) {
		res.setAttribute("libid", libid);
		return "StucheckQuestionLib";
	}
	
	@RequestMapping("/toTeaCheckQuestionLib")
	public String toTeaCheckQuestionLib(int libid,HttpServletRequest res) {
		res.setAttribute("libid", libid);
		return "TeaCheckQuestionLib";
	}
	
	
	@RequestMapping("/toGuanLiYuan")
	public String toGuanLiYuan() {
		return "1";
	}
	@RequestMapping("/toCheckIllegalQuestion")
	public String toCheckIllegalQuestion() {
		return "minganci";
	}

}
