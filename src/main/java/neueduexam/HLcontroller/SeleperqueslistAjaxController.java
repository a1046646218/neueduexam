package neueduexam.HLcontroller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import neueduexam.HLservice.PersonquestionService;
import neueduexam.HLservice.QuestionService;
import neueduexam.entity.personquestion;
import neueduexam.entity.question;

@RestController
public class SeleperqueslistAjaxController {
	
	@Autowired
	PersonquestionService personquestionservice;
	@Autowired
	QuestionService questionservice;
	
	@RequestMapping("/seleperqueslistAjax")
	public HashMap<String,allquestion> seleperqueslistAjax(int pexamid){

		HashMap<String,allquestion> map = new HashMap<>();
		allquestion single=new allquestion();
		allquestion mul=new allquestion();
		allquestion jud=new allquestion();
		allquestion tian=new allquestion();
		allquestion jian=new allquestion();
		
		List<question> singlequeslist=new ArrayList<>();
		List<personquestion> singleperqueslist=new ArrayList<>();
		int singletotalscore=0;
		int multotalscore=0;
		int judtotalscore=0;
		int tiantotalscore=0;
		int jiantotalscore=0;
		List<question> mulqueslist=new ArrayList<>();
		List<personquestion> mulperqueslist=new ArrayList<>();
		List<question> judqueslist=new ArrayList<>();
		List<personquestion> judperqueslist=new ArrayList<>();
		List<question> tianqueslist=new ArrayList<>();
		List<personquestion> tianperqueslist=new ArrayList<>();
		List<question> jianqueslist=new ArrayList<>();
		List<personquestion> jianperqueslist=new ArrayList<>();
		
		System.out.println("考卷id"+pexamid);
		List<personquestion> perqueslist=personquestionservice.getperqueslistbypexamid(pexamid);
		List<question> queslist = new ArrayList<>();
		if(perqueslist.size()>0) {
		System.out.println("得到考题list"+perqueslist.size());
		 for(int i=0;i<perqueslist.size();i++)
		   {
			int quesid=perqueslist.get(i).getQuesid();
			System.out.println("对应的题目id"+quesid);
		    question question=questionservice.selectByPrimaryKey(quesid);
		    queslist.add(question);
		   }
		     if(queslist.size()>0) {
	    	   for(int j=0;j<queslist.size();j++) {
	    		   if("0".equals(queslist.get(j).getQuestype())) {
						System.out.println("加入单选题");
						singletotalscore+=perqueslist.get(j).getStuscore();
						singlequeslist.add(queslist.get(j));
						singleperqueslist.add(perqueslist.get(j));
						
					}
	    		   else if("1".equals(queslist.get(j).getQuestype())) {
						System.out.println("加入多选题");
						multotalscore+=perqueslist.get(j).getStuscore();
						mulqueslist.add(queslist.get(j));
						mulperqueslist.add(perqueslist.get(j));
						
					}
	    		   else if("2".equals(queslist.get(j).getQuestype())) {
						System.out.println("加入判断题");
						judtotalscore+=perqueslist.get(j).getStuscore();
						judqueslist.add(queslist.get(j));
						judperqueslist.add(perqueslist.get(j));
						
					}
	    		   else if("3".equals(queslist.get(j).getQuestype())) {
						System.out.println("加入填空题");
						tiantotalscore+=perqueslist.get(j).getStuscore();
						tianqueslist.add(queslist.get(j));
						tianperqueslist.add(perqueslist.get(j));
						
					}
	    		   else if("4".equals(queslist.get(j).getQuestype())) {
						System.out.println("加入简答题");
						jiantotalscore+=perqueslist.get(j).getStuscore();
						jianqueslist.add(queslist.get(j));
						jianperqueslist.add(perqueslist.get(j));
						
					}
	    		   
	    	  }
	    	   single.setQueslist(singlequeslist);;
			   single.setPerqueslist(singleperqueslist);
			   single.setTotalscore(singletotalscore);
			   mul.setQueslist(mulqueslist);
			   mul.setPerqueslist(mulperqueslist);
			   mul.setTotalscore(multotalscore);
			   jud.setQueslist(judqueslist);
			   jud.setPerqueslist(judperqueslist);
			   jud.setTotalscore(judtotalscore);
			   tian.setQueslist(tianqueslist);
			   tian.setPerqueslist(tianperqueslist);
			   tian.setTotalscore(tiantotalscore);
			   jian.setQueslist(jianqueslist);
			   jian.setPerqueslist(jianperqueslist);
			   jian.setTotalscore(jiantotalscore);
			   
	    	    map.put("single", single);
				map.put("mul", mul);
				map.put("jud", jud);
				map.put("tian", tian);
				map.put("jian", jian);
	      }
		     
		}	
		return map;
	}
}
