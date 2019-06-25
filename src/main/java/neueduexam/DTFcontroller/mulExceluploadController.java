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
import neueduexam.HLservice.QuestionService;
import neueduexam.HLservice.QuestionandlibService;
import neueduexam.HLservice.QuestionlibService;
import neueduexam.api.messageApi;
import neueduexam.entity.invitation;
import neueduexam.entity.question;
import neueduexam.entity.questionandlib;
import neueduexam.entity.questionlib;
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
	@Autowired
	QuestionService questionservice ;
	@Autowired
	QuestionandlibService questionandlibservice;
	@Autowired
	QuestionlibService questionlibservice;
	
	@RequestMapping("/mulExceluploadtolib")
	@ResponseBody
	 public void test2sss(HttpServletRequest request) {
		user u = (user)request.getSession().getAttribute("user");
		int	addlibidexcel = (int) request.getSession().getAttribute("libid_"+Integer.toString(u.getUserid()));
		System.out.println(addlibidexcel+"=题库=============");
		List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
	    String filePath = request.getServletContext().getRealPath("/excel");
	    for(int i =0;i<files.size();i++) {
	    	System.out.println("第一个=====");
	    	List<Object> list = ExcelUtil.readExcel(files.get(i), new questionExcelEntity());
	    	for (Object o : list) {
	    		questionExcelEntity qex = (questionExcelEntity)o;
	    		question q = new question();
	    		q.setA(qex.getA());
	    		q.setAnalysis(qex.getAnalysis());
	    		q.setB(qex.getB());
	    		q.setC(qex.getC());
	    		q.setD(qex.getD());
	    		q.setDifficulty(qex.getDifficulty());
	    		q.setQuesanswer(qex.getQuesanswer());
	    		q.setQuescontext(qex.getQuescontext());
	    		q.setQuestype(qex.getQuestype());
	    		q.setTag(qex.getTag());
	    		questionservice.addquestion(q);
	    		System.out.println(q.getQuesid()+"=主键====");
	    		questionandlib qlib = new questionandlib();
	    		qlib.setLibid(addlibidexcel);
	    		qlib.setQuesid(q.getQuesid());
	    		questionandlibservice.insertSelective(qlib);
	    		questionlib lib = questionlibservice.selectByPrimaryKey(addlibidexcel);
	    		lib.setQuesamount(lib.getQuesamount()+1);
	    		if("0".equals(qex.getQuestype())) {
	    			
	    			lib.setNumofsingle(lib.getNumofsingle()+1);
	    		
	    		}else if("1".equals(qex.getQuestype())) {
	    			
	    			lib.setNumofmultiple(lib.getNumofmultiple()+1);
	    		
	    		}else if("2".equals(qex.getQuestype())) {
	    			
	    			lib.setNumofjudge(lib.getNumofjudge()+1);
	    		
	    		}else if("3".equals(qex.getQuestype())) {
	    			
	    			lib.setNumofblank(lib.getNumofblank()+1);
	    		
	    		}else if("4".equals(qex.getQuestype())) {
	    			
	    			lib.setNumofanswer(lib.getNumofanswer()+1);
	    		
	    		}
	    		questionlibservice.updateByPrimaryKeySelective(lib);
	    	}
	    }
	    request.getSession().removeAttribute("libid_"+Integer.toString(u.getUserid()));
    }
	
	
	
	@RequestMapping("/mulExcelupload")
    @ResponseBody
    public void test2(HttpServletRequest request) {
		user u = (user)request.getSession().getAttribute("user");
		int	addtestidexcel = (int) request.getSession().getAttribute("addtestidexcel_"+Integer.toString(u.getUserid()));
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
	    request.getSession().removeAttribute("addtestidexcel_"+Integer.toString(u.getUserid()));
    }
}
