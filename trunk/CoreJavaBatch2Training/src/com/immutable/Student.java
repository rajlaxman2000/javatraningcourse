package com.immutable;

import java.util.Date;

public final class Student {
	
	private String name;
	
	private int no;
	
	private int age;
	
	private Date dob;
	
	public Student(){
		
	}

	public Student(String name, int no, int age, Date dob){		
		this.name = name;
		this.no = no;
		this.age = age;		
		this.dob = new Date(dob.getTime());
		//this.dob = dob;
		
	}
	
	public String toString(){
		return "Name:: "+name+"; No::"+no+"; Age::"+age+"; DOB"+dob;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the no
	 */
	public int getNo() {
		return no;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	
	
	
	

}
