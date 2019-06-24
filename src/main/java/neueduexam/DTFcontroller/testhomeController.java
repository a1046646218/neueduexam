package neueduexam.DTFcontroller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONArray;

import neueduexam.DTFservice.UserService;
import neueduexam.DTFservice.testhomeService;
import neueduexam.entity.examandquestion;
import neueduexam.entity.personexampaper;
import neueduexam.entity.personquestion;
import neueduexam.entity.question;
import neueduexam.entity.testpaper;
import neueduexam.entity.user;
import neueduexam.queue.Customer1;

@RestController
public class testhomeController {

	@Autowired
	testhomeService testhomeservice;
	
	@Autowired
	UserService userservice;
	
	@Autowired
	Customer1 customer1;
	
	@RequestMapping("/gettestmsg")
	public testpaper gettestmsg(int testid) {
		return testhomeservice.gettestmsg(testid);
	}
	
	public static question getquestion(List<question> qlist,int quesid) {
		for(int i=0;i<qlist.size();i++) {
			if(qlist.get(i).getQuesid()==quesid) {
				return qlist.get(i);
			}
		}
		return null;
	}
	
	public static examandquestion getscore(List<examandquestion> qlist,int quesid) {
		for(int i=0;i<qlist.size();i++) {
			if(qlist.get(i).getQuesid()==quesid) {
				return qlist.get(i);
			}
		}
		return null;
	}
	
	@RequestMapping("/subimtpaper")
	public int subimtpaper(HttpServletRequest res,String local,int lessdu,String answerlist, int testid,int mycount, String ipaddress, String brower, String os) {
		List<question> qlist = testhomeservice.getquestionList(testid);
		List<examandquestion> slist = testhomeservice.getscoreList(testid);
		testpaper testmsg = testhomeservice.gettestmsg(testid);
		user u  = (user)res.getSession().getAttribute("user");
		List<personquestion> t = JSONArray.parseArray(answerlist, personquestion.class);
		System.out.println(t.size());
		for(int i=0;i<t.size();i++) {
			System.out.println(t.get(i).getStuanswer());
		}
		personexampaper pex = new personexampaper();
		pex.setBrowser(brower);
		pex.setChangeout(mycount);
		pex.setDuration(Integer.toString(testmsg.getCountdown()-lessdu));
		pex.setIpaddress(ipaddress);
		pex.setLocal(local);
		pex.setOperatingsystem(os);
		pex.setState("未评分");
		pex.setStunickname(u.getNickname());
		pex.setStuid(u.getUserid());
		pex.setOther1(testmsg.getTestname());
		pex.setTestid(testid);
		int score = 0;
		System.out.println(brower+ipaddress+local+os+mycount);
		System.out.println(pex.getDuration());
		for(int i=0;i<t.size();i++) {
			question q = getquestion(qlist,t.get(i).getQuesid());
			if("0".equals(q.getQuestype())||"1".equals(q.getQuestype())||"2".equals(q.getQuestype())){
				examandquestion s = getscore(slist, t.get(i).getQuesid());
				if(q.getQuesanswer().equals(t.get(i).getStuanswer())) {
					t.get(i).setPerquesscore(s.getQuesscore());
					t.get(i).setPerquesstate("对");
					t.get(i).setStuscore(s.getQuesscore());
					score += s.getQuesscore();
				}else {
					t.get(i).setPerquesscore(s.getQuesscore());
					t.get(i).setPerquesstate("错");
					t.get(i).setStuscore(0);
				}
			}else {
				examandquestion s = getscore(slist, t.get(i).getQuesid());
				t.get(i).setPerquesscore(s.getQuesscore());
				t.get(i).setPerquesstate("错");
				t.get(i).setStuscore(0);
			}
			
		}
		pex.setScore(score);
		int pexamid = testhomeservice.insertpersonpaper(pex);
		for(int i=0;i<t.size();i++) {
			t.get(i).setPexamid(pexamid);
			t.get(i).setStudentid(u.getUserid());
			testhomeservice.insertpersonquestion(t.get(i));
		}
		testhomeservice.updataState(testid, u.getUserid());
		return 1;
	}

	@RequestMapping("/getquestionandscore")
	public HashMap<String, List<testdecodeEntity>> getquestionandscore(int testid) {
//		List<question> qlist = testhomeservice.getquestionList(testid);
//		List<examandquestion> slist = testhomeservice.getscoreList(testid);
//		List<testdecodeEntity> single = new ArrayList<>();
//		List<testdecodeEntity> mul = new ArrayList<>();
//		List<testdecodeEntity> jud = new ArrayList<>();
//		List<testdecodeEntity> tian = new ArrayList<>();
//		List<testdecodeEntity> jian = new ArrayList<>();
//		for (int i = 0; i < qlist.size(); i++) {
//			System.out.println(qlist.get(i).getQuestype());
//			if ("0".equals(qlist.get(i).getQuestype())) {
//				testdecodeEntity test = new testdecodeEntity();
//				test.setLq(qlist.get(i));
//				test.setLs(slist.get(i));
//				single.add(test);
//			} else if ("1".equals(qlist.get(i).getQuestype())) {
//				testdecodeEntity test = new testdecodeEntity();
//				test.setLq(qlist.get(i));
//				test.setLs(slist.get(i));
//				mul.add(test);
//			} else if ("2".equals(qlist.get(i).getQuestype())) {
//				testdecodeEntity test = new testdecodeEntity();
//				test.setLq(qlist.get(i));
//				test.setLs(slist.get(i));
//				jud.add(test);
//			} else if ("3".equals(qlist.get(i).getQuestype())) {
//				testdecodeEntity test = new testdecodeEntity();
//				test.setLq(qlist.get(i));
//				test.setLs(slist.get(i));
//				tian.add(test);
//			} else if ("4".equals(qlist.get(i).getQuestype())) {
//				testdecodeEntity test = new testdecodeEntity();
//				test.setLq(qlist.get(i));
//				test.setLs(slist.get(i));
//				jian.add(test);
//			}
//		}
//		HashMap<String, List<testdecodeEntity>> map = new HashMap<>();
//		map.put("single", single);
//		map.put("mul", mul);
//		map.put("jud", jud);
//		map.put("tian", tian);
//		map.put("jian", jian);
		return customer1.receiveQueue(testid);
	}

}
