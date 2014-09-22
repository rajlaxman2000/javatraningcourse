package servlets.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.reflect.ReflectionFactory.GetReflectionFactoryAction;

public class DashBoardServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		/*
		PrintWriter out = response.getWriter();		 
		response.setContentType("text/html");
		 
		out.println("<html><body>");
		out.println("<a href='index.html'>Index</a> | <a href='profileSettings'>Profile Settings</a> | <a href='logout'>Logout</a>|	");  
		User user = (User)getServletConfig().getServletContext().getAttribute("profileDetails");
		out.println("Logged in User name is ::"+user.getUserName());
		
		out.println("</body></html>");
		*/
		RequestDispatcher reqDis = request.getRequestDispatcher("/login_html/dashboard.jsp");
		reqDis.forward(request, response);
		
	}

}
