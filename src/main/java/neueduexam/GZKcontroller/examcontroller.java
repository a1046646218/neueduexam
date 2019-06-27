package neueduexam.GZKcontroller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import neueduexam.DTFservice.QuestionlibService;
import neueduexam.GZKservice.GZKUserService;
import neueduexam.entity.exampaper;
import neueduexam.entity.question;
import neueduexam.entity.questionlib;
import neueduexam.entity.user;

@RestController
public class examcontroller {
	@Autowired
	QuestionlibService questionlibservice;
    @Autowired
    GZKUserService userservice;
    
	@RequestMapping("/getquestionlibAjax")
	@ResponseBody
	public List<questionlib> getquestionlibAjax(HttpServletRequest resq){
		user u = (user)resq.getSession().getAttribute("user");
		List<questionlib> list= userservice.selectlist1(u.getUserid());
		System.out.println("多少题库"+list.size());
		return list;
	
	}
	
	@RequestMapping("/addform")
	@ResponseBody
	public HashMap<String,List<question>> addform(HttpServletRequest resq,String[] quesid){
		List<question> list=userservice.getquestionlistbyquesid(quesid);
		HashMap<String,List<question>> map = new HashMap<>();
		List<question> single =new ArrayList<>();
		List<question> mul = new ArrayList<>();
		List<question> jud = new ArrayList<>();
		List<question> tian = new ArrayList<>();
		List<question> jian = new ArrayList<>();

		
		if(list.size()>0) {
			System.out.println(list.get(0).getQuescontext());
			for(int i=0;i<list.size();i++) {
				if("0".equals(list.get(i).getQuestype())) {
					System.out.println("加入选择题");
					single.add(list.get(i));
					System.out.println(single.size());
					System.out.println(single.get(i).getQuescontext());
					
				}else if("1".equals(list.get(i).getQuestype())) {
					mul.add(list.get(i));
					
				}else if("2".equals(list.get(i).getQuestype())) {
					jud.add(list.get(i));
					
				}else if("3".equals(list.get(i).getQuestype())) {
					tian.add(list.get(i));
					
				}else if("4".equals(list.get(i).getQuestype())) {
					jian.add(list.get(i));
					
				}
			}
			map.put("single", single);
			map.put("mul", mul);
			map.put("jud", jud);
			map.put("tian", tian);
			map.put("jian", jian);
		}
		
		return map;
	
	}
	
	@RequestMapping("/selectlibqueslistAjax")
	@ResponseBody
	public HashMap<String,List<question>> selectlibqueslistAjax(int libid){
		List<question> list= userservice.getquestionlistbylibid(libid);
		/*List<Integer> scorelist = exampaperservice.getscorelistbyexamid(examid);*/
		HashMap<String,List<question>> map = new HashMap<>();
		List<question> single =new ArrayList<>();
		List<question> mul = new ArrayList<>();
		List<question> jud = new ArrayList<>();
		List<question> tian = new ArrayList<>();
		List<question> jian = new ArrayList<>();
		
		if(list.size()>0) {
			System.out.println(list.get(0).getQuescontext());
			for(int i=0;i<list.size();i++) {
				if("0".equals(list.get(i).getQuestype())) {
					System.out.println("加入选择题");
					single.add(list.get(i));
					System.out.println(single.size());
					System.out.println(single.get(i).getQuescontext());
					
				}else if("1".equals(list.get(i).getQuestype())) {
					mul.add(list.get(i));
					
				}else if("2".equals(list.get(i).getQuestype())) {
					jud.add(list.get(i));
					
				}else if("3".equals(list.get(i).getQuestype())) {
					tian.add(list.get(i));
					
				}else if("4".equals(list.get(i).getQuestype())) {
					jian.add(list.get(i));
					
				}
			}
			map.put("single", single);
			map.put("mul", mul);
			map.put("jud", jud);
			map.put("tian", tian);
			map.put("jian", jian);
		}
		return map;
	}
	
	@RequestMapping("/selectpartlibqueslistAjax")
	@ResponseBody
	public HashMap<String,List<question>> selectpartlibqueslistAjax(int libid){
		List<question> list= userservice.getquestionlistbylibid(libid);
		/*List<Integer> scorelist = exampaperservice.getscorelistbyexamid(examid);*/
		HashMap<String,List<question>> map = new HashMap<>();
		List<question> single =new ArrayList<>();
		List<question> mul = new ArrayList<>();
		List<question> jud = new ArrayList<>();
		List<question> tian = new ArrayList<>();
		List<question> jian = new ArrayList<>();
		int singlenum=0;
		int mulnum=0;
		int judnum=0;
		int tiannum=0;
		int jiannum=0;
		if(list.size()>0) {
			System.out.println(list.get(0).getQuescontext());
			for(int i=0;i<list.size();i++) {
				if("0".equals(list.get(i).getQuestype())) {
					if(singlenum<1) {
						singlenum=singlenum+1;
					System.out.println("加入选择题");
					single.add(list.get(i));
					System.out.println(single.size());
					System.out.println(single.get(i).getQuescontext());
					}
				}else if("1".equals(list.get(i).getQuestype())) {
					if(mulnum<1) {
						mulnum=mulnum+1;
					
					mul.add(list.get(i));
					}
				}else if("2".equals(list.get(i).getQuestype())) {
					if(judnum<1)
					{
						judnum=judnum+1;
					jud.add(list.get(i));
					}
				}else if("3".equals(list.get(i).getQuestype())) {
					if(tiannum<1)
					{
						tiannum=tiannum+1;
					tian.add(list.get(i));
					}
				}else if("4".equals(list.get(i).getQuestype())) {
					if(jiannum<1)
					{
						jiannum=jiannum+1;
					jian.add(list.get(i));
					}
				}
			}
			map.put("single", single);
			map.put("mul", mul);
			map.put("jud", jud);
			map.put("tian", tian);
			map.put("jian", jian);
		}
		return map;
	}
	
	@RequestMapping("/addexampaperAjax")
	public exampaper addexampaperAjax(HttpServletRequest req) {
		  // int exampaperid=Integer.valueOf(req.getParameter("exampaperid"));
		    int single=Integer.parseInt(req.getParameter("single"));
	        int mul=Integer.parseInt(req.getParameter("mul"));
	        int jud=Integer.parseInt(req.getParameter("jud"));
	        int tian=Integer.parseInt(req.getParameter("tian"));
	        int jian=Integer.parseInt(req.getParameter("jian"));
	        exampaper exampaper=new exampaper();
	        exampaper.setNumofsingle(single);
	        exampaper.setNumofmultiple(mul);
	        exampaper.setNumofjudge(jud);
	        exampaper.setNumofblank(tian);
	        exampaper.setNumofanswer(jian);
	        exampaper.setNumofquestions(single+mul+jud+tian+jian);
			return  exampaper;
}
	@RequestMapping("/submitexamAjax")
	public String submitexamAjax(HttpServletRequest req,String[] ID,String[] fen) {
		  // int exampaperid=Integer.valueOf(req.getParameter("exampaperid"));
		    int single=Integer.parseInt(req.getParameter("single"));
            int mul=Integer.parseInt(req.getParameter("mul"));
            int jud=Integer.parseInt(req.getParameter("jud"));
            int tian=Integer.parseInt(req.getParameter("tian"));
            int jian=Integer.parseInt(req.getParameter("jian"));
		    user u = (user)req.getSession().getAttribute("user");
		    String examname=req.getParameter("examname");
	        String examprotype=req.getParameter("examprotype");
	        String examprofile=req.getParameter("examprofile");
	        int max=userservice.insertexampaper(u, single, mul, jud, tian, jian, examname, examprotype, examprofile);
	        userservice.insertexamquestion(ID, fen,max);
			return "teacherhasexam";
}
}
