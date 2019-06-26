package neueduexam.DTFcontroller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import neueduexam.DTFservice.ExamPaperService;
import neueduexam.DTFservice.TestPaperService;
import neueduexam.entity.exampaper;
import neueduexam.entity.personexampaper;
import neueduexam.entity.question;
import neueduexam.entity.testpaper;
import neueduexam.entity.user;

@RestController
public class teacherExamAjaxController {
	
	@Autowired
	ExamPaperService exampaperservice;  
	@Autowired
	TestPaperService testpaperservice;
	
	@RequestMapping("/getexampaperAjaxDTF")
	public List<exampaper> getexampaperAjaxDTF(int page,HttpServletRequest resq,HttpServletResponse res){
		user u = (user)resq.getSession().getAttribute("user");
		List<exampaper> alllist = exampaperservice.getexampaperListbyuserid(u.getUserid());
		List<exampaper> list = new ArrayList<exampaper>();
		for(int i=(page-1)*4;i<alllist.size()&&i<(page-1)*4+4;i++) {
			list.add(alllist.get(i));
		}
		System.out.println(list.size());
		return list;
	}
	
	@RequestMapping("/gettestpapaerAjaxDTF")
	public List<testpaper> gettestpapaerAjaxDTF(int page,HttpServletRequest resq,HttpServletResponse res){
		user u = (user)resq.getSession().getAttribute("user");
		List<testpaper> alllist = testpaperservice.gettestPaperbyID(u.getUserid());
		List<testpaper> list = new ArrayList<testpaper>();
		for(int i=(page-1)*4;i<alllist.size()&&i<(page-1)*4+4;i++) {
			list.add(alllist.get(i));
		}
		System.out.println(list.size());
		return list;
	}
	
	@RequestMapping("/gettesteasynumAjaxDTF")
	public HashMap<String,List<Integer>> gettesteasynum(int testid){
		List<question> list = testpaperservice.getquestionlistbyTestid(testid);
		HashMap<String,List<Integer>> map = new HashMap<>();
		ArrayList<Integer> single = new ArrayList();
		ArrayList<Integer> mul = new ArrayList();
		ArrayList<Integer> jud = new ArrayList();
		ArrayList<Integer> tian = new ArrayList();
		ArrayList<Integer> jian = new ArrayList();
		for(int i=0;i<4;i++) {
			single.add(0);
			mul.add(0);
			jud.add(0);
			tian.add(0);
			jian.add(0);
		}
		for(int i=0;i<list.size();i++) {
			if("0".equals(list.get(i).getQuestype())) {
				single.set(0, single.get(0)+1);
				if("简单".equals(list.get(i).getDifficulty())) {
					single.set(1, single.get(1)+1);
				}else if("中等".equals(list.get(i).getDifficulty())){
					single.set(2, single.get(2)+1);
				}else {
					single.set(3, single.get(3)+1);
				}
			}else if("1".equals(list.get(i).getQuestype())) {
				mul.set(0, mul.get(0)+1);
				if("简单".equals(list.get(i).getDifficulty())) {
					mul.set(1, mul.get(1)+1);
				}else if("中等".equals(list.get(i).getDifficulty())){
					mul.set(2, mul.get(2)+1);
				}else {
					mul.set(3, mul.get(3)+1);
				}
			}else if("2".equals(list.get(i).getQuestype())) {
				jud.set(0, jud.get(0)+1);
				if("简单".equals(list.get(i).getDifficulty())) {
					jud.set(1, jud.get(1)+1);
				}else if("中等".equals(list.get(i).getDifficulty())){
					jud.set(2, jud.get(2)+1);
				}else {
					jud.set(3, jud.get(3)+1);
				}
			}else if("3".equals(list.get(i).getQuestype())) {
				tian.set(0, tian.get(0)+1);
				if("简单".equals(list.get(i).getDifficulty())) {
					tian.set(1, tian.get(1)+1);
				}else if("中等".equals(list.get(i).getDifficulty())){
					tian.set(2, tian.get(2)+1);
				}else {
					tian.set(3, tian.get(3)+1);
				}
			}else if("4".equals(list.get(i).getQuestype())) {
				jian.set(0, jian.get(0)+1);
				if("简单".equals(list.get(i).getDifficulty())) {
					jian.set(1, jian.get(1)+1);
				}else if("中等".equals(list.get(i).getDifficulty())){
					jian.set(2, jian.get(2)+1);
				}else {
					jian.set(3, jian.get(3)+1);
				}
			}
		}
		map.put("single", single);
		map.put("mul", mul);
		map.put("jud", jud);
		map.put("tian", tian);
		map.put("jian", jian);
		return map;
	}
	
	
	@RequestMapping("/shead")
	public void test2222(String img) {
		System.out.println(img);
	}
}
