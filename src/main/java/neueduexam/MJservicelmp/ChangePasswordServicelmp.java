package neueduexam.MJservicelmp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neueduexam.MJservice.ChangePasswordService;
import neueduexam.dao.userMapper;
import neueduexam.entity.user;
import neueduexam.entity.userExample;
import neueduexam.entity.userExample.Criteria;

@Service
public class ChangePasswordServicelmp implements ChangePasswordService{
	
	@Autowired
	userMapper usermapper;
	
	@Override
	public int updatePassword(int userid,String password) {
		user u = new user();
		u.setPassword(password);
		userExample e = new userExample();
		Criteria cc = e.createCriteria();
		cc.andUseridEqualTo(userid);

		int i = usermapper.updateByExampleSelective(u, e);
		return i;
	}

}