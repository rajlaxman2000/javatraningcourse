package com.basic.defaultmethods;

public class ShapeDetailsNewImpl implements ShapeDetails {

	@Override
	public void printDetails(Shape shape) {
		System.out.println("******* This is modified way of printing the details ********");
		shape.calArea();
		
	}

	
}
