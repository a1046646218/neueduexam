package neueduexam.DTFcontroller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import neueduexam.queue.Produce;



@RestController
public class ActiveMqController1 {

	@Autowired
	Produce produce;
	
//	@RequestMapping("/getquestionandscore")
//	public void test1(ModelAndView view ,int testid) throws Exception{
//		produce.send(view,testid);
//	}

}
