package com.nestedclaases;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		OuterClass2 outerClass2 = new OuterClass2();	
		
		OuterClass2.Inner inner = outerClass2.new Inner();
		
		inner.msg();

	}

}
