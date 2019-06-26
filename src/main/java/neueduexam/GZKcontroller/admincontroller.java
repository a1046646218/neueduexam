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
		List<question> single1 =new ArrayList<>();
		List<question> mul1 = new ArrayList<>();
		List<question> jud1 = new ArrayList<>();
		List<question> tian1 = new ArrayList<>();
		List<question> jian1 = new ArrayList<>();
		List<question> single2 =new ArrayList<>();
		List<question> mul2 = new ArrayList<>();
		List<question> jud2 = new ArrayList<>();
		List<question> tian2 = new ArrayList<>();
		List<question> jian2 = new ArrayList<>();
		List<question> list11=new ArrayList<>();
		List<question> list22=new ArrayList<>();
		for(int i=0;i<list1.size();i++)
		{
			for(int j =0;j<list2.size();j++)
			{
				if(StringsameApi.string_same(list1.get(i).getQuescontext(),list2.get(j).getQuescontext())>0.5)
				{
					list11.add(list1.get(i));
					list22.add(list2.get(j));
				}
			}
		}
		if(list11.size()>0) {
			System.out.println(list11.get(0).getQuescontext());
			for(int i=0;i<list11.size();i++) {
				if("0".equals(list11.get(i).getQuestype())) {
					System.out.println("加入选择题");
					single1.add(list11.get(i));
					System.out.println(single1.size());
					System.out.println(single1.get(i).getQuescontext());
					
				}else if("1".equals(list11.get(i).getQuestype())) {
					mul1.add(list11.get(i));
					
				}else if("2".equals(list11.get(i).getQuestype())) {
					jud1.add(list11.get(i));
					
				}else if("3".equals(list11.get(i).getQuestype())) {
					tian1.add(list11.get(i));
					
				}else if("4".equals(list11.get(i).getQuestype())) {
					jian1.add(list11.get(i));
					
				}
			}
			map.put("single1", single1);
			map.put("mul1", mul1);
			map.put("jud1", jud1);
			map.put("tian1", tian1);
			map.put("jian1", jian1);
		}
		if(list22.size()>0) {
			System.out.println(list22.get(0).getQuescontext());
			for(int i=0;i<list22.size();i++) {
				if("0".equals(list22.get(i).getQuestype())) {
					System.out.println("加入选择题");
					single2.add(list22.get(i));
					System.out.println(single2.size());
					System.out.println(single2.get(i).getQuescontext());
					
				}else if("1".equals(list22.get(i).getQuestype())) {
					mul2.add(list22.get(i));
					
				}else if("2".equals(list22.get(i).getQuestype())) {
					jud2.add(list22.get(i));
					
				}else if("3".equals(list22.get(i).getQuestype())) {
					tian2.add(list22.get(i));
					
				}else if("4".equals(list22.get(i).getQuestype())) {
					jian2.add(list22.get(i));
					
				}
			}
			map.put("single2", single2);
			map.put("mul2", mul2);
			map.put("jud2", jud2);
			map.put("tian2", tian2);
			map.put("jian2", jian2);
		}
		return map;
	
	}
    @RequestMapping("/getquestionlibGZK")
	@ResponseBody
	public List<questionlib> getquestionlibAjax(int page,HttpServletRequest resq){
		
		
		List<questionlib> alllist= userservice.selectlist("");
		List<questionlib> list = new ArrayList<questionlib>();
		for(int i=(page-1)*6;i<alllist.size()&&i<(page-1)*6+6;i++) {
			list.add(alllist.get(i));
		}
		System.out.println("多少题库"+list.size());
		return list;
	
	}
}
