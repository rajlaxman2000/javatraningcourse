package servlet.attributes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DashBoard extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
	
		PrintWriter out= response.getWriter(); 
		
		out.println("<html><body>");
		
		ServletContext context=getServletContext();  
		
		User usr =  (User)context.getAttribute("logedInUser");
		out.println("<h2> User Name :: "+usr.getUserName());
		out.println("<h2> User Age :: "+usr.getAge());
		out.println("<h2> User Screen name :: "+usr.getScreenName());
		out.println("</body></html>");
		
	}

}
