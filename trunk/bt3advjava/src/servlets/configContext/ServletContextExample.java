package servlets.configContext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextExample extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		
		
		ServletConfig servletConfig = getServletConfig();
		
		ServletContext servletContext = servletConfig.getServletContext();
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("<h2>Data base user id:: "+servletContext.getInitParameter("username")+"</h2");
		out.println("</body></html>");
		
	}
}
