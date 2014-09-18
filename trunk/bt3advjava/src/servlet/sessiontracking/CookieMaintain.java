package servlet.sessiontracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieMaintain extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
	
		String loginId = request.getParameter("username");
		String psd = request.getParameter("password");
		
		String encrpString = loginId+psd;
		PrintWriter out = response.getWriter();		 
		response.setContentType("text/html");
		 
	    
		RequestDispatcher reqDis;
		
		
		 
		if(loginId.equalsIgnoreCase("adithya") && psd.equalsIgnoreCase("1234")){
			Cookie cookie = new Cookie("UID", encrpString);
			
			response.addCookie(cookie);
			response.sendRedirect("http://localhost:8080/bt3advjava/html/cookieDashboard");
		}else{
			
			 out.println("Given credentials doesn't match please try again");
			 reqDis =request.getRequestDispatcher("/html/login_cookie.html");
			reqDis.include(request, response);
			 out.println("Only 3 attempts will be allowed");
		}
	}

}
