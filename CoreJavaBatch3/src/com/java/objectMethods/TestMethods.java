package com.java.objectMethods;

public class TestMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Student student1 = new Student(10,"Harsha",23);
		
		Student student2 = new Student(20,"Mani",24);
		
		Student student3 = new Student();
		
		Student student4 = new Student();
		
		Student student5 = new Student();
		
		student3 = student1;
			
		//int code = student.hashCode();
		System.out.println("Student1 hash code::"+student1.hashCode());
		
		System.out.println("Student2 hash code::"+student2.hashCode());
		
		System.out.println("Student3 hash code::"+student3.hashCode());

		/*
		if(student1==student2){
			System.out.println("Student1 and Student2 are equal ");
		}else{
			System.out.println("Student1 and Student2 are not equal ");
		}
		
		if(student1==student3){
			System.out.println("Student1 and Student3 are equal ");
		}else{
			System.out.println("Student1 and Student3 are not equal ");
		}
		
	*/
		if(student1.equals(student2)){
			System.out.println("Student1 and Student2 are equal ");
		}else{
			System.out.println("Student1 and Student2 are not equal ");
		}
		
		if(student1.equals(student3)){
			System.out.println("Student1 and Student3 are equal ");
		}else{
			System.out.println("Student1 and Student3 are not equal ");
		}
		
		if(student4.equals(student5)){
			System.out.println("Student4 and Student5 are equal ");
		}else{
			System.out.println("Student4 and Student5 are not equal ");
		}
	}

}
