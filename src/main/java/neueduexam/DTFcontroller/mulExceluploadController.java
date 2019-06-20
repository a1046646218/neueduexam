package neueduexam.DTFcontroller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import neueduexam.DTFservice.TestPaperService;
import neueduexam.DTFservice.inviteServcie;
import neueduexam.GZKservice.GZKUserService;
import neueduexam.api.messageApi;
import neueduexam.entity.invitation;
import neueduexam.entity.testpaper;
import neueduexam.entity.user;
import neueduexam.excelapi.ExcelUtil;
import neueduexam.excelapi.PersonDTO;

@Controller
public class mulExceluploadController {
	
	@Autowired
	TestPaperService testpaperservice;
	@Autowired
	GZKUserService gzkuserservice;
	@Autowired
	inviteServcie inviteservcie;
	
	
	@RequestMapping("/mulExcelupload")
    @ResponseBody
    public void test2(HttpServletRequest request) {
		user u = (user)request.getSession().getAttribute("user");
		int addtestidexcel = (int) request.getSession().getAttribute("addtestidexcel_"+Integer.toString(u.getUserid()));
		System.out.println(addtestidexcel+"==============");
		testpaper tp = testpaperservice.getTestPaperbyid(addtestidexcel);
		invitation ivt = new invitation();
		Date date = new Date();
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    ////////////////
	    ivt.setTestid(addtestidexcel);
	    ivt.setInvitationtime(sdf.format(date));
	    ivt.setState("0");
		//获取前台的文件域对象 , 是一个List<MultipartFile>
	    List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
	    String filePath = request.getServletContext().getRealPath("/excel");
	    for(int i =0;i<files.size();i++) {
	    	System.out.println("第一个=====");
	    	List<Object> list = ExcelUtil.readExcel(files.get(i), new InviteStudent());
	    	for (Object o : list) {
				System.out.println(o.toString());
				List<user> ulist = gzkuserservice.login(((InviteStudent)o).getphonenum());
				if(ulist.size()!=0) {
					user ustu = ulist.get(i);
					ivt.setStudentid(ustu.getUserid());
					ivt.setStuphone(ustu.getPhone());
					messageApi api = new messageApi();
					String code = api.messagecode(ustu.getPhone());
					ivt.setInvitecode(code);
					inviteservcie.insertService(ivt);
				}
			}
			
	    }
    }
}
