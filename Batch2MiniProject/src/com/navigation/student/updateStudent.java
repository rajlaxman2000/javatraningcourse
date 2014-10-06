package com.navigation.student;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.dto.Student;
import com.student.service.StudentService;
import com.student.service.impl.StudentServiceImpl;

/**
 * Servlet implementation class updateStudent
 */
public class updateStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int studentId = Integer.parseInt(request.getParameter("studentId"));
		
		String studentName = request.getParameter("studentId");
		
		int branchId = Integer.parseInt(request.getParameter("branchID"));
		
		StudentService studentService = new StudentServiceImpl();
		
		Student student = new Student(studentId,studentName,branchId);
		
		boolean rowsUpdated = studentService.updateStudent(student);
		
		request.setAttribute("updateStudent", rowsUpdated);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp_project_student/updateStudentDisplay.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
