package neueduexam.HXBservicelmp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import neueduexam.HXBservice.QuestionLibService;

import neueduexam.dao.questionlibMapper;
import neueduexam.entity.questionlib;

@Service
public class QuestionLibServiceImpl implements QuestionLibService{
	
	@Autowired
	questionlibMapper questionlibMapper;
	
	@Override
	public String selectNumOfQuestionsByLibList(List<Integer> libList) {
		//根据题库id，找出匹配的题库数据，并转化成json格式返回
		QuestionNumber q2  = new QuestionNumber();
		for(int i :libList) {
			questionlib q = questionlibMapper.selectByPrimaryKey(i);
			q2.addNumOfSingle(q.getNumofsingle());
			q2.addNumOfMultiple(q.getNumofmultiple());
			q2.addNumOfJudge(q.getNumofjudge());
			q2.addNumOfBlank(q.getNumofblank());
			q2.addNumOfAnswer(q.getNumofanswer());
		}
		System.out.println(q2);
		String jsonString = JSON.toJSONString(q2);
		return jsonString;
	}
	
}
