package com.exceptions;

import java.io.FileNotFoundException;

public class Student {
	
	private int no;
	
	
	
	/**
	 * @return the no
	 */
	public int getNo() {
		return no;
	}



	/**
	 * @param no the no to set
	 */
	public void setNo(int no) {
		this.no = no;
	}



	public void printDetails() throws ArithmeticException{
		
		System.out.println("I am student class");
		
		ArithmeticException arithmeticException =  new ArithmeticException("please take care of it");
		
		throw arithmeticException;
	}

}
