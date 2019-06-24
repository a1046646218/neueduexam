package neueduexam.queue;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.jms.Queue;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;

import neueduexam.DTFcontroller.testdecodeEntity;
import neueduexam.DTFservice.testhomeService;
import neueduexam.entity.examandquestion;
import neueduexam.entity.question;


/**
 * 定义一个点对点模式的生产者
 * 
 * 将该类注册到spring框架中 利用注解 @Component
 * @author Administrator
 *
 */
@Component
public class Produce {

	@Autowired
	private JmsMessagingTemplate jmsMessagingTemplate;
	
	@Autowired
	private Queue queue;
	
	
	/*
	 * 将一个java对象插入到一个消息队列中
	 */
	public  void send(int testid){
		
		this.jmsMessagingTemplate.convertAndSend(this.queue,testid);
	}
}
