package com.java.objectMethods;

public class Student {
	
	private int id;
	
	private String name;
	
	private int age;
	
	/*
	public String toString(){
		return "Student Id::"+id+"; Name::"+"; name"+"; Age::"+age;
	}
*/
	
	 public boolean equals(Object obj) {
		 
		 Student student = (Student) obj;
		 
		 String name1 = this.name;
		 String name2 = student.name;
		 
		 if(	this.id == student.id 
				 && 
				 name1.equalsIgnoreCase(name2)
				 ){
			 return true;
		 }
		return false; 
	 }
	 
	 
	 public int hashCode(){	
		 
		 int nameHashCode = name.hashCode();
		 
		 return id+nameHashCode;
	 }
	 
	 
	
	public Student(){
		
	}
	
	/**
	 * @param id
	 * @param name
	 * @param age
	 */
	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
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
	
	
	
	
	

}
