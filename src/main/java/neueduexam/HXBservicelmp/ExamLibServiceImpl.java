package neueduexam.HXBservicelmp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;


import neueduexam.HXBservice.ExamLibService;
import neueduexam.entity.questionlib;
import neueduexam.entity.userhavelib;
import neueduexam.entity.userhavelibExample;
import neueduexam.dao.userhavelibMapper;
import neueduexam.dao.questionlibMapper;

@Service
public class ExamLibServiceImpl implements ExamLibService {

	@Autowired
	userhavelibMapper userhavelibMapper;
	@Autowired
	questionlibMapper questionlibMapper;
	
	@Override
	public String selectSimpleExamlibByUserId(String userId) {
		
		//初始化 将userid变成int格式
		int i_userId = Integer.parseInt(userId);
		//创建一个List用于转化json格式
		List<SimpleQuestionLib> lib_list = new ArrayList<SimpleQuestionLib>();
		
		//根据userid查询它拥有的libId
		userhavelibExample uE = new userhavelibExample();
		uE.createCriteria().andUseridEqualTo(i_userId);
		List<userhavelib> list = userhavelibMapper.selectByExample(uE);
		
		//根据libId找到对应的题库的信息
		for(userhavelib u : list) {
			SimpleQuestionLib s = questionlibMapper.selectSimpleQuestionLibByPrimaryKey(u.getLibid());
			lib_list.add(s);
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("data", lib_list);
		
		String json = JSON.toJSONString(map);
		System.out.println(json);
		
		return json;
	}

}
