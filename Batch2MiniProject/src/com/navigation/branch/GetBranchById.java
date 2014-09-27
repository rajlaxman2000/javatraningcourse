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

public class GetBranchById extends HttpServlet {
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		int id = Integer.parseInt(request.getParameter("branchId"));
		
		BranchService branchService = new BranchServiceImpl();
		SchoolBranch branchbyID = branchService.getBranchById(id);
		
		HttpSession session = request.getSession();
		session.setAttribute("branchbyID", branchbyID);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp_project/getBranchByIdDisplay.jsp");
		dispatcher.forward(request, response);
	}
}
