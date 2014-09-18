package servlets.login;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {	
		// Better not to touch this one
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest httpReq =  (HttpServletRequest)request;
		HttpServletResponse httpRes =  (HttpServletResponse)response;
		
		Cookie[] cookies = httpReq.getCookies();
		
		if( cookies!=null &&(cookies[0].getName()).equalsIgnoreCase("UID")){
			chain.doFilter(request, response);
		}else{
			httpRes.sendRedirect("http://localhost:8080/bt3advjava/login_html/login.html");
		}
		
		
	}

	@Override
	public void destroy() {
		// We need to worry much on this
		
	}
}
