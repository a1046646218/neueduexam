package neueduexam.DTFservicelmp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neueduexam.DTFservice.inviteServcie;
import neueduexam.dao.invitationMapper;
import neueduexam.entity.invitation;

@Service
public class inviteServcieImp implements inviteServcie{
	
	@Autowired
	invitationMapper invitationmapper;

	@Override
	public int insertService(invitation in) {
		int i = invitationmapper.insert(in);
		return i;
	}
	
	
	
}
