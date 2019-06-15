package neueduexam.DTFcontroller;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import neueduexam.api.HttpUtils;

@RestController
public class loadimgcontroller {
	
	@RequestMapping("loadtest")
	public String loadtest(String basePath) {
		String imgStr = basePath;
		String host = "http://facecheckv.market.alicloudapi.com";
	    String path = "/efficient/idfaceIdentity";
	    String method = "POST";
	    String appcode = "1e8c35957c994c07af2778df27c3936d";
	    Map<String, String> headers = new HashMap<String, String>();
	    //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
	    headers.put("Authorization", "APPCODE " + appcode);
	    //根据API的要求，定义相对应的Content-Type
	    headers.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
	    Map<String, String> querys = new HashMap<String, String>();
	    Map<String, String> bodys = new HashMap<String, String>();
	    bodys.put("base64Str", basePath);
	    bodys.put("liveChk", "0");
	    bodys.put("name", "董铁夫");
	    bodys.put("number", "210302199708263017");
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
	    	System.out.println(EntityUtils.toString(response.getEntity()));
	    	//return EntityUtils.toString(response.getEntity());
	    	//获取response的body
	    	//System.out.println(EntityUtils.toString(response.getEntity()));
	    } catch (Exception e) {
	    	System.out.println("cuowu");
	    	e.printStackTrace();
	    }
		
//	        BASE64Decoder decoder = new BASE64Decoder();
//	        try{
//	            //解密
//	            byte[] b = decoder.decodeBuffer(imgStr);
//	            //处理数据
//	            for (int i = 0;i<b.length;++i){
//	                if(b[i]<0){
//	                    b[i]+=256;
//	                }
//	            }
//	            OutputStream out = new FileOutputStream("D:\\img.png");
//	            out.write(b);
//	            out.flush();
//	            out.close();
//
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        }
		//System.out.println(basePath);
	    return "sss";
	}
}
