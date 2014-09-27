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

public class UpdateBranchServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		int id = Integer.parseInt(request.getParameter("id"));
		String phone = request.getParameter("phoneNumber");
		
		SchoolBranch branch = new SchoolBranch(id, phone);
		
		BranchService branchService = new BranchServiceImpl();
		
		int updBranch = branchService.updateBranchById(branch);
				
		HttpSession session = request.getSession();
		session.setAttribute("rowsUpdated", updBranch);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp_project/updateBranchDisplay.jsp");
		dispatcher.forward(request, response);
	}
}
