package neueduexam.HLcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import neueduexam.HLservice.PersonExampaperService;
import neueduexam.entity.exampaper;
import neueduexam.entity.personexampaper;



@RestController
public class SelectnotalreadytestpaperAjaxService {

	@Autowired
	PersonExampaperService personexampaperservice;
	

	@RequestMapping("/selenotalreadypaperAjax")
	public personexampaper selenotalreadypaperAjax(int pexamid,HttpServletRequest req,HttpServletResponse res) {
		  // int exampaperid=Integer.valueOf(req.getParameter("exampaperid"));
		    System.out.println(pexamid);
		    personexampaper pexampaper=personexampaperservice.selectByPrimaryKey(pexamid);
			System.out.println("试卷名"+pexampaper.getStunickname());
			return  pexampaper;
}
}
