package com.java.plymorphism;

public class TestOverLoading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ExampleOverLoading exampleOverLoading = new ExampleOverLoading();
		
		ComplexNumber number1 = new ComplexNumber(10, 5);
		
		ComplexNumber number2 = new ComplexNumber(7,6);
		
		
		System.out.println(exampleOverLoading.add(10,6));
		
		ComplexNumber result = exampleOverLoading.add(number1, number2);
	
		
		System.out.println(result);
		
		

	}

}
