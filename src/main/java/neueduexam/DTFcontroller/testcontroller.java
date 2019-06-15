package neueduexam.DTFcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import neueduexam.DTFservice.UserService;
import neueduexam.entity.user;

@RestController
public class testcontroller {
	
	
	@Autowired
	UserService userservice;
	
	@RequestMapping("/test111")
	public void test111() {
		List<user> li = userservice.getbyidexmaple(0);
		System.out.println(li.size());
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i).getNickname());
		}
	}
	
}
