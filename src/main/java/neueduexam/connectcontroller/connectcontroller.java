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
	@RequestMapping("/tostudentalreadyexam")
	public String tostudentalreadyexam() {
		return "studentalreadyexam";
	}
	@RequestMapping("/tostudentpayrecord")
	public String tostudentpayrecord() {
		return "studentpayrecord";
	}
	@RequestMapping("/tostudentNotalreadyexam")
	public String tostudentNotalreadyexam() {
		return "studentNotalreadyexam";
	}
	@RequestMapping("/tostudentquestionlib")
	public String tosstudentquestionlib() {
		return "studentquestionlib";
	}
	@RequestMapping("tolayers")
	public String tolayers() {
		return "layers";
	}
}
