package neueduexam.HLcontroller;




import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import neueduexam.HLservice.QuestionService;
import neueduexam.HLservice.QuestionandlibService;
import neueduexam.HLservice.QuestionlibService;
import neueduexam.entity.question;
import neueduexam.entity.questionandlib;
import neueduexam.entity.questionlib;

@Controller
public class AddquestionController {
	
	@Autowired
	QuestionService questionservice;
	
	@Autowired
	QuestionlibService questionlibservice;
	
	@Autowired
	QuestionandlibService questionandlibservice;
	
	@RequestMapping("/addquestion")
	public void addquestion(HttpServletRequest req,HttpServletResponse resp) throws Exception{
		System.out.println("进入");
		question question=new question();
		Integer libid=2;
		questionlib questionlib=questionlibservice.selectByPrimaryKey(libid);//前端获得题库id
		questionandlib questionandlib=new questionandlib();
		questionandlib.setLibid(libid);
		
		Integer quesamount=questionlib.getQuesamount();
		System.out.print(quesamount);
		
		String tag=req.getParameter("tag");
		String questype=req.getParameter("quesType");
		String quescontext=req.getParameter("quesContext");
		String analysis=req.getParameter("analysis");
		String difficulty=req.getParameter("difficulty");
		
		question.setTag(tag);
        question.setQuestype(questype);	
        question.setQuescontext(quescontext);
        question.setAnalysis(analysis);
        question.setDifficulty(difficulty);  
        
		System.out.println("标签："+tag+"题型："+questype
		+"题干："+quescontext+"难度："+difficulty+"分析："+analysis);
		
		if("0".equals(questype)||"1".equals(questype)||"3".equals(questype)) {
			String quesanswer=req.getParameter("quesAnswer");
			
			System.out.println("答案"+quesanswer);
			
			
			if("0".equals(questype)||"1".equals(questype)) {
				String a=req.getParameter("A");
				String b=req.getParameter("B");
				String c=req.getParameter("C");
				String d=req.getParameter("D");
				System.out.println("选项："+a+b+c+d);	
				
				question.setA(a);
				question.setB(b);
				question.setC(c);
				question.setD(d);
				//单选
				if("0".equals(questype)) {
					
					Integer numofsingle=questionlib.getNumofsingle();
					numofsingle=numofsingle+1;
					questionlib.setNumofsingle(numofsingle);
					System.out.println("题库中填空数目"+numofsingle);
					
				}
				//多选
				else {
					Integer numofmultiple=questionlib.getNumofmultiple();
					numofmultiple=numofmultiple+1;
					questionlib.setNumofsingle(numofmultiple);
					System.out.println("题库中填空数目"+numofmultiple);
					
				}
			}	
			//填空
			else {
				Integer numofblank=questionlib.getNumofblank();
				numofblank=numofblank+1;
			    questionlib.setNumofblank(numofblank);
			    System.out.println("题库中填空数目"+numofblank);
			}
			   question.setQuesanswer(quesanswer);  
		}
		//判断
		else if("2".equals(questype)) {
			String judgequesanswer=req.getParameter("judgequesAnswer");
			Integer numofjudge=questionlib.getNumofjudge();
			System.out.println("判断题数目"+numofjudge);
			numofjudge=numofjudge+1;
			System.out.println("答案"+judgequesanswer+"判断题数目"+numofjudge);
			
			question.setQuesanswer(judgequesanswer);
			questionlib.setNumofjudge(numofjudge);
		}
		
		//简答
		else if ("4".equals(questype)) {
			String answerquesAnswer=req.getParameter("answerquesAnswer");
			Integer numofanswer=questionlib.getNumofanswer();
			numofanswer=numofanswer+1;
			System.out.println("答案"+answerquesAnswer);
			
			question.setQuesanswer(answerquesAnswer);
			questionlib.setNumofanswer(numofanswer);
		}
		//添加题目
	   int k= questionservice.addquestion(question);
	   Integer quesid=question.getQuesid();
	   System.out.println("主键值"+quesid);
	   
		//更新题库
			quesamount=quesamount+1;
			System.out.println(quesamount);
			questionlib.setQuesamount(quesamount);
			int i=questionlibservice.updateByPrimaryKeySelective(questionlib);
		//添加关系表
			questionandlib.setQuesid(quesid);
			int j=questionandlibservice.insertSelective(questionandlib);
			
			
			if(k>0&&j>0&&i>0) {
			resp.getWriter().println("success");
				
			}
			 else {
					resp.getWriter().println("error");
					System.out.println("error");
				
				}
			
		
	}

	
	
}
