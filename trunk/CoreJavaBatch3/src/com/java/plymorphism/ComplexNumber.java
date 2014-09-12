package com.java.plymorphism;

public class ComplexNumber {
	
	public int realPart;
	
	public int imaginaryPart;	

	/**
	 * @param realPart
	 * @param imaginaryPart
	 */
	public ComplexNumber(int realPart, int imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}

	public String toString(){
		return realPart+"+i"+imaginaryPart;
	}
	
}
