package neueduexam.DTFcontroller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import neueduexam.DTFservice.TestPaperService;
import neueduexam.DTFservice.inviteServcie;
import neueduexam.GZKservice.GZKUserService;
import neueduexam.api.messageApi;
import neueduexam.entity.invitation;
import neueduexam.entity.testpaper;
import neueduexam.entity.user;

@RestController
public class addOneTestController {
	
	@Autowired
	TestPaperService testpaperservice;
	@Autowired
	GZKUserService gzkuserservice;
	@Autowired
	inviteServcie inviteservcie;
	
	@RequestMapping("/addoneuser")
	public String addoneuser(int testid,String phonenum,HttpServletRequest res) {
		List<user> ulist = gzkuserservice.login(phonenum);
		user ustu = ulist.get(0);
		testpaper tp = testpaperservice.getTestPaperbyid(testid);
		invitation ivt = new invitation();
		Date date = new Date();
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    ivt.setTestid(testid);
	    ivt.setInvitationtime(sdf.format(date));
	    ivt.setState("0");
	    ivt.setStudentid(ustu.getUserid());
		ivt.setStuphone(ustu.getPhone());
		messageApi api = new messageApi();
		String code = api.messagecode(ustu.getPhone());
		ivt.setInvitecode(code);
		inviteservcie.insertService(ivt);
		return "1";
	}
}
