package neueduexam.HLcontroller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import neueduexam.HLservice.PersonExampaperService;
import neueduexam.HLservice.PersonquestionService;
import neueduexam.entity.personexampaper;
import neueduexam.entity.personquestion;

@RestController
public class UpdateperexampaperAjaxController {

	@Autowired
	PersonExampaperService personexampaperservice;
	@Autowired
	PersonquestionService personquestionservice;
	@RequestMapping("/updateperexampaperAjax")
	public int updateperexampaperAjax(int pexamid,HttpServletRequest req,HttpServletResponse res) {
		personexampaper perexampaper=new personexampaper();
		int totalscore=0;
		List<personquestion> perqueslist=personquestionservice.getperqueslistbypexamid(pexamid);
		
		 for(int i=0;i<perqueslist.size();i++)
		{
			totalscore+=perqueslist.get(i).getStuscore();
		}
		String state="已评分";
		perexampaper.setPexamid(pexamid);
		perexampaper.setScore(totalscore);
		perexampaper.setState(state);
		int i=personexampaperservice.updateByPrimaryKeySelective(perexampaper);
		System.out.println(totalscore+"ooooook");
		
		return i;
	}
}
