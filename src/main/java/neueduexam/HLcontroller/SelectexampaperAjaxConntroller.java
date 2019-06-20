package neueduexam.HLcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import neueduexam.HLservice.ExampaperService;
import neueduexam.entity.exampaper;

@RestController
public class SelectexampaperAjaxConntroller {
	@Autowired
	ExampaperService exampaperservice;
	
	@RequestMapping("/selectexampaperAjax")
	public exampaper selectexampaperAjax(int exampaperid,HttpServletRequest req,HttpServletResponse res) {
		  // int exampaperid=Integer.valueOf(req.getParameter("exampaperid"));
		    System.out.println(exampaperid);
		    exampaper exampaper=exampaperservice.selectByPrimaryKey(exampaperid);
			System.out.println("试卷名"+exampaper.getExamname());
			return  exampaper;
}
}
