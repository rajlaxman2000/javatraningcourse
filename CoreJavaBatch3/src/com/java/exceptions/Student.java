package com.java.exceptions;

public class Student {

	private int sNo;
	
	private int age;
	
	private String name;
	
	public String toString(){
		return "Id:: "+sNo+"; age:: "+age+"; name:: "+name;
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
	 * @throws AgeNegitiveException 
	 */
	public void setAge(int age) throws AgeNegitiveException {
		
		if(age<0){
			AgeNegitiveException ageNegitiveException = new AgeNegitiveException("Age can't be negitive, given value is :: "+age);
			throw ageNegitiveException;
		}else{
			this.age = age;
		}
		
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
