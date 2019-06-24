package neueduexam.HLcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import neueduexam.HLservice.PersonquestionService;
import neueduexam.entity.personquestion;

@RestController
public class UpdateperquesAjaxController {
	@Autowired
	PersonquestionService personquestionservice;
	@RequestMapping("/updateperquesAjax")
	public int updateperquesAjax(int perquesid,int stuscore,HttpServletRequest req,HttpServletResponse resp) throws Exception{
		
		String state;
		if(stuscore>0) {
			state="对";
		}
		else {
			state="错";
		}
		
		
		personquestion perquestion=new personquestion();
		perquestion.setPerquesid(perquesid);
		perquestion.setStuscore(stuscore);
		perquestion.setPerquesstate(state);
        int i=personquestionservice.updateByPrimaryKeySelective(perquestion);
        if(i>0) {
        	System.out.println("ok");
        }
		return i;
	}

}
