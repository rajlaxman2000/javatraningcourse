package servlets.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		System.out.println("I am in doget method of Sample servlet");
		// Set response content type 
		String loginName = request.getParameter("name");
		String password = request.getParameter("password");
		response.setContentType("text/html"); 
		// Actual logic goes here. 
		PrintWriter out= response.getWriter(); 
		out.println("<h1> Your login name is : "+ loginName +"</h1>");
		out.println("<h1> Entered pass word is : "+ password +"</h1>");
	} 

}
