package neueduexam.MJservicelmp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neueduexam.MJservice.UserInformationService;
import neueduexam.dao.userMapper;
import neueduexam.entity.user;
import neueduexam.entity.userExample;
import neueduexam.entity.userExample.Criteria;

@Service
public class UserInformationImp implements UserInformationService{
	@Autowired
	userMapper usermapper;
	@Override
	public int updateByUserId(user user) {
		int i = usermapper.updateByPrimaryKeySelective(user);
		return i;
	}
}
