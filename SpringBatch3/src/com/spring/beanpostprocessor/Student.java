package com.spring.beanpostprocessor;

public class Student {
	
	private int id;
	
	private String name;
	
	
	public String toString(){
		return "Student Id:: "+id+"; student Name:: "+name;
	}
	
	
	public Student(){
		System.out.println("Constructor in Student");
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
