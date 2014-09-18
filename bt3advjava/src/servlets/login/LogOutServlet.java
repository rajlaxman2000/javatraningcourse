package servlets.login;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogOutServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		Cookie[] cookies = request.getCookies();
		
		Cookie tmpCookie = cookies[0];
		tmpCookie.setMaxAge(0);
		
		response.addCookie(tmpCookie);
		
		ServletContext context = getServletContext();
		
		context.setAttribute("profileDetails", null);
		
		response.sendRedirect("http://localhost:8080/bt3advjava/login_html/index.html");
		
		
	}

}
