package neueduexam.MJcontroller;



import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import neueduexam.MJservice.PayRecordService;
import neueduexam.entity.record;
import neueduexam.entity.user;

@RestController
public class PayRecordController {
	@Autowired
	PayRecordService payrecordservice;
	
	@RequestMapping("/toPayRecord")
	public List<record> getPayRecord(HttpServletRequest request,HttpServletResponse response){
		user u = (user)request.getSession().getAttribute("user");
		System.out.println(u.getUserid()+"============userid=");
		List<record> list = payrecordservice.selectByBuyerandSeller(u.getUserid());
		return list;
	}
}
	
