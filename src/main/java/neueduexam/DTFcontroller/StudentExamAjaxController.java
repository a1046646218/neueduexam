package neueduexam.DTFcontroller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import neueduexam.DTFservice.PersonexampaperService;
import neueduexam.entity.personexampaper;
import neueduexam.entity.user;

@RestController
public class StudentExamAjaxController {
	
	@Autowired
	PersonexampaperService personexampaperservice;
	
	@RequestMapping("/getAlreadyexamAjaxDTF")
	public List<personexampaper> getAlreadyexamAjaxDTF(int page,HttpServletRequest resq,HttpServletResponse res) throws Exception {
		user u = (user)resq.getSession().getAttribute("user");
		List<personexampaper> alllist = personexampaperservice.getAlreadyPaperByUserID(u.getUserid());
		List<personexampaper> list = new ArrayList<personexampaper>();
		for(int i=(page-1)*8;i<alllist.size()&&i<(page-1)*8+8;i++) {
			list.add(alllist.get(i));
		}
		System.out.println(list.size());
		return list;
	}
	
	@RequestMapping("/getNotAlreadyexamAjaxDTF")
	public List<personexampaper> getNotAlreadyexamAjaxDTF(int page,HttpServletRequest resq,HttpServletResponse res) throws Exception {
		user u = (user)resq.getSession().getAttribute("user");
		List<personexampaper> alllist = personexampaperservice.getNotAlreadyPaperByUserID(u.getUserid());
		List<personexampaper> list = new ArrayList<personexampaper>();
		for(int i=(page-1)*8;i<alllist.size()&&i<(page-1)*8+8;i++) {
			list.add(alllist.get(i));
		}
		System.out.println(list.size());
		return list;
	}
	
}
