/**
 * 
 */
package com.struts.actions;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.student.dto.Student;
import com.student.service.StudentService;
import com.student.service.impl.StudentServiceImpl;

public class StudentAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private StudentService studentService;
	private  List<Student> students =null;
	
	public StudentAction(){
		studentService = new StudentServiceImpl();
	}
	
	public String displayAllStudents(){		
			students = studentService.getAllStudents();
			
		if(students==null || students.size()<=0){
			return "failure";
		}
		return Action.SUCCESS;
	}

	/**
	 * @return the studentService
	 */
	public StudentService getStudentService() {
		return studentService;
	}

	/**
	 * @param studentService the studentService to set
	 */
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	/**
	 * @return the students
	 */
	public List<Student> getStudents() {
		return students;
	}

	/**
	 * @param students the students to set
	 */
	public void setStudents(List<Student> students) {
		this.students = students;
	}

	

}
