package servlets.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		String loginId = request.getParameter("username");
		String psd = request.getParameter("password");
		
		
		String encrpString = loginId+psd;
		User user = new User("Adithya", 24, "Technical Guy");
		PrintWriter out = response.getWriter();		 
		response.setContentType("text/html");
		 
	    
		RequestDispatcher reqDis;
		
		
		 
		if(loginId.equalsIgnoreCase("adithya") && psd.equalsIgnoreCase("1234")){
			Cookie cookie = new Cookie("UID", encrpString);
				ServletContext context =  getServletContext();
				context.setAttribute("profileDetails", user);
			response.addCookie(cookie);
			response.sendRedirect("http://localhost:8080/bt3advjava/login_html/Dashboard");
		}else{
			
			 out.println("Given credentials doesn't match please try again");
			 reqDis =request.getRequestDispatcher("/html/login_cookie.html");
			reqDis.include(request, response);
			 out.println("Only 3 attempts will be allowed");
		}
		
	}

}
