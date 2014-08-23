package com.equalDoubleEqul;

public class Student {

	private int no;
	
	private String name;
	
	private int age;
	
	public boolean equals(Object object){
				
		Student student = (Student)object;
		
		if( student.getNo() == this.no){
			return true;
		}
		return false;
	}
	
	
	public Student(){
		
	}
	
	/**
	 * @param no
	 * @param name
	 * @param age
	 */
	public Student(int no, String name, int age) {
		this.no = no;
		this.name = name;
		this.age = age;
	}





	/**
	 * @return the no
	 */
	public int getNo() {
		return no;
	}


	/**
	 * @param no the no to set
	 */
	public void setNo(int no) {
		this.no = no;
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
