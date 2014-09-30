package com.navigation.parent;

import java.io.IOException;

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

public class InsertParentServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		//int id = Integer.parseInt(request.getParameter("parentID"));
		String parentName = request.getParameter("parentName");
		int studentID = Integer.parseInt(request.getParameter("stud_ID"));
		
		ParentService parentService = new ParentServiceImpl();
		
		Parent parent = new Parent(parentName, studentID); 
		
		int insParent = parentService.insertParent(parent);	
				
		HttpSession session = request.getSession();
		session.setAttribute("parentRowsInserted", insParent);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp_project_parent/insertParentDisplay.jsp");
		dispatcher.forward(request, response);	
		
	}
}
