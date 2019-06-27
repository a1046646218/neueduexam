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
		cc.andInvitecodeEqualTo(invitecode);
		cc.andStudentidEqualTo(studentid);
		cc.andStateEqualTo("0");
		List<invitation> list = invatationmapper.selectByExample(e);
		if(list.size()==0)//zhe daima taihao le bukui shiwo
		return 0;
		else {
			return list.get(0).getTestid();
		}
	}
	
}
