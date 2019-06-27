package neueduexam.connectcontroller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRange;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import neueduexam.entity.user;

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
	@RequestMapping("/tostudentalreadyexam")
	public String tostudentalreadyexam() {
		return "studentalreadyexamHL";
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
	@RequestMapping("/toteacherhasexam")
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
	@RequestMapping("/topublicgroup")
	public String topublicgroup() {
		return "publicgroup";
	}
	@RequestMapping("/grouphome")
	public String grouphome() {
		return "grouphome";
	}
	@RequestMapping("/webcamcode")
	public String webcamcode(int testid,HttpServletRequest res) {
		res.setAttribute("testid", testid);
		return "webcamcode";
	}
	@RequestMapping("/admin1")
	public String admin1() {
		return "admin1";
	}
}
