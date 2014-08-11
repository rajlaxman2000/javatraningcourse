package com.basic.classes;

public class EncapsulationTest {
	
	public static void main(String[] args){
		Student student = new Student();
		student.setAge(1000);
		
		System.out.println("Type1 Student age ::"+student.getAge());
		
		StudentType2 studentType2 = new StudentType2();
		studentType2.age =1000;
		System.out.println("Type2 Student age::"+studentType2.age);
	}
	
	
	 

}
