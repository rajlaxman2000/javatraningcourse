package com.navigation.branch;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.student.dto.SchoolBranch;
import com.student.service.BranchService;
import com.student.service.impl.BranchServiceImpl;

public class AllBranchesServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{

		BranchService branchService = new BranchServiceImpl();
		
		List<SchoolBranch> branchList = branchService.getBranchDetails();
		
		HttpSession session = request.getSession();
		session.setAttribute("branchList", branchList);
		/*PrintWriter out=response.getWriter();
		out.println(branchList);*/
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp_project/getAllBranchesDisplay.jsp");
		dispatcher.forward(request, response);
	}
}
