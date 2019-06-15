//package neueduexam.queue;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jms.annotation.JmsListener;
//import org.springframework.stereotype.Component;
//
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.TypeReference;
//
//
///**
// * 定义点对点模式的消费者
// * @author Administrator
// *
// */
//@Component
//public class Customer1 {
//
//	/**
//	 * 在项目中随时监听demo.queue1队列 ,如果队列有变化 ,消费者就会监听到 ,会触发下面的方法,进行处理
//	 * @param text
//	 */
//	@JmsListener(destination="demo.queue")
//	public void receiveQueue(String text){
//		
//		System.out.println("cu stomer11111111从队列中得到的对象的内容是"+text);
//		
//	}
//}
