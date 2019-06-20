package neueduexam.MJservicelmp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neueduexam.MJservice.InvitationCodeService;
import neueduexam.dao.invitationMapper;
import neueduexam.entity.invitation;
import neueduexam.entity.invitationExample;
import neueduexam.entity.invitationExample.Criteria;

@Service
public class InvitationCodeServiceImp implements InvitationCodeService{
	@Autowired
	invitationMapper invatationmapper;

	@Override
	public int selectByExample(Integer studentid, String invitecode) {
		invitationExample e = new invitationExample();
		Criteria cc = e.createCriteria();
		cc.andInvitationtimeEqualTo("邀请码");
		Criteria dd = e.createCriteria();
		dd.andInvitationtimeEqualTo("学生id");
		
		int i = invatationmapper.selectByExample(cc,dd);
		return i;
	}
	
}
