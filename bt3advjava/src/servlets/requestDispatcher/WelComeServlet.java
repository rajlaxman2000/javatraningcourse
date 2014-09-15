package servlets.requestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelComeServlet  extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		PrintWriter out = response.getWriter();
		 
		 response.setContentType("text/html");
		 
	    out.print("<html><body>");
	    out.println("<h1> WelCome "+request.getParameter("username"));
	    out.print("</body></html>");
	}
}
