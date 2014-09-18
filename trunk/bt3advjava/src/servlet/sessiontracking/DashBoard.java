package servlet.sessiontracking;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DashBoard extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
	
		PrintWriter out= response.getWriter(); 
		Cookie[] cookies = request.getCookies();
		
	
		out.println("<html><body>");
		
		
		String val = cookies[0].getValue();
		out.println("<h2> User cookie :: "+val);
		
		/*
		Cookie tempCookie = cookies[0];
		tempCookie.setMaxAge(0);
		
		response.addCookie(tempCookie);
		*/
		out.println("</body></html>");
		
	}

}
