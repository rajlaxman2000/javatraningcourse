package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sample
 */
public class Sample extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private String message;
	
	public void init()throws ServletException {
		// Do required initialization 
		message ="Hello World"; 
	} 
	
	 public void init(ServletConfig servletConfig) throws ServletException{
		   // this.myParam = servletConfig.getInitParameter("myParam");
		  }
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
			// Set response content type 
		response.setContentType("text/html"); 
		// Actual logic goes here. 
		PrintWriter out= response.getWriter(); 
		out.println("<h1>"+ message +"</h1>");
	} 
	
	public void destroy() { 
			System.out.println("Destroy called");
	}

}
