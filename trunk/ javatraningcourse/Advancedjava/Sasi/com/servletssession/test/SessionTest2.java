package com.servletssession.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;

/**
 * Servlet implementation class SessionTest2
 */
public class SessionTest2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SessionTest2() {
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
		String uid = request.getParameter("uid");
		String psw = request.getParameter("pass");
		HttpSession session = request.getSession();
		Date LastAccessTime = new Date(session.getLastAccessedTime());
		PrintWriter out = response.getWriter();
		if ((uid != "" && uid != null) && (psw != "" && psw != null)) {
			session.setAttribute("sessionId", uid);
			session.setAttribute("sessionPsw", psw);
		}
		if (((String) session.getAttribute("sessionId"))
				.equalsIgnoreCase("dale")
				&& ((String) session.getAttribute("sessionPsw"))
						.equalsIgnoreCase("dale420")) {
			response.setIntHeader("Refresh", 1);
			out.println("Welcome to The Site: "
					+ session.getAttribute("sessionId"));
			out.println("Last Login Time: " + LastAccessTime);
		} else if (((String) session.getAttribute("sessionId"))
				.equalsIgnoreCase("dale")
				&& ((String) session.getAttribute("sessionPsw")) != "dale420") {
			out.println("Password is Incorrect");
		} else if (((String) session.getAttribute("sessionPsw"))
				.equalsIgnoreCase("dale420")
				&& ((String) session.getAttribute("sessionId")) != "dale") {
			out.println("User ID  is Incorrect");
		} else {
			out.println("Both User ID and Password Are Incorrect");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// doGet(request, response);
	}

}
