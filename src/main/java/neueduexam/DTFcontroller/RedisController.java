package neueduexam.DTFcontroller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

import neueduexam.entity.personquestion;
import neueduexam.entity.user;
 
/**
 *  @RestController  注解: 不能返回页面了,只能返回数据类型如(String,Object,List,Map)
 * @author Administrator
 *
 */
@RestController
public class RedisController {
	
	//注入
	@Autowired
	StringRedisTemplate template;
    
	@RequestMapping("/getsaveques")
	public List<personquestion> getsaveques(HttpServletRequest res,String testid){
		user u = (user)res.getSession().getAttribute("user");
		int userid = u.getUserid();
		List<personquestion> li = new ArrayList<>();
		if(!template.hasKey("quessave_"+userid+"_"+testid)){
    		return li;
    	}else{
    		Map<Object, Object> resultMap= template.opsForHash().entries("quessave_"+userid+"_"+testid); //获取整个map,一个key对应一个value 
    		Set<Object> resultMapSet=template.opsForHash().keys("quessave_"+userid+"_"+testid); 
    		Iterator<Object> it = resultMapSet.iterator();  
    		while (it.hasNext()) {  
    		  String str = (String) it.next();  
    		  String quesanswer =(String)template.opsForHash().get("quessave_"+userid+"_"+testid,str);
    		  personquestion pq = new personquestion();
    		  pq.setQuesid(Integer.parseInt(str));
    		  pq.setStuanswer(quesanswer);
    		  li.add(pq);
    		}  
    	}
		
		return li;
	}
	
	@RequestMapping("/savequestion")
	public int  savequestion(HttpServletRequest res,String answerlist,String testid) {
		user u = (user)res.getSession().getAttribute("user");
		int userid = u.getUserid();
		List<personquestion> t = JSONArray.parseArray(answerlist, personquestion.class);
		Map<String,String> map=new HashMap<String,String>();  
		if(!template.hasKey("quessave_"+userid+"_"+testid)){
			for(int i=0;i<t.size();i++) {
				map.put(Integer.toString(t.get(i).getQuesid()), t.get(i).getStuanswer());
			}
			template.opsForHash().putAll("quessave_"+userid+"_"+testid,map); 
    	}else{
    		template.delete("quessave_"+userid+"_"+testid);
    		for(int i=0;i<t.size();i++) {
				map.put(Integer.toString(t.get(i).getQuesid()), t.get(i).getStuanswer());
			}
			template.opsForHash().putAll("quessave_"+userid+"_"+testid,map); 
    	}
		return 1;
	}
	
	
	@RequestMapping("/savetime")
	public int savetime(HttpServletRequest res,String hour,String minutes,String seconds,String mycount,String testid) {
		user u = (user)res.getSession().getAttribute("user");
		int userid = u.getUserid();
		Map<String,String> map=new HashMap<String,String>();  
    	map.put("hour",hour);  
    	map.put("minutes",minutes);  
    	map.put("seconds",seconds);  
    	map.put("mycount",mycount);  
		if(!template.hasKey("timesave_"+userid+"_"+testid)){
    		template.opsForHash().putAll("timesave_"+userid+"_"+testid,map); 
    	}else{
    		template.delete("timesave_"+userid+"_"+testid);
    		template.opsForHash().putAll("timesave_"+userid+"_"+testid,map); 
    	}
		return 1;
	}
	
	@RequestMapping("/getsavetime")
	public timetestEntity getsavetime(HttpServletRequest res,String testid) {
		user u = (user)res.getSession().getAttribute("user");
		int userid = u.getUserid();
		timetestEntity save = new timetestEntity();
		if(!template.hasKey("timesave_"+userid+"_"+testid)){
    		save.setState(0);
    		return save;
    	}else{
    		Map<Object, Object> resultMap= template.opsForHash().entries("timesave_"+userid+"_"+testid); //获取整个map,一个key对应一个value 
			String hour =(String)template.opsForHash().get("timesave_"+userid+"_"+testid,"hour");   //获取某个key对应的value的值
			String minutes =(String)template.opsForHash().get("timesave_"+userid+"_"+testid,"minutes");
			String seconds =(String)template.opsForHash().get("timesave_"+userid+"_"+testid,"seconds");
			String mycount =(String)template.opsForHash().get("timesave_"+userid+"_"+testid,"mycount");
			save.setHour(Integer.parseInt(hour));
			save.setMinutes(Integer.parseInt(minutes));
			save.setSeconds(Integer.parseInt(seconds));
			save.setMycount(Integer.parseInt(mycount));
			save.setState(1);
    	}
		return save;
	}
	
    @RequestMapping("/sethashvalue")
    public String setHashValue(){
    	Map<String,String> map=new HashMap<String,String>();  
    	map.put("key1","value1");  
    	map.put("key2","value2");  
    	map.put("key3","value3");  
    	map.put("key4","value4");  
    	map.put("key5","value5"); 
    	if(!template.hasKey("licmap")){
    		template.opsForHash().putAll("licmap",map); 
    		return "使用redis缓存保存数据成功";
    	}else{
    		template.delete("licmap");
    		return "key已存在,已删除";
    	}
    }
    
    @RequestMapping("/gethashvalue")
    public String getHashValue(){
    	if(!template.hasKey("licmap")){
    		return "key不存在，请先保存数据";
    	}else{
			Map<Object, Object> resultMap= template.opsForHash().entries("licmap"); //获取整个map,一个key对应一个value 
			List<Object>reslutMapList=template.opsForHash().values("licmap");  //只获取values的集合
			Set<Object>resultMapSet=template.opsForHash().keys("licmap");  // 只获取key的集合
			String value=(String)template.opsForHash().get("licmap","key1");   //获取某个key对应的value的值
			System.out.println("value:"+value);  
			System.out.println("resultMapSet:"+resultMapSet);  
			System.out.println("resultMap:"+resultMap);  
			System.out.println("resulreslutMapListtMap:"+reslutMapList); 
    		return "获取到缓存中的数据,请查看控制台";
    	}
    }
    
    
//    @RequestMapping("/setobjectvalue")
//    public String setObjectValue(){
//    	User guoer = new User("210104198210223454","杨过",25);
//
//    	String guoerstr = JSON.toJSONString(guoer);
//    	
//    	if(!template.hasKey("guoer")){
//    		template.opsForValue().append("guoer", guoerstr);
//    		return "使用redis缓存保存数据成功";
//    	}else{
//    		template.delete("guoer");
//    		return "key已存在,已删除";
//    	}
//    }
//    
//    
//    @RequestMapping("/getobjectvalue")
//    public String getObjectValue(){
//    	
//    	if(!template.hasKey("guoer")){
//    		return "key不存在，请先保存数据";
//    	}else{
//    		String name = template.opsForValue().get("guoer");//根据key获取缓存中的val
//    		User u  = JSON.parseObject(name,  new TypeReference<User>(){});
//    		
//    		System.out.println(u.getId()+u.getName()+u.getAge());
//    		return "获取到缓存中的数据：guoer="+name;
//    	}
//    } 
    
    
    //template.opsForValue().set("test", "100",60*10,TimeUnit.SECONDS);//向redis里存入数据和设置缓存时间 
    //template.boundValueOps("test").increment(-1);//val做-1操作
    //template.boundValueOps("test").increment(1);//val +1
    //template.opsForValue().get("test")//根据key获取缓存中的val
    //template.getExpire("test")//根据key获取过期时间 (单位毫秒)
//    template.getExpire("test",TimeUnit.SECONDS)//根据key获取过期时间并换算成指定单位
//    template.delete("test");//根据key删除缓存  
//    template.hasKey("546545");//检查key是否存在，返回boolean值  
//    template.expire("red_123",1000 , TimeUnit.MILLISECONDS);//设置过期时间 
//   
//    @RequestMapping("/setvalue")
//    public String setValue(){
//    	if(!template.hasKey("lic::001")){
//    		template.opsForValue().append("lic::001", "我是李潮");
//    		return "使用redis缓存保存数据成功";
//    	}else{
//    		template.delete("lic::001");
//    		return "key已存在,已删除";
//    	}
//    }
//    
//    
//    @RequestMapping("/getvalue")
//    public String getValue(){
//    	
//    	if(!template.hasKey("lic::001")){
//    		return "key不存在，请先保存数据";
//    	}else{
//    		String name = template.opsForValue().get("lic::001");//根据key获取缓存中的val 
//    		return "获取到缓存中的数据：lic="+name;
//    	}
//    }
}



