package com.java.staticexamples;

public class Student {
	
	private int id;
	
	private String name;
	
	public static String schoolName="Bhashyam";
	
	public static void testMethod(){
		System.out.println("I am from method testMethod of Student class");
	}
	
	static{
		System.out.println("I am the static block from student class");
	}
	
	public Student(){
		System.out.println("I am from constructor");
	}
	

	/**
	 * @param id
	 * @param name
	 */
	public Student(int id, String name) {
		
		System.out.println("I am from constructor");
		this.id = id;
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	
	

}
