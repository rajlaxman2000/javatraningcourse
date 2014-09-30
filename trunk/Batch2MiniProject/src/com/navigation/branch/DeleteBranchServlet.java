package com.navigation.branch;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.student.dto.SchoolBranch;
import com.student.service.BranchService;
import com.student.service.impl.BranchServiceImpl;

public class DeleteBranchServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		int id = Integer.parseInt(request.getParameter("branchId"));
		
		BranchService branchService = new BranchServiceImpl();
		
		int delBranch = branchService.deleteBranch(id);
		//deleteBranch(id);
				
		HttpSession session = request.getSession();
		session.setAttribute("rowsDeleted", delBranch);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp_project/deleteBranchDisplay.jsp");
		dispatcher.forward(request, response);	
		
	}
}
