package servlets.sample;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HeaderValuesServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		PrintWriter out= response.getWriter(); 
		out.println("<h1> Your login name is : </h1>");
		Enumeration headerNames = request.getHeaderNames();
		while(headerNames.hasMoreElements()){
			String headerName = (String)headerNames.nextElement();
		
			System.out.println("Parameter Name : :"+headerName+" -- Its Value : "+request.getHeader(headerName));
		}
		
		
	}
}
