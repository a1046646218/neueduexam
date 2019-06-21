package neueduexam.HXBservicelmp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import neueduexam.HXBservice.SelectQuestionListService;
import neueduexam.entity.question;
import neueduexam.entity.questionExample;
import neueduexam.entity.questionandlib;
import neueduexam.entity.questionandlibExample;
import neueduexam.dao.questionandlibMapper;
import neueduexam.dao.questionMapper;
@Service
public class SelectQuestionListServiceImpl implements SelectQuestionListService{

	@Autowired
	questionandlibMapper questionandlibMapper;
	@Autowired
	questionMapper questionMapper;
	
	
	@Override
	//根据libId和quesType找出所有符合条件的题目
	public String getQuestionList(int libId,String quesType) {
		questionandlibExample qE = new questionandlibExample();
		qE.createCriteria().andLibidEqualTo(libId);
		List<questionandlib> list = questionandlibMapper.selectByExample(qE);
		List<question> list2 = new ArrayList<question>();
		for(questionandlib q: list) {
			question ques = questionMapper.selectByQuesIdAndQuesType(q.getQuesid(),quesType);
			list2.add(ques);
		}
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("data", list2);
		String jsonString = JSON.toJSONString(map);
		
		return jsonString;
	}

}
