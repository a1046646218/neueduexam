package neueduexam.HLcontroller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import neueduexam.HLservice.ExampaperService;
import neueduexam.entity.question;

@RestController
public class SelectqueslistAjaxController {

	@Autowired
	ExampaperService exampaperservice;  
	
	@RequestMapping("/selectqueslistAjax")
	public HashMap<String,List<question>> selectqueslistAjax(int examid){
		List<question> list = exampaperservice.getquestionlistbyexamid(examid);
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
}
