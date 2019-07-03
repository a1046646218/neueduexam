package neueduexam.Filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import neueduexam.entity.user;


/**
 * Servlet Filter implementation class CheckSessionFilter
 */
@Component
@WebFilter(filterName="/checkSessionFilter",urlPatterns="/*")
public class CheckSessionFilter implements Filter {

    /**
     * Default constructor. 
     */
    public CheckSessionFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		 HttpServletRequest req = (HttpServletRequest)request;//�Ƚ�ԭʼ��requestת���ɷ���httpЭ���request����
			String url = req.getServletPath();//��ȡ��վ��Ŀ¼֮�������,��/login?id=zhangsan
			//System.out.println("url:-----------"+url);
			if(url.contains("login")
					||url.contains("register")||url.contains("IdentificationAjax")||url.contains("Ajax")
				||url.contains("main")||url.contains("ForNewsServlet")||url.endsWith("css")||url.endsWith("js")||url.endsWith("jpg")
				||url.endsWith("db")||url.endsWith("png")||url.endsWith("eot")||url.endsWith("svg")||url.endsWith("ttf")||url.endsWith("woff")
				||url.endsWith("woff2")||url.endsWith("otf")||url.endsWith("jpeg"))
					{
				chain.doFilter(request, response);
				return;
			}
			
			user u = (user)req.getSession().getAttribute("user");
			if (null!=u) {
				chain.doFilter(request, response);
			}else{
				req.getRequestDispatcher("tologin").forward(request, response);
			}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
