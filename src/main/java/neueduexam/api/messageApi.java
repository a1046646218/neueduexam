package neueduexam.api;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.apache.http.HttpResponse;

import neueduexam.api.HttpUtils;


public class messageApi {
	
//	public static void main(String[] args) {
//		String code = new messageApi().messagecode("18842300648");
//		System.out.println(code);
//	}
	/**
	 * 
	 * 返回验证码   纯数字
	 * String 类型
	 * 例如
	 * 1234
	 * 范围在1000-9998之间
	 * */
	public String messagecode(String mobile) {
		 String host = "http://dingxin.market.alicloudapi.com";
		    String path = "/dx/sendSms";
		    String method = "POST";
		    String appcode = "1e8c35957c994c07af2778df27c3936d";
		    Map<String, String> headers = new HashMap<String, String>();
		    //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
		    headers.put("Authorization", "APPCODE " + appcode);
		    Map<String, String> querys = new HashMap<String, String>();
		    querys.put("mobile", mobile);
		    int max=8998;
		    int min=1000;
		    Random random = new Random();
		    String str = Integer.toString(random.nextInt(max)%(max-min+1) + min);
		    String code = "code:"+str;
		    querys.put("param", code);
		    querys.put("tpl_id", "TP1711063");
		    Map<String, String> bodys = new HashMap<String, String>();
		    try {
		    	/**
		    	* 重要提示如下:
		    	* HttpUtils请从
		    	* https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
		    	* 下载
		    	*
		    	* 相应的依赖请参照
		    	* https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
		    	*/
		    	HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
		    	System.out.println(response.toString());
		    	//获取response的body
		    	//System.out.println(EntityUtils.toString(response.getEntity()));
		    	return code;
		    } catch (Exception e) {
		    	e.printStackTrace();
		    }
		    return str;
		
	}
}
