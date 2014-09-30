package com.navigation.parent;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.student.dto.Parent;
import com.student.service.ParentService;
import com.student.service.impl.ParentServiceImpl;

public class GetAllParentsServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{

		ParentService parentService = new ParentServiceImpl();
		
		List<Parent> parentList = parentService.getParentDetails();
		
		HttpSession session = request.getSession();
		session.setAttribute("parentList", parentList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp_project_parent/getAllParentsDisplay.jsp");
		dispatcher.forward(request, response);
	}
}
