package com.struts.sample;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.struts.dto.Student;

public class FormAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	

	private Student student;
	

	/**
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}


	/**
	 * @param student the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}


	public String execute(){
		
		System.out.println("I am in sample action class");
		
		System.out.println("Student Name::"+student.getName());
		System.out.println("Student Sno ::"+student.getSno());
		System.out.println("Student Age::"+student.getAge());
		if(student.getAge()<0){
			return "faliure";
		}
		return "success";
	}



	
	
	
}
