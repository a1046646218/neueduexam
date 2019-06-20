package neueduexam.DTFcontroller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import neueduexam.DTFservice.TestPaperService;
import neueduexam.entity.testpaper;
import neueduexam.entity.user;

@RestController
public class testpaperControllerDTF {
	
	@Autowired
	TestPaperService testpaperservice;
	
	@RequestMapping("/createtestajaxDTF")
	public String createtestajaxDTF(testpaper testpaper,HttpServletRequest resq) {
		user u = (user)resq.getSession().getAttribute("user");
		testpaper.setUserid(u.getUserid());
		int i = testpaperservice.createandgetID(testpaper);
		resq.getSession().setAttribute("addtestidexcel_"+Integer.toString(u.getUserid()), i);
		return Integer.toString(i);
	}
}
