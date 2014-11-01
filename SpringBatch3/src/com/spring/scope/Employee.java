package com.spring.scope;

public class Employee {

	private int id;
	
	private String name;
	
	private int age;
	
	
	public void initMethod(){
		System.out.println("I am into Employee init method");
	}
	
	
	public void destroyMethod(){
		System.out.println("I am into Employee destroy method");
	}
	
	public Employee(){
		System.out.println("I am constructor of Single ton employee class");
	}

	public Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	/*
	public String toString(){
		return "Emp Id::"+id+"; Emp Name::"+name+"; Emp Age::"+age;
	}
	*/

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

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	
}