package neueduexam.DTFcontroller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import neueduexam.DTFservice.QuestionlibService;
import neueduexam.entity.personexampaper;
import neueduexam.entity.questionlib;
import neueduexam.entity.user;

@RestController
public class QuestionAjaxController {
	@Autowired
	QuestionlibService questionlibservice;
	
	
	@RequestMapping("/getquestionlibAjaxControllerDTF")
	public List<questionlib> getquestionlibAjaxControllerDTF(int page,HttpServletRequest resq,HttpServletResponse res){
		user u = (user)resq.getSession().getAttribute("user");
		List<questionlib> alllist = questionlibservice.getquestionlibByid(u.getUserid());
		List<questionlib> list = new ArrayList<questionlib>();
		for(int i=(page-1)*8;i<alllist.size()&&i<(page-1)*8+8;i++) {
			list.add(alllist.get(i));
		}
		System.out.println("多少题库"+list.size());
		return list;
	
	}
	
	@RequestMapping("/getEasyNumAjaxControllerDTF")
	public HashMap<String, Integer> getEasyNumAjaxControllerDTF(int libnum,HttpServletRequest resq,HttpServletResponse res){
		HashMap<String, Integer> list = questionlibservice.geteasyNumByid(libnum);
		return list;
	}
	
	@RequestMapping("/createlibAjaxDTF")
	public String createlibAjaxDTF(String clibname,String clibtype,String clibpro,HttpServletRequest resq){
		//System.out.println(clibname+clibtype+clibpro);
		user u = (user)resq.getSession().getAttribute("user");
		questionlibservice.createQuestionlib(clibname, clibtype, clibpro, u);
		return "1";
	}
	@RequestMapping("/removelibAjaxDTF")
	public String removelibAjaxDTF(int libid,HttpServletRequest resq){
		//System.out.println(clibname+clibtype+clibpro);
		user u = (user)resq.getSession().getAttribute("user");
		int i = questionlibservice.removeQuestionlib(u,libid);
		return Integer.toString(i);
	}
	
	@RequestMapping("/changesalepoint")
	public String changesalepoint(int libnum,int text,HttpServletRequest resq){
		//System.out.println(clibname+clibtype+clibpro);
		user u = (user)resq.getSession().getAttribute("user");
		int i = questionlibservice.changesalelib(libnum, text);
		return Integer.toString(i);
	}
}
