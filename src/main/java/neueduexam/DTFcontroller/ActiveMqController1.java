//package neueduexam.DTFcontroller;
//
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import neueduexam.queue.Produce;
//
//
//
//@Controller
//public class ActiveMqController1 {
//
//	@Autowired
//	Produce produce;
//	
//	@RequestMapping("/testactivemq1")
//	public void test1(HttpServletResponse resp) throws Exception{
//		produce.send();
//		resp.getWriter().println("消息列队添加成功");
//	}
//
//}
