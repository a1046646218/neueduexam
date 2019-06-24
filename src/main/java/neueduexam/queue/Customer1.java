package neueduexam.queue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import neueduexam.DTFcontroller.testdecodeEntity;
import neueduexam.DTFservice.testhomeService;
import neueduexam.entity.examandquestion;
import neueduexam.entity.question;


/**
 * 定义点对点模式的消费者
 * @author Administrator
 *
 */
@Component
public class Customer1 {

	/**
	 * 在项目中随时监听demo.queue1队列 ,如果队列有变化 ,消费者就会监听到 ,会触发下面的方法,进行处理
	 * @param text
	 */
	@Autowired
	testhomeService testhomeservice;
	
	
	@JmsListener(destination="demo.queue")
	public HashMap<String,List<testdecodeEntity>> receiveQueue(int testid){
		List<question> qlist = testhomeservice.getquestionList(testid);
		List<examandquestion> slist = testhomeservice.getscoreList(testid);
		List<testdecodeEntity> single =new ArrayList<>();
		List<testdecodeEntity> mul = new ArrayList<>();
		List<testdecodeEntity> jud = new ArrayList<>();
		List<testdecodeEntity> tian = new ArrayList<>();
		List<testdecodeEntity> jian = new ArrayList<>();
		for(int i=0;i<qlist.size();i++) {
			System.out.println(qlist.get(i).getQuestype());
			if("0".equals(qlist.get(i).getQuestype())) {
				testdecodeEntity test = new testdecodeEntity();
				test.setLq(qlist.get(i));
				test.setLs(slist.get(i));
				single.add(test);
			}else if("1".equals(qlist.get(i).getQuestype())) {
				testdecodeEntity test = new testdecodeEntity();
				test.setLq(qlist.get(i));
				test.setLs(slist.get(i));
				mul.add(test);
			}else if("2".equals(qlist.get(i).getQuestype())) {
				testdecodeEntity test = new testdecodeEntity();
				test.setLq(qlist.get(i));
				test.setLs(slist.get(i));
				jud.add(test);
			}else if("3".equals(qlist.get(i).getQuestype())) {
				testdecodeEntity test = new testdecodeEntity();
				test.setLq(qlist.get(i));
				test.setLs(slist.get(i));
				tian.add(test);
			}else if("4".equals(qlist.get(i).getQuestype())) {
				testdecodeEntity test = new testdecodeEntity();
				test.setLq(qlist.get(i));
				test.setLs(slist.get(i));
				jian.add(test);
			}
		}
		HashMap<String,List<testdecodeEntity>> map = new HashMap<>();
		map.put("single", single);
		map.put("mul", mul);
		map.put("jud", jud);
		map.put("tian", tian);
		map.put("jian", jian);
		return map;
	}
}
