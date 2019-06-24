package neueduexam.HLcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import neueduexam.HLservice.TestpaperService;
import neueduexam.entity.testpaper;

@RestController
public class SeletestpaperAjaxController {
 
	@Autowired
	TestpaperService testpaperservice;
	
	@RequestMapping("/seletestpaperAjax")
	public testpaper seletestpaperAjax(int testid,HttpServletRequest req,HttpServletResponse res) {
		    System.out.println(testid);
		    testpaper testpaper=testpaperservice.selectByPrimaryKey(testid);
			System.out.println("试卷名"+testpaper.getTestname());
			return  testpaper;
}
}
