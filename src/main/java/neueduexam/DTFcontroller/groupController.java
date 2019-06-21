package neueduexam.DTFcontroller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import neueduexam.DTFservice.groupDTFService;
import neueduexam.DTFservice.homeService;
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
}
