package neueduexam.DTFcontroller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import neueduexam.DTFservice.groupDTFService;
import neueduexam.DTFservice.homeService;
import neueduexam.GZKservice.GZKUserService;
import neueduexam.entity.groupanduser;
import neueduexam.entity.homework;
import neueduexam.entity.mygroup;
import neueduexam.entity.user;

@RestController
public class groupController {
	
	@Autowired
	groupDTFService groupdtfservice;
	@Autowired
	homeService homeservice;
	@Autowired
	GZKUserService gzkuserservice;
	
	
	@RequestMapping("/ismygroup")
	public String ismygroup(HttpServletRequest resq,int groupid) {
		user u = (user)resq.getSession().getAttribute("user");
		return Integer.toString(groupdtfservice.ismygroup(u.getUserid(), groupid));
	}
	
	@RequestMapping("/creategroupAjaxDTF")
	public String creategroupAjaxDTF(String clibname,String clibpro,HttpServletRequest resq) {
		int creategroup = groupdtfservice.creategroup((user)resq.getSession().getAttribute("user"), clibname, clibpro);
		return Integer.toString(creategroup);
	}
	
	
	@RequestMapping("/forgrouplist")
	public HashMap<String,List<mygroup>> forgrouplist(HttpServletRequest resq){
		user u = (user)resq.getSession().getAttribute("user");
		List<mygroup> mygroup = groupdtfservice.getMygrouplistbyID(u.getUserid());
		List<mygroup> addgroup = groupdtfservice.getaddgrouplistbyID(u.getUserid());
		HashMap<String,List<mygroup>> map = new HashMap<>();
		map.put("my", mygroup);
		map.put("add", addgroup);
		return map;
	}
	
	@RequestMapping("/forgroupuserlist")
	public List<groupanduser> forgroupuserlist(int groupid,HttpServletRequest resq){
		user u = (user)resq.getSession().getAttribute("user");
		List<groupanduser> list = groupdtfservice.getgroupuserlistbyID(groupid);
		return list;
	}
	
	@RequestMapping("/forhomeworklist")
	public List<homework> forhomeworklist(int groupid,HttpServletRequest resq){
		user u = (user)resq.getSession().getAttribute("user");
		List<homework> list = homeservice.gethomeworklistbygroupid(groupid);
		return list;
	}
	
	@RequestMapping("/inviteusertogroup")
	public int inviteusertogroup(int groupid,String pass,HttpServletRequest resq) {
		List<user> ulist = gzkuserservice.login(pass);
		if(ulist.size()==0) {
			return 3;
		}else {
			int i = groupdtfservice.inviteruser(ulist.get(0), groupid);
			return i;
		}
		
	}
	
	@RequestMapping("/addhomework")
	public int addhomework(int groupid,String pass) {
		return homeservice.addhomework(groupid, pass);
	}
	
}
