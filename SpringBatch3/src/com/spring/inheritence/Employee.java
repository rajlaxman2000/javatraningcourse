package com.spring.inheritence;

public class Employee {

	private int id;
	
	private String name;
	
	private int age;
	
	private String designation;
		
	public Employee(){
		System.out.println("Constructor in Employee");
	}

	public Employee(int id, String name, int age, String designation) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.designation = designation;
	}
	public String toString(){
		return "Emp Id::"+id+"; Emp Name::"+name+"; Emp Age::"+age+"; Emp Designation::"+designation;
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

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	
}
