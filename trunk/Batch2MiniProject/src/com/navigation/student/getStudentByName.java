package com.navigation.student;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.student.dto.Student;
import com.student.service.StudentService;
import com.student.service.impl.StudentServiceImpl;

/**
 * Servlet implementation class getStudentByName
 */
public class getStudentByName extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getStudentByName() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String studentName = request.getParameter("studentName");
		
		StudentService studentService = new StudentServiceImpl();
		
		Student student = studentService.getStudentByName(studentName); 
		
		HttpSession session = request.getSession();
		session.setAttribute("studentByName", student);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp_project_student/getStudentByNameDisplay.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
