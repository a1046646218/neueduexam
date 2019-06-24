package neueduexam.HLcontroller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import neueduexam.HLservice.ExampaperService;
import neueduexam.entity.examandquestion;
import neueduexam.entity.question;

@RestController
public class SelequesandscorelistController {

	@Autowired
	ExampaperService exampaperservice;  
	
	@RequestMapping("/selequesandscorelistAjax")
	public HashMap<String,List<quesandscore>> selequesandscorelistAjax(int examid){
		HashMap<String,List<quesandscore>> map = new HashMap<>();
		List<question> qlist = exampaperservice.getquestionlistbyexamid(examid);		
		List<examandquestion> slist =exampaperservice.getscoreList(examid);
		
		List<quesandscore> single =new ArrayList<>();
		List<quesandscore> mul = new ArrayList<>();
		List<quesandscore> jud = new ArrayList<>();
		List<quesandscore> tian = new ArrayList<>();
		List<quesandscore> jian = new ArrayList<>();
		
		if(qlist.size()>0) {
			System.out.println(qlist.get(0).getQuescontext());
			for(int i=0;i<qlist.size();i++) {
				if("0".equals(qlist.get(i).getQuestype())) {
					quesandscore quseandscore=new quesandscore();
					quseandscore.setQues(qlist.get(i));
					quseandscore.setEandq(slist.get(i));
					single.add(quseandscore);	
				  }
				else if("1".equals(qlist.get(i).getQuestype())) {
					quesandscore quseandscore=new quesandscore();
					quseandscore.setQues(qlist.get(i));
					quseandscore.setEandq(slist.get(i));
					mul.add(quseandscore);
					
				}else if("2".equals(qlist.get(i).getQuestype())) {
					quesandscore quseandscore=new quesandscore();
					quseandscore.setQues(qlist.get(i));
					quseandscore.setEandq(slist.get(i));
					jud.add(quseandscore);
					
				}else if("3".equals(qlist.get(i).getQuestype())) {
					quesandscore quseandscore=new quesandscore();
					quseandscore.setQues(qlist.get(i));
					quseandscore.setEandq(slist.get(i));
					tian.add(quseandscore);
					
				}else if("4".equals(qlist.get(i).getQuestype())) {
					quesandscore quseandscore=new quesandscore();
					quseandscore.setQues(qlist.get(i));
					quseandscore.setEandq(slist.get(i));
					jian.add(quseandscore);
					
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

