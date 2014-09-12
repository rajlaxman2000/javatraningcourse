package com.java.plymorphism;

public class ExampleOverLoading {
	
	public int add(int a, int b){
		return a+b;
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public float add(int a, float b){
		
		return a+b;
	}
	
	public double add(double a, double b){
		return a+b;
		
	}
	
	public ComplexNumber add(ComplexNumber complexNumber1, ComplexNumber complexNumber2){
		
		ComplexNumber complexNumber = new ComplexNumber(complexNumber1.realPart +complexNumber2.realPart, 
				complexNumber1.imaginaryPart+complexNumber2.imaginaryPart);
		
		
		return complexNumber;
		
	}

}
