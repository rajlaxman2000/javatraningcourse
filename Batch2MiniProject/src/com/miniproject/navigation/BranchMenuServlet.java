package com.miniproject.navigation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BranchMenuServlet extends HttpServlet {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		
		RequestDispatcher req = request.getRequestDispatcher("/html_project/branch_menu.html");
		req.forward(request, response);
}
}
