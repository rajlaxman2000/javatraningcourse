package com.java.exceptions;

public class ThrowsExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThrowsExample example = new ThrowsExample();
		example.method1();

	}
	
	public void method1(){
		
		float x=0;
		try{
		
			 x = divideValues(10,0);
			
		}catch(ArithmeticException arithmeticException){
			
			System.err.println("problamatic code");
		
		}
		
		System.out.println("result ::"+x);
	}
	
	public float divideValues(int a, int b) throws ArithmeticException{
		
		return a/b;
		
	}
	

}
