package com.struts.sample;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.dto.Student;

public class FormAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private Student student;
	
	private Student student1;
	
	
	public String execute(){
		
		System.out.println("I am in sample action class");
		
		System.out.println("Student Name::"+student.getName());
		System.out.println("Student Sno ::"+student.getSno());
		System.out.println("Student Age::"+student.getAge());

		student1 = new Student("Raghu Kumar",200,31);
		
		return "success";
	}
	
	/**
	 * @return the student1
	 */
	public Student getStudent1() {
		return student1;
	}


	/**
	 * @param student1 the student1 to set
	 */
	public void setStudent1(Student student1) {
		this.student1 = student1;
	}


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


	
	
	
}
