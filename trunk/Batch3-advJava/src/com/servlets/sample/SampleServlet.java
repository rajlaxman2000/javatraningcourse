/**
 * 
 */
package com.servlets.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SampleServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		//System.out.println("Testing ");
		String name=  request.getParameter("name");
		String psd = request.getParameter("password");
		String first_name = request.getParameter("firstname");
		String last_name = request.getParameter("lastname");
		String middle_name = request.getParameter("middlename");
		//request.getParameter("name");
		PrintWriter out= response.getWriter(); 
		out.println("<h2> Your login name is : </h2>"+name);
		out.println("<h2> Your password is   : </h2>"+psd);
		out.println("<h2> Your First Name is : </h2>"+first_name);
		out.println("<h2> Your last Name is : </h2>"+last_name);
		out.println("<h2> Your middle name : </h2>"+middle_name);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	    
		
	}
	
	

}
