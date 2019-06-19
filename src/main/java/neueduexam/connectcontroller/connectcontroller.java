package neueduexam.connectcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class connectcontroller {
	@RequestMapping("/to11")
	public String to111(){
		return "11";
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
	@RequestMapping("toteacherhasexam")
	public String toteacherhasexam() {
		return "teacherhasexam";
	}
	@RequestMapping("/toteacherpublichexam")
	public String toteacherpublichexam() {
		return "teacherpublichexam";
	}
	@RequestMapping("/toteacherquestionlib")
	public String toteacherquestionlib() {
		return "teacherquestionlib";
	}
	@RequestMapping("/index")
	public String tohead() {
		return "index";
	}
	@RequestMapping("/head")
	public String head() {
		return "head";
	}
	@RequestMapping("/topayhome")
	public String payhome() {
		return "payhome";
	}
	@RequestMapping("/invitstudent")
	public String invitstudent() {
		return "invitstudent";
	}
	@RequestMapping("/dropupload")
	public String dropupload() {
		return "dropupload";
	}
}
