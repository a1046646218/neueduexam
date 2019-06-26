package neueduexam.DTFservicelmp;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neueduexam.DTFservice.inviteServcie;
import neueduexam.dao.invitationMapper;
import neueduexam.entity.invitation;
import neueduexam.entity.invitationExample;
import neueduexam.entity.invitationExample.Criteria;

@Service
public class inviteServcieImp implements inviteServcie{
	
	@Autowired
	invitationMapper invitationmapper;

	@Override
	public int insertService(invitation in) {
		int i = invitationmapper.insert(in);
		return i;
	}

	@Override
	public List<invitation> getWeekInvite(int i) {
		invitationExample e = new invitationExample();
		Criteria cc = e.createCriteria();
		cc.andInvitationtimeBetween(getDateString(i-1),  getDateString(i));
		List<invitation> list = invitationmapper.selectByExample(e);
		return list;
	}
	
	public static String getDateString(int i) {
		Date date=new Date();//取时间
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		calendar.add(calendar.DATE,i);//把日期往后增加一天.整数往后推,负数往前移动
		date=calendar.getTime(); //这个时间就是日期往后推一天的结果 
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = formatter.format(date);
		System.out.println(dateString);
		return dateString;
	}
	
}
