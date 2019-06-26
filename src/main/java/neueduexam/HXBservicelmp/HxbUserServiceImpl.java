package neueduexam.HXBservicelmp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import neueduexam.HXBservice.HxbUserService;
import neueduexam.dao.userMapper;
import neueduexam.entity.user;
import neueduexam.entity.userExample;

@Service
public class HxbUserServiceImpl implements HxbUserService {

	@Autowired
	userMapper userMapper;
	
	@Override
	public String getStudentList() {
		userExample uE = new userExample();
		uE.createCriteria().andTypeEqualTo("学生");
		List<user> list = userMapper.selectByExample(uE);
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("data", list);
		
		String jsonString = JSON.toJSONString(map);
		
		return jsonString;
	}

	@Override
	public Integer updateStudent(Integer userId,String type) {
		
		user u = new user();
		u.setUserid(userId);
		if(type.equals("student"))
			u.setType("老师");
		else
			u.setType("学生");
		int i = userMapper.updateByPrimaryKeySelective(u);
		return i;
	}
	
	@Override
	public String getUserList() {
		userExample uE = new userExample();
		uE.createCriteria().andUseridIsNotNull();
		List<user> list = userMapper.selectByExample(uE);
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("data", list);
		
		String jsonString = JSON.toJSONString(map);
		
		return jsonString;
	}

}
