package neueduexam.DTFcontroller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import neueduexam.DTFservice.QuestionlibService;
import neueduexam.DTFservice.UserService;
import neueduexam.DTFservice.inviteServcie;
import neueduexam.entity.invitation;

@RestController
public class adminDataDTFController {
	
	
	@Autowired
	inviteServcie inviteservcie;
	@Autowired
	UserService userservice; 
	@Autowired
	QuestionlibService questionlibservice;
	
	@RequestMapping("/getquestioneasy")
	public HashMap<String,List<Integer>> getquestioneasy(){
		HashMap<String,List<Integer>> map = questionlibservice.questioneasychart();
		return map;
	}
	
	@RequestMapping("/getchartcheckin")
	public HashMap<String, List<Integer>> getchartcheckin(){
		HashMap<String, List<Integer>> map = new HashMap<>();
		List<Integer> now = new ArrayList<>();
		now.add(userservice.getDayRecord(0).size());
		now.add(userservice.getDayRecord(-1).size());
		now.add(userservice.getDayRecord(-2).size());
		now.add(userservice.getDayRecord(-3).size());
		now.add(userservice.getDayRecord(-4).size());
		now.add(userservice.getDayRecord(-5).size());
		now.add(userservice.getDayRecord(-6).size());
		map.put("now", now);
		
		List<Integer> before = new ArrayList<>();
		before.add(userservice.getDayRecord(-7).size());
		before.add(userservice.getDayRecord(-8).size());
		before.add(userservice.getDayRecord(-9).size());
		before.add(userservice.getDayRecord(-10).size());
		before.add(userservice.getDayRecord(-11).size());
		before.add(userservice.getDayRecord(-12).size());
		before.add(userservice.getDayRecord(-13).size());
		map.put("before", before);
		return map;
	}
	
	
	@RequestMapping("/getchartinvite")
	public HashMap<String, List<Integer>> getchartinvite(){
		HashMap<String, List<Integer>> map = new HashMap<>();
		List<Integer> now = new ArrayList<>();
		now.add(inviteservcie.getWeekInvite(0).size());
		now.add(inviteservcie.getWeekInvite(-1).size());
		now.add(inviteservcie.getWeekInvite(-2).size());
		now.add(inviteservcie.getWeekInvite(-3).size());
		now.add(inviteservcie.getWeekInvite(-4).size());
		now.add(inviteservcie.getWeekInvite(-5).size());
		now.add(inviteservcie.getWeekInvite(-6).size());
		map.put("now", now);
		
		List<Integer> before = new ArrayList<>();
		before.add(inviteservcie.getWeekInvite(-7).size());
		before.add(inviteservcie.getWeekInvite(-8).size());
		before.add(inviteservcie.getWeekInvite(-9).size());
		before.add(inviteservcie.getWeekInvite(-10).size());
		before.add(inviteservcie.getWeekInvite(-11).size());
		before.add(inviteservcie.getWeekInvite(-12).size());
		before.add(inviteservcie.getWeekInvite(-13).size());
		map.put("before", before);
		return map;
	}
}
