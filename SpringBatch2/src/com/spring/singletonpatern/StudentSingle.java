package com.spring.singletonpatern;

public class StudentSingle {
	
	private static StudentSingle studentSingle=null;
	
	private StudentSingle(){
		
	}

	public static StudentSingle getBean(){
		
		if(studentSingle == null){
			studentSingle = new StudentSingle();
		}
		
		return studentSingle; 
	}
}
