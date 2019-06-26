package neueduexam.DTFservicelmp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neueduexam.DTFservice.QuestionlibService;
import neueduexam.dao.questionMapper;
import neueduexam.dao.questionandlibMapper;
import neueduexam.dao.questionlibMapper;
import neueduexam.dao.userhavelibMapper;
import neueduexam.entity.question;
import neueduexam.entity.questionExample;
import neueduexam.entity.questionandlib;
import neueduexam.entity.questionandlibExample;
import neueduexam.entity.questionlib;
import neueduexam.entity.questionlibExample;
import neueduexam.entity.questionlibExample.Criteria;
import neueduexam.entity.user;
import neueduexam.entity.userhavelib;
import neueduexam.entity.userhavelibExample;

@Service
public class QuestionlibServiceImp implements QuestionlibService{
	
	@Autowired
	questionlibMapper questionlibmapper;
	@Autowired
	questionandlibMapper questionandlibmapper; 
	@Autowired
	questionMapper questionmapper; 
	@Autowired
	userhavelibMapper userhavelibmapper; 
	
	
	@Override
	public List<questionlib> getquestionlibByid(int userid) {
		userhavelibExample e = new userhavelibExample();
		neueduexam.entity.userhavelibExample.Criteria cc = e.createCriteria();
		cc.andUseridEqualTo(userid);
		List<userhavelib> all = userhavelibmapper.selectByExample(e);
		List<questionlib> list = new ArrayList<>();
		for(int i=0;i<all.size();i++) {
			list.add(questionlibmapper.selectByPrimaryKey(all.get(i).getLibid()));
		}
		return list;
	}

	@Override
	public HashMap<String,Integer> geteasyNumByid(int libid) {
		questionandlibExample eql = new questionandlibExample();
		neueduexam.entity.questionandlibExample.Criteria cc = eql.createCriteria();
		cc.andLibidEqualTo(libid);
		List<questionandlib> all = questionandlibmapper.selectByExample(eql);
		HashMap<String,Integer> li = new HashMap<String,Integer>();
		li.put("e1", 0);
		li.put("e2", 0);
		li.put("e3", 0);
		for(int i=0;i<all.size();i++) {
			question q = questionmapper.selectByPrimaryKey(all.get(i).getQuesid());
			if("简单".equals(q.getDifficulty())) {
				li.put("e1", li.get("e1")+1);
			}else if("中等".equals(q.getDifficulty())) {
				li.put("e2", li.get("e2")+1);
			}else {
				li.put("e3", li.get("e3")+1);
			}
		}
		return li;
	}
	
	@Override
	public int createQuestionlib(String clibname, String clibtype, String clibpro,user u) {
		questionlib li = new questionlib();
		li.setLibname(clibname);
		li.setLibprice(-1);
		li.setLibprofile(clibpro);
		li.setLibtype(clibtype);
		li.setNickname(u.getNickname());
		li.setNumofanswer(0);
		li.setNumofblank(0);
		li.setNumofjudge(0);
		li.setNumofmultiple(0);
		li.setNumofpurchases(0);
		li.setNumofsingle(0);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		li.setPublishtime(df.format(new Date()));
		li.setQuesamount(0);
		li.setUserid(u.getUserid());
		int key = questionlibmapper.insertandgetlkey(li);
		System.out.println(key+"======主键是");
		userhavelib record = new userhavelib();
		record.setLibid(li.getLibid());
		record.setUserid(u.getUserid());
		userhavelibmapper.insert(record);
		return 1;
	}

	@Override
	public int removeQuestionlib(user u, int libid) {
		userhavelibExample e = new userhavelibExample();
		neueduexam.entity.userhavelibExample.Criteria cc = e.createCriteria();
		cc.andLibidEqualTo(libid);
		cc.andUseridEqualTo(u.getUserid());
		int i = userhavelibmapper.deleteByExample(e);
		return i;
	}

	@Override
	public int changesalelib(int libid, int point) {
		questionlib record = new questionlib();
		record.setLibid(libid);
		record.setLibprice(point);
		int i = questionlibmapper.updateByPrimaryKeySelective(record);
		return i;
	}

	@Override
	public HashMap<String, List<Integer>> questioneasychart() {
		questionExample e = new questionExample();
		neueduexam.entity.questionExample.Criteria cc = e.createCriteria();
		cc.andQuesidIsNotNull();
		List<question> list = questionmapper.selectByExample(e);
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
	
}
