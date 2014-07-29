package com.spring.beans;

public abstract class GenericEmployee {
	
	private String name;
	
	

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
		System.out.println("I am called, this is abstart class");
	}
	
	
	
	

}
