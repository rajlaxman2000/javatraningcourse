package servlets.sample;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.net.www.http.HttpClient;

public class FormServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	public void init()throws ServletException {
		// Do required initialization 
		
		System.out.println("I am in init method of sampel servlet ::");
	}	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		/*
		System.out.println("I am in doget method of Sample servlet");
		// Set response content type 
		String loginName = request.getParameter("name");
		
		request.getContextPath();
		String password = request.getParameter("password");
		response.setContentType("text/html"); 
		// Actual logic goes here. 
		PrintWriter out= response.getWriter(); 
		out.println("<h1> Your login name is : "+ loginName +"</h1>");
		out.println("<h1> Entered pass word is : "+ password +"</h1>");
		out.println("<h1> Context path : "+ request.getContextPath() +"</h1>");
		
		System.out.println(request.getRequestURL());
		
		System.out.println(request.getServletPath());
		*/
		PrintWriter out= response.getWriter(); 
		out.println("<h1> Your login name is : </h1>");
		Enumeration names = request.getParameterNames();
		
		while(names.hasMoreElements()){
			String name = (String)names.nextElement();
		
			System.out.println("Parameter Name : :"+name+" -- Its Value : "+request.getParameter(name));
		}
		
		String male = (String)request.getAttribute("male");
		String female = (String)request.getAttribute("female");
		
		System.out.println("Male value ::"+ male);
		System.out.println("Female value ::"+ female);		
		
	} 
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
	
		doGet(request, response);
	}

}
