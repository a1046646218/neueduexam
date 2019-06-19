package neueduexam.HXBservicelmp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import neueduexam.HXBservice.InvitationService;
import neueduexam.dao.invitationMapper;
import neueduexam.dao.testpaperMapper;
import neueduexam.entity.invitation;
import neueduexam.entity.invitationExample;
import neueduexam.entity.testpaper;
import neueduexam.entity.testpaperExample;
import neueduexam.entity.user;
import neueduexam.entity.userExample;
import neueduexam.dao.userMapper;

@Service
public class InvitationServiceImpl implements InvitationService {
	
	@Autowired
	invitationMapper invitationMapper; 
	@Autowired
	testpaperMapper testpaperMapper;
	@Autowired
	userMapper userMapper;
	
	@Override
	public String selectInvitationByTestId(String testId) {
		List<InvitationPeople> invitationPeopleList = new ArrayList<InvitationPeople>();
		InvitationModule m = new InvitationModule();
		int id = Integer.parseInt(testId);
		
		invitationExample invitationExample = new invitationExample();
		invitationExample.createCriteria().andTestidEqualTo(id);
		List<invitation> list2 = invitationMapper.selectByExample(invitationExample);
		for(invitation i :list2) {
			InvitationPeople invitationPeople = new InvitationPeople();
			//設置試卷的答題者id
			invitationPeople.setStuId(i.getStudentid());
			//設置試卷的答題者手機號
			invitationPeople.setPhone(i.getStuphone());
			//設置邀請時間
			invitationPeople.setInvitationTime(i.getInvitationtime());
			//設置完成狀態
			if(i.getState().equals("0"))
				invitationPeople.setState("未完成");
			else {
				invitationPeople.setState("已完成");
			}
			//查詢考生的昵称和真实姓名
			userExample	userE = new userExample();
			userE.createCriteria().andUseridEqualTo(id);
			user user = userMapper.selectByPrimaryKey(i.getStudentid());
			invitationPeople.setRealName(user.getRealname());
			invitationPeople.setNickName(user.getNickname());
			
			//将invitationPeople放入链表中
			invitationPeopleList.add(invitationPeople);
		}
		m.setData(invitationPeopleList);
		
		//查詢試卷的名稱
		testpaper t = testpaperMapper.selectByPrimaryKey(id);
		m.setTestName(t.getTestname());
		
		String json  = JSON.toJSONString(m);
		System.out.println(json);
		
		return json;
	}
	
	public static void main(String[] args) {
		InvitationServiceImpl invitationServiceImpl = new InvitationServiceImpl();
		invitationServiceImpl.selectInvitationByTestId("1");
	}
}
