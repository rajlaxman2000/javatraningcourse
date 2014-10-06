package com.spring.sample;

public class Student {
	
	private int sno;
	
	private String name;
	
	private int age;
	
	public String toString(){
		
		return "SNO ::"+sno+"; Name::"+name+"; Age::"+age;
	}
	
	public Student(){
		
	}	

	public Student(int sno, String name, int age) {		
		this.sno = sno;
		this.name = name;
		this.age = age;
	}





	/**
	 * @return the sno
	 */
	public int getSno() {
		return sno;
	}

	/**
	 * @param sno the sno to set
	 */
	public void setSno(int sno) {
		this.sno = sno;
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
