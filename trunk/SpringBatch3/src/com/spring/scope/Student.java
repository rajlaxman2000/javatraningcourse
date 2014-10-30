package com.spring.scope;

public class Student {
	
	private int id;
	
	private String name;
	
	public void initMethod(){
		System.out.println("I am into Student init method");
	}
	
	public void destroyMethod(){
		System.out.println("I am into Student destroy method");
	}
	/*
	public String toString(){
		return "Student Id:: "+id+"; student Name:: "+name;
	}
	*/
	
	public Student(){
		System.out.println("I am constructor of Prototype Student class");
	}
	

	public Student(int id, String name) {
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
