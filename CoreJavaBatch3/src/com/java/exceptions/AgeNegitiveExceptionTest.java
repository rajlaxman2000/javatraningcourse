package com.java.exceptions;

public class AgeNegitiveExceptionTest {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args){
		
		Student student = new Student();
		
		student.setsNo(10);
		
		student.setName("Harsha");
		
		try {
			student.setAge(-12);
		} catch (AgeNegitiveException e) {
			
			System.err.println(e.getMessage());
			
		}
		
		System.out.println(student);
	}
	
}
