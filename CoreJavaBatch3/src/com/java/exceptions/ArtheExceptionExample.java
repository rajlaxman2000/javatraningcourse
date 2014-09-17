package com.java.exceptions;

public class ArtheExceptionExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int x = 100;
		
		int y = 0 ;
		
		int div=0;
		
		try{
			div = x/y;
			
		}catch(ArithmeticException arithmeticException){
			System.err.println("I am gettgin some problem");
		}finally{
			System.out.println("Result :: "+div);
		}
		
		
		System.out.println("All my operations are done");
		

	}

}
