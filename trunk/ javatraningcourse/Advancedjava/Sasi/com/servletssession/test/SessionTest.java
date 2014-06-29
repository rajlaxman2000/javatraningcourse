package com.servletssession.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Request;

/**
 * Servlet implementation class SessionTest
 */
public class SessionTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SessionTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		int age1=Integer.parseInt(request.getParameter("age"));
		int c=age1*age1;
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		if((name!="" && name!=null)){
		session.setAttribute("SessionName", name);
		session.setAttribute("SessionAge", age);
		}
out.println("Session Objects:"+(String) session.getAttribute("SessionName"));
out.println("Session Age:"+(String)session.getAttribute("SessionAge"));
		out.println("Name:"+name+"</br>");
		out.println("Age :"+age+"</br>");
		out.println("Twice Age"+c+"</br>");
	}

}
