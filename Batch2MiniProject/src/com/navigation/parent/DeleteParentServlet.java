package com.navigation.parent;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.student.service.BranchService;
import com.student.service.ParentService;
import com.student.service.impl.BranchServiceImpl;
import com.student.service.impl.ParentServiceImpl;

public class DeleteParentServlet extends HttpServlet {
public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		int studentid = Integer.parseInt(request.getParameter("studentId"));
		
		ParentService parentService = new ParentServiceImpl();
		
		int delParent = parentService.delParentByStudID(studentid);
		//deleteBranch(id);
				
		HttpSession session = request.getSession();
		session.setAttribute("parentRowsDeleted", delParent);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp_project_parent/deleteParentDisplay.jsp");
		dispatcher.forward(request, response);	
		
	}
}
