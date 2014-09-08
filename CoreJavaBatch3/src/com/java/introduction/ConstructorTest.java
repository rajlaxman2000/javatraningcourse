package com.java.introduction;

public class ConstructorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*// This code is for to under stand variable reference and its behavior to the memory location
		Student student1 = new Student();
			
			student1.setId(1001);
			
			System.out.println(student1);
		
		Student student10;
		
		

		student10 = student1;
		
			System.out.println(student10.getId());
			
			student10.setName("I am Harsha");
			
			System.out.println(student1.getName());
		*/
		// Code sample for constructor concept
		
		
		Student student1 = new Student (1002);
		
		System.out.print(student1);
		

	}

}
