package com.java.introduction;

public class Student {
	
	private int id;
	
	private String name;
	
	private int age;	
	
	private String dob;
	
	public Student(){
		
	}
	
	public Student(int id){
		this.id=id;
	}
		
	/**
	 * @param id
	 * @param name
	 * @param age
	 * @param dob
	 */
	public Student(int id, String name, int age, String dob) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.dob = dob;
	}
	
	public String toString(){
		return "Student Id:"+id+"; Name:"+name+"; Age:"+age+"; DOB :"+dob;
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
		
		if(age>0 && age<=100)
			this.age = age;
		else
			System.err.println("It seems your trying to set some illogical data :: "+age);
	}

	/**
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
	

}
