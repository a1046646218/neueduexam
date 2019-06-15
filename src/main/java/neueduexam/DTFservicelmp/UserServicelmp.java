package neueduexam.DTFservicelmp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neueduexam.DTFservice.UserService;
import neueduexam.dao.userMapper;
import neueduexam.entity.user;
import neueduexam.entity.userExample;
import neueduexam.entity.userExample.Criteria;

@Service
public class UserServicelmp implements UserService{

	@Autowired
	userMapper usermapper;
	
	public List<user> getbyidexmaple(int i){
		userExample e =new userExample();
		Criteria cc = e.createCriteria();
		cc.andTypeEqualTo("老师");
		List<user> li = usermapper.selectByExample(e);
		return li;
	}
}