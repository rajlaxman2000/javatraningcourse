package com.basic.defaultmethods;

public class ShapeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ShapeDetails shapeDetails = new ShapeDetailsNewImpl();
		
		
		/*ShapeDetailsImpl shapeDetailsImpl = new ShapeDetailsImpl();
		 * 
		Circle circle = new Circle();		
		shapeDetailsImpl.printDetails(circle);
		
		Square square = new Square();
		shapeDetailsImpl.printDetails(square);
		 */
		
		
		Circle circle = new Circle();		
		shapeDetails.printDetails(circle);
		
		Square square = new Square();
		shapeDetails.printDetails(square);

	}

}
