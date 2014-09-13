package servlets.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sample extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public void init()throws ServletException {
		// Do required initialization 
		message ="Hello World"; 
		System.out.println("I am in init method of sampel servlet ::"+message);
	}	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		System.out.println("I am in doget method of Sample servlet");
		// Set response content type 
		response.setContentType("text/html"); 
		// Actual logic goes here. 
		PrintWriter out= response.getWriter(); 
		out.println("<h1>"+ message +"</h1>");
		out.println("Hi guys I am good");
	} 
	
	public void destroy() { 
			System.out.println("Destroy called");
	}

}
