package com.navigation.student;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.service.StudentService;
import com.student.service.impl.StudentServiceImpl;

/**
 * Servlet implementation class deleteStudentByName
 */
public class deleteStudentByName extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteStudentByName() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String studentName = request.getParameter("studentId");
		
		StudentService studentService = new StudentServiceImpl();
		
		boolean deletedName = studentService.deleteStudentByName(studentName);
		request.setAttribute("deletedStudentName", deletedName);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp_project_student/deleteStudentByNameDisplay.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
