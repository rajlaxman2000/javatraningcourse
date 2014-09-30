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

public class InsertBranchServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		int id = Integer.parseInt(request.getParameter("branchId"));
		String phoneNum = request.getParameter("phoneNumber");
		
		SchoolBranch branch = new SchoolBranch(id, phoneNum);
		
		BranchService branchService = new BranchServiceImpl();
		
		int insBranch = branchService.insertBranch(branch);	
		//updateBranchById(branch);
				
		HttpSession session = request.getSession();
		session.setAttribute("rowsInserted", insBranch);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp_project/insertBranchDisplay.jsp");
		dispatcher.forward(request, response);	
		
	}
	
}
