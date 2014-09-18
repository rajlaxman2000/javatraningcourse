package servlets.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProfileServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
	
		PrintWriter out = response.getWriter();		 
		response.setContentType("text/html");
		 
		out.println("<html><body>");
		out.println("<a href='index.html'>Index</a> | <a href='Dashboard'>Profile Settings</a> | <a href='logout'>Logout</a>|	");  
		User user = (User)getServletConfig().getServletContext().getAttribute("profileDetails");
		out.println("Profile User Name   ::"+user.getUserName());
		out.println("Profile Screen Name ::"+user.getScreenName());
		out.println("Profile Age         ::"+user.getAge());
		
		out.println("</body></html>");
		
	}

}
