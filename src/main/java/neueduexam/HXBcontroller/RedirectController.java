package neueduexam.HXBcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {
	
	@RequestMapping("/toinvitation")
	public String toIntivation() {
		return "invitation";
	}
	
	@RequestMapping("/ssdd")
	public String toIntivation2() {
		return "test";
	}
}