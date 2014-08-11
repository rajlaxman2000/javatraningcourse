package com.basic.defaultmethods;

public class StudentTest{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student student = new Student("Raghu", 1, 20);
		Student student1 = new Student("Raghu", 1, 20);
		
		Student student2 = student;
		
		// hasCode, equals, toString, getClass
		System.out.println("student hash code:: "+student.hashCode());
		System.out.println("student1 hash code:: "+student1.hashCode());

		boolean isEqual = student.equals(student1);
		
		System.out.println("Checking with equals method ::"+isEqual);
		
		if(student == student2){
			isEqual = true;
		}else{
			isEqual = false;
		}
		
		System.out.println("Checking with == symbol ::"+isEqual);
		
		byte b = 1;
		
		short s = 10;
		
		int i = 1000;
		
		System.out.println(i);
		
		b=(byte) i;
		
		System.out.println(b);
		
		
	}
	

}
