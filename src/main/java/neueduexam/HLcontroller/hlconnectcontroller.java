package neueduexam.HLcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class hlconnectcontroller {
	@RequestMapping("/toaddquestion")
	public String toaddquestion(){
		return "addquestion";
	}
	
	@RequestMapping("/toshowexampaper")
	public String toshowexampaper(){
		return "showexampaper";
	}
	
	@RequestMapping("/toshownotalreadytestpaper")
	public String toshownotalreadytestpaper(){
		return "shownotalreadytestpaper";
	}
	
	@RequestMapping("/toshowtestpaper")
	public String toshowtestpaper(){
		return "showtestpaper";
	}
	
}
