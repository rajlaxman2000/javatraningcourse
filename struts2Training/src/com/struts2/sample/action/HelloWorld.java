package com.struts2.sample.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;


public class HelloWorld extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	private Student student;
	
	private Student student2;
	
	public String execute() throws Exception{
		
		
		System.out.println("I am in default execute method of HelloWorld Action class");
		
		return Action.SUCCESS;
	}
	
	public static void main(String[] args){
		System.out.println("Hello world");
	}
	
	public String executeTest() throws Exception{
		System.out.println("I am in cutome executeTest method of HelloWorld Action class");
		if(name.equalsIgnoreCase("redirect")){
			return "customstring"; 
		}
		
		System.out.println(student);
		
		student2 = new Student();
			student2.setName("Karthik");
			student2.setSno(2);
			student2.setAge(20);
			
		return Action.SUCCESS;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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

	/**
	 * @return the student2
	 */
	public Student getStudent2() {
		return student2;
	}

	/**
	 * @param student2 the student2 to set
	 */
	public void setStudent2(Student student2) {
		this.student2 = student2;
	}
	
	
	
	

}
