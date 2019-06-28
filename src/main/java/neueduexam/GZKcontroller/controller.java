package neueduexam.GZKcontroller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import neueduexam.DTFservice.UserService;
import neueduexam.GZKservice.GZKUserService;
import neueduexam.api.IdCodeApi;
import neueduexam.api.SHAjiamiApi;
import neueduexam.api.messageApi;
import neueduexam.entity.questionlib;
import neueduexam.entity.user;
import neueduexam.entity.userbuylib;
@Controller
public class controller {
	    @Autowired
	    GZKUserService userservice;
	    @Autowired
		UserService tuserservice;
		@RequestMapping("/tologin")
		public String tologin(){
			
			return "login";
		}
		@RequestMapping("/toaddexam")
		public String toaddexam(HttpServletRequest req){
			return "addexam";
		}
		@RequestMapping("/logincontroller")
		public String logincontroller(HttpServletRequest req) throws Exception{
			String phone=req.getParameter("phone");
			System.out.println("phone"+phone);
			List<user> list=userservice.login(phone);
			String password = req.getParameter("password");
			SHAjiamiApi SHAjiamiApi=new SHAjiamiApi();
			password =SHAjiamiApi.shaEncode(password);
			if (list.size()==0) 
			{
				req.setAttribute("errorMsg", "0");
				return "login";
			} 
			else 
			{
				user user=list.get(0);
				if (password.equals(user.getPassword()))
				{
					
					req.getSession().setAttribute("user", user);
					return "mojiaohome";
				}
				 
			    else 
			    {
					req.setAttribute("errorMsg", "1");
					return "login";
				}
			}
		}
		@RequestMapping("/toregister")
		public String toregister(){
			return "register";
		}
		
		@RequestMapping("/registerAjax")
		@ResponseBody
		public String registerAjax(HttpServletRequest req){
			
			String phone=req.getParameter("phone");
			List<user> list=userservice.login(phone);
			String flag="1";
			
			if (list.size()==0) 
			{
				flag="0";
			} 
			return flag;		    
		}
			@RequestMapping("/phoneAjax")
			@ResponseBody
			public String phoneAjax(HttpServletRequest req){
				messageApi messageapi=new messageApi();
				String phone=req.getParameter("phone");
				
				String code=messageapi.messagecode(phone);
				code=code.split(":")[1];
				return code;
			}
			@RequestMapping("/identityAjax")
			@ResponseBody
			public String identityAjax(HttpServletRequest req){
				
				String identityCard=req.getParameter("identityCard");
				List<user> list=userservice.identity(identityCard);
				String flag="1";
				
				if (list.size()==0) 
				{
					flag="0";
				} 
				return flag;		    
			}
			@RequestMapping("/IdentificationAjax")
			@ResponseBody
			public boolean IdentificationAjax(HttpServletRequest req){
				IdCodeApi idCodeApi=new IdCodeApi();
				String realName=req.getParameter("realName");
				String identityCard=req.getParameter("identityCard");
				boolean is=idCodeApi.istrue(realName, identityCard);
				
				System.out.println(is);
				return is;
			}
			@RequestMapping("/registercontroller")
			public String registercontroller(HttpServletRequest req) throws Exception{
				String phone=req.getParameter("phone");
				String realName=req.getParameter("realName");
				String identityCard=req.getParameter("identityCard");
				String password = req.getParameter("password");
				String nickName = req.getParameter("nickname");
				String email = req.getParameter("email");
				int i=userservice.register(phone, password, realName, identityCard, nickName,email);
				if (i>0) 
				{
					
					return "login";
				} 
				else 
				{
					return "register";
				}
			}
			@RequestMapping("/toshop")
			public String shop(HttpServletRequest req){
				return "shop";
			}
			@RequestMapping("/shoplist")
			@ResponseBody
			public List<questionlib> shoplist(HttpServletRequest req){
				String search=req.getParameter("search");
				List<questionlib> list= userservice.selectlist(search);
				List<questionlib> list1= userservice.selectlistbytype(search);
				List<questionlib> list2= userservice.selectlistbypro(search);
				HashMap<Integer, String> hash=new HashMap<Integer, String>();
				for(int i=0;i<list.size();i++)
				{
					hash.put(list.get(i).getLibid(), "id");
				}
				
			
				for(int i=0;i<list1.size();i++)
			    {
				
			        if(hash.get(list1.get(i).getLibid())==null)
			        {
			    	list.add(list1.get(i));
			    	hash.put(list1.get(i).getLibid(), "id");
			        }
			    }
				
				for(int i=0;i<list2.size();i++)
			    {
				
			        if(hash.get(list2.get(i).getLibid())==null)
			        {
			    	list.add(list2.get(i));
			    	hash.put(list2.get(i).getLibid(), "id");
			    	System.out.println(list2.get(i).getLibid());
			        }
			        System.out.println(list2.get(i).getLibid());
			    }
				
			    return list;
				
			}
			
			@RequestMapping("/buy")
			@ResponseBody
			public String buy(HttpServletRequest req){
				int id=Integer.parseInt(req.getParameter("libid"));
				user user=(user)req.getSession().getAttribute("user");
				questionlib questionlib=userservice.selectlist(id).get(0);
				List<userbuylib> list=userservice.selectByid(user.getUserid());
				for(int i=0;i<list.size();i++)
				{
					if(list.get(i).getLibid()==id)
					{
						return "2";
					}
				}
				if(questionlib.getUserid()==user.getUserid())
				{
					return "0";
				}
				if(questionlib.getLibprice()>user.getPoints())
				{
					return "1";
				}
				userservice.buy(user, questionlib);
			    return "3";
				
			}
			@RequestMapping("/toshowquestionlib")
			public String toshowquestionlib(HttpServletRequest req){
	             int libid=	Integer.parseInt(req.getParameter("libid"));
	             req.setAttribute("libid", libid);
				 
				 
				return "showquestionlib";
			}
			
			@RequestMapping("/selectlibAjax")
			@ResponseBody
			public questionlib selectlibAjax(HttpServletRequest req){
				int id=Integer.parseInt(req.getParameter("libid"));
				questionlib questionlib=userservice.selectlist(id).get(0);
				return questionlib;
				
			}
			
			@RequestMapping("/toadmin11")
				public String toadmin11(){
			
					return "admin11";
				
				}
			
}