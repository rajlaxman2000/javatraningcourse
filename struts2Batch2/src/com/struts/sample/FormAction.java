package com.struts.sample;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.struts.dto.Student;

public class FormAction extends ActionSupport {

	private static final long serialVersionUID = 1L;	

	private int number;
	
	private Student student;
	
	private Student student1;
	
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#validate()
	 */
	//Shift+alt+j
	public void validate(){
		
		if(number<0){
			addFieldError("number", "can't be negative");
		}
		
		
	}
	
	public String execute(){
		
		System.out.println("I am in sample action class");
		
		System.out.println("Student Name::"+student.getName());
		System.out.println("Student Sno ::"+student.getSno());
		System.out.println("Student Age::"+student.getAge());
		/*
		if(student.getAge()<0){
			return "faliure";
		}
		*/
		student1 = new Student("Raghu Kumar",200,31);
		
		return "success";
	}
	


	

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
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
