package neueduexam.api;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import neueduexam.api.HttpUtils;

public class IdCodeApi {
	public boolean istrue(String name,String idCard) {
		String host = "https://naidcard.market.alicloudapi.com";
	    String path = "/nidCard";
	    String method = "GET";
	    String appcode = "1e8c35957c994c07af2778df27c3936d";
	    Map<String, String> headers = new HashMap<String, String>();
	    //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
	    headers.put("Authorization", "APPCODE " + appcode);
	    Map<String, String> querys = new HashMap<String, String>();
	    querys.put("idCard", idCard);
	    querys.put("name", name);
            //JDK 1.8示例代码请在这里下载：  http://code.fegine.com/java/cmapi028649.zip

	    try {
	    	/**
	    	* 重要提示如下:
	    	* HttpUtils请从
	    	* https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
                * 或者直接下载：
                * http://code.fegine.com/HttpUtils.zip
	    	* 下载
	    	*
	    	* 相应的依赖请参照
	    	* https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
                * 相关jar包（非pom）直接下载：
                * http://code.fegine.com/aliyun-jar.zip
	    	*/
	    	HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
	    	//System.out.println(response.toString());如不输出json, 请打开这行代码，打印调试头部状态码。
                //状态码: 200 正常；400 URL无效；401 appCode错误； 403 次数用完； 500 API网管错误
	    	//获取response的body
	    	System.out.println(EntityUtils.toString(response.getEntity()));
	    	if(name==idCard) {
	    		return true;
	    	}else {
	    		return false;
	    	} 	
	    } catch (Exception e) {
	    	e.printStackTrace();
	    	return false;
	    }
	}
		
}
