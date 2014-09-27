package com.navigation.branch;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.dto.SchoolBranch;
import com.student.service.BranchService;
import com.student.service.impl.BranchServiceImpl;

public class GetBranchById extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		String id = request.getParameter("branchId");
		request.setAttribute("branchId", id);
		BranchService branchService = new BranchServiceImpl();
			
		SchoolBranch branch = branchService.getBranchById((Integer) request.getAttribute("branchId"));
		PrintWriter out = response.getWriter();
		out.println(branch);
	}
	
}
