package com.exceptions;

public class StudentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student student = new Student();
		
		try {
			student.setAge(-11);
		} catch (AgeNotPermittedException ageNotPermittedException) {
			
			ageNotPermittedException.printStackTrace();
			
			
		}
		
		student.setNo(1);

		System.out.println(student);
	}

}
