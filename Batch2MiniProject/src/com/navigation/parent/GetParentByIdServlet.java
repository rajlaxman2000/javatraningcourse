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
import com.student.dto.SchoolBranch;
import com.student.service.BranchService;
import com.student.service.ParentService;
import com.student.service.impl.BranchServiceImpl;
import com.student.service.impl.ParentServiceImpl;

public class GetParentByIdServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		int parentId = Integer.parseInt(request.getParameter("branchId"));
		
		ParentService parentService = new ParentServiceImpl();
		
		Parent parentbyID = parentService.getParentById(parentId);
		
		HttpSession session = request.getSession();
		session.setAttribute("parentbyID", parentbyID);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp_project_parent/getParentByIdDisplay.jsp");
		dispatcher.forward(request, response);
	}
}