package neueduexam.payapi;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import net.sf.json.JSONObject;
import neueduexam.payapi.PayUtil;
import neueduexam.payapi.Paypayzhu;


@Controller
public class PayController {

	
	@RequestMapping("/pay")
	@ResponseBody
	public JSONObject pay(HttpServletRequest request, String price, Integer type) throws UnsupportedEncodingException {
		JSONObject json = new JSONObject();
		Map<String, String> remoteMap = new HashMap<String, String>();		
		remoteMap.put("price", price);
		remoteMap.put("type", type.toString());
		remoteMap.put("order_id", PayUtil.getOrderIdByUUId());
		remoteMap.put("order_info", "您自己想要定义的订单信息");
		json.put("data", PayUtil.payOrder(remoteMap));
		return json;
	}

	@RequestMapping("/notifyPay")
	public ModelAndView notifyPay(HttpServletRequest request, HttpServletResponse response, Paypayzhu paypayzhu) throws UnsupportedEncodingException {
		// 保证密钥一致性
		ModelAndView m  = new ModelAndView();
		System.out.println("ssss");
			m.setViewName("redirect:success");
		return m;
	}

}
