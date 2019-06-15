package neueduexam.payapi;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;

import neueduexam.payapi.Paypayzhu;


public class PayUtil {
		
public static String REDIRECT_URL = "localhost:8081/notifyPay";
	
	public static String API_USER = "423d1015";
	
	public static String API_KEY = "0b6dea01-dc50-41fb-9673-cfaeae009930";
	
	
	public static Map<String, String> payOrder(Map<String, String> remoteMap) throws UnsupportedEncodingException {
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.putAll(remoteMap);
		paramMap.put("redirect", REDIRECT_URL);
		paramMap.put("api_user", API_USER);	
		String signature = getSignature(API_USER,paramMap);
		System.out.println(signature);
		paramMap.put("signature", signature);
		return paramMap;
	}
	
	
	/**
	 * 获取签名
	 * @param api_key
	 * @param api_user
	 * @param price
	 * @param type
	 * @param redirect
	 * @param order_id
	 * @param order_info
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	public static String getSignature(String api_user,Map<String, String> remoteMap) throws UnsupportedEncodingException {
		Map<String, String> treeMap = new TreeMap();
        treeMap.put("api_user", api_user);
        if(null != remoteMap.get("price")){
        	treeMap.put("price", remoteMap.get("price"));
        }
        if(null != remoteMap.get("type")){
        	treeMap.put("type", remoteMap.get("type"));
        }
        if(null != remoteMap.get("redirect")){
        	treeMap.put("redirect", remoteMap.get("redirect"));
        }
        if(null != remoteMap.get("order_id")){
        	treeMap.put("order_id", remoteMap.get("order_id"));
        }
        if(null != remoteMap.get("order_info")){
        	treeMap.put("order_info", remoteMap.get("order_info"));
        }        
        String signStr = API_KEY;
        for (String value : treeMap.values()) {
            signStr = signStr + value;
        }
        System.out.println(signStr);        
        return makeMd5Sum(signStr.getBytes("UTF-8"));	
	}
	
	
	public static String getOrderIdByUUId() {
		int machineId = 1;
		int hashCodeV = UUID.randomUUID().toString().hashCode();
		if (hashCodeV < 0) {// 有可能是负数
			hashCodeV = -hashCodeV;
		}
		//  0 代表前面补充0;d 代表参数为正数型
		return machineId + String.format("%01d", hashCodeV);
	}
	
	/**
	 * 检查签名是否正确
	 * @param paypayzhu
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	public static boolean checkPayKey(Paypayzhu paypayzhu) throws UnsupportedEncodingException {
		Map<String, String> treeMap = new TreeMap();
        if(!isBlank(paypayzhu.getPpz_order_id())){
        	treeMap.put("ppz_order_id", paypayzhu.getPpz_order_id());
        	System.out.println("支付回来的平台订单号：" + paypayzhu.getPpz_order_id());
        }
        if(!isBlank(paypayzhu.getOrder_id())){
        	treeMap.put("order_id", paypayzhu.getOrder_id());
        	System.out.println("支付回来的订单号：" + paypayzhu.getOrder_id());
        }
        if(null!=paypayzhu.getPrice()){
        	treeMap.put("price", paypayzhu.getPrice().toString());
        	System.out.println("支付回来的价格：" + paypayzhu.getPrice());
        }
        if(null!=paypayzhu.getReal_price()){
        	treeMap.put("real_price", paypayzhu.getReal_price().toString());
        	System.out.println("支付回来的真实价格：" + paypayzhu.getReal_price());
        }
        if(!isBlank(paypayzhu.getOrder_info())){
        	treeMap.put("order_info", paypayzhu.getOrder_info());
        	System.out.println("支付回来的订单信息：" + paypayzhu.getOrder_info());
        }
		
        String signStr = API_KEY;
        for (String value : treeMap.values()) {
            signStr = signStr + value;
        }
        String signMd5 = makeMd5Sum(signStr.getBytes("UTF-8"));
		System.out.println("我们自己拼接的签名：" + signMd5);
		return paypayzhu.getSignature().equals(signMd5);
	}
	
	
    /**
     * 判断字符串是否为空
     * @param str
     * @return
     */
    public static boolean isBlank(String str) {
        return str == null || str.trim().length() == 0;
    }

    /**
     * 判断字符串是否为空
     * @param charSequence
     * @return
     */
    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }
	
    /**
     * 生成md5校验码
     *
     * @param srcContent
     * 需要加密的数据
     * @return 加密后的md5校验码。出错则返回null。
     */
    public static String makeMd5Sum(byte[] srcContent) {
        if (srcContent == null) {
            return null;
        }

        String strDes = null;

        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(srcContent);
            strDes = bytes2Hex(md5.digest()); // to HexString
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
        return strDes;
    }
	
    /**
     * 将byte转换为字符串
     *
     * @param byteArray
     * @return
     */
    private static String bytes2Hex(byte[] byteArray) {
        StringBuffer strBuf = new StringBuffer();
        for (int i = 0; i < byteArray.length; i++) {
            if (byteArray[i] >= 0 && byteArray[i] < 16) {
                strBuf.append("0");
            }
            strBuf.append(Integer.toHexString(byteArray[i] & 0xFF));
        }
        return strBuf.toString();
    }
    	

}
