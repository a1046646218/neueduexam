package neueduexam.connectcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class connectcontroller {
	@RequestMapping("/to11")
	public String to111(){
		return "11";
	}
	@RequestMapping("/topaypage")
	public String topaypage() {
		return "paypage";
	}
	@RequestMapping("/towebcam")
	public String towebcam() {
		return "webcam";
	}
	@RequestMapping("/tostudenthome")
	public String tostudenthome() {
		return "studenthome";
	}
}
