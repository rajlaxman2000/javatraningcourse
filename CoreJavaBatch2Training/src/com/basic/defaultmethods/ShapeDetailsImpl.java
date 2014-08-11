package com.basic.defaultmethods;

public class ShapeDetailsImpl implements ShapeDetails{

	@Override
	public void printDetails(Shape shape) {
		shape.calArea();		
	}

}
