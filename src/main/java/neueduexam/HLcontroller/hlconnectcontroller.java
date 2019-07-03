package neueduexam.HLcontroller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class hlconnectcontroller {
	@RequestMapping("/toaddquestion")
	public String toaddquestion(int libid,HttpServletRequest res){
		res.setAttribute("libid", libid);
		return "addquestion";
	}
	
	@RequestMapping("/toshowexampaper")
	public String toshowexampaper(int examid,HttpServletRequest res){
		res.setAttribute("examid", examid);
		return "showexampaper";
	}
	
	@RequestMapping("/toshowtestpaper")
	public String toshowtestpaper(int testid,HttpServletRequest res){
		res.setAttribute("testid", testid);
		return "showtestpaper";
	}
	
	@RequestMapping("/toshownotalreadytestpaper")
	public String toshownotalreadytestpaper(int pexamid,HttpServletRequest res){
		res.setAttribute("pexamid", pexamid);
		return "shownotalreadytestpaper";
	}
	
	@RequestMapping("/toshowteacherpaper")
	public String toshowteacherpaper(int pexamid,HttpServletRequest req){
		req.setAttribute("pexamid", pexamid);
		return "showteacherpaper";
	}
	
	@RequestMapping("/tohlshop")
	public String tohlshop(){
		return "hlshop";
	}
	
}
