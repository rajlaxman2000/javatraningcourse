package com.java.inheritence;

public class Circle  implements Shape{
	
	int radius = 10;

	@Override
	public void draw() {
		System.out.println(" Drwaing Cirlce");
		
	}

	@Override
	public double findArea() {
		
		return (3.14)*10*10;
	}

	
	
}
