package com.basic.classes;

public class Student {
	
	private String sName;
	private int sNo;
	private int age;
	
	/**
	 * @return the sName
	 */
	public String getsName() {
		return sName;
	}
	/**
	 * @param sName the sName to set
	 */
	public void setsName(String sName) {
		this.sName = sName;
	}
	/**
	 * @return the sNo
	 */
	public int getsNo() {
		return sNo;
	}
	/**
	 * @param sNo the sNo to set
	 */
	public void setsNo(int sNo) {
		this.sNo = sNo;
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
		if(age>0 && age<=100){
			this.age = age;
		}else{
			System.err.println("Please be logic check wht you are entering");
		}
	}
	
	

}
