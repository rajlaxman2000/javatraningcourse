package com.equalDoubleEqul;

public class EqualsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Student student1 = new Student(1, "Rajesh", 30);
		
		Student student2 = new Student(1, "Raghu", 32);
		
		
		boolean result  = student1.equals(student2);
		
		System.out.println("Student1 and student equals or not :: "+result);
		

	}

}
