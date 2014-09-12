package com.java.inheritence;

public class Child extends Parent {

	public final String firstName = "Rajesh";
	
	public final String lastName = "Reddy";
	
	public final int propertyValue = 50000;
	
	
	
	public int getAge(){
		return 20;
	}
	
	public String getFullName(){
		
		String name = super.getSurName()+ firstName+ lastName;
		
		return name;
	}
	
	
	public int getPropertyValue(){
		
		int value = super.getPropertyValue() + propertyValue;
		
		return value;
	}
	
	
	
}
