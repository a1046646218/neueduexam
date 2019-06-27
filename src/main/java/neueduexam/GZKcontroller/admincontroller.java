package neueduexam.GZKcontroller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import neueduexam.DTFservice.QuestionlibService;
import neueduexam.GZKservice.GZKUserService;
import neueduexam.api.StringsameApi;
import neueduexam.entity.question;
import neueduexam.entity.questionlib;
import neueduexam.entity.user;
@RestController
public class admincontroller {
	@Autowired
	QuestionlibService questionlibservice;
    @Autowired
    GZKUserService userservice;
   
    @RequestMapping("/getquestionliblistAjax")
	@ResponseBody
	public HashMap<String,List<question>> getquestionliblistAjax(HttpServletRequest resq,int libid1,int libid2){
		StringsameApi StringsameApi=new StringsameApi();
		List<question> list1= userservice.getquestionlistbylibid(libid1);
		List<question> list2= userservice.getquestionlistbylibid(libid2);
		HashMap<String,List<question>> map = new HashMap<>();
		List<question> single =new ArrayList<>();
		List<question> mul = new ArrayList<>();
		List<question> jud = new ArrayList<>();
		List<question> tian = new ArrayList<>();
		List<question> jian = new ArrayList<>();
		List<question> list11=new ArrayList<>();
		for(int i=0;i<list1.size();i++)
		{
			for(int j =0;j<list2.size();j++)
			{
				if(StringsameApi.string_same(list1.get(i).getQuescontext(),list2.get(j).getQuescontext())>0.6)
				{
		

					list11.add(list1.get(i));
					break;
				}
			}
		}
		if(list11.size()>0) {
			System.out.println(list11.get(0).getQuescontext());
			for(int i=0;i<list11.size();i++) {
				if("0".equals(list11.get(i).getQuestype())) {
					System.out.println("加入选择题");
					single.add(list11.get(i));
					System.out.println(single.size());
					System.out.println(single.get(i).getQuescontext());
					
				}else if("1".equals(list11.get(i).getQuestype())) {
					mul.add(list11.get(i));
					
				}else if("2".equals(list11.get(i).getQuestype())) {
					jud.add(list11.get(i));
					
				}else if("3".equals(list11.get(i).getQuestype())) {
					tian.add(list11.get(i));
					
				}else if("4".equals(list11.get(i).getQuestype())) {
					jian.add(list11.get(i));
					
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
    @RequestMapping("/getquestionlibGZK")
	@ResponseBody
	public List<questionlib> getquestionlibGZK(int page,HttpServletRequest resq){
		
		
		List<questionlib> alllist= userservice.selectlist("");
		List<questionlib> list = new ArrayList<questionlib>();
		for(int i=(page-1)*6;i<alllist.size()&&i<(page-1)*6+6;i++) {
			list.add(alllist.get(i));
		}
		System.out.println("多少题库"+list.size());
		return list;
	
	}
	
	    @RequestMapping("/getquestionlibidGZK")
		@ResponseBody
		public List<questionlib> getquestionlibidGZK(HttpServletRequest resq){
			
			int libid1=Integer.parseInt(resq.getParameter("libid1"));
			int libid2=Integer.parseInt(resq.getParameter("libid2"));
			List<questionlib> list= userservice.selectlist(libid1);
			List<questionlib> list2= userservice.selectlist(libid2);
			list.add(list2.get(0));
			return list;
		
		}
		
		@RequestMapping("/delquestionGZK")
		@ResponseBody
		public void delquestionGZK(HttpServletRequest req,String[] ID1,String[] ID2,int libid1,int libid2){
			if(ID1!=null)
			{
			userservice.delquestion(ID1, libid1);
			}
			if(ID2!=null)
			{
			userservice.delquestion(ID2, libid2);
			}
		 	
		}
		
}
