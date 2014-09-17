package com.java.exceptions;

import java.io.FileNotFoundException;

public class ThrowExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThrowExample example = new ThrowExample();
		example.method1();

	}
	
	public void method1(){
		
		try {
			doSomeOperationsonFiles();
			
		} catch (FileNotFoundException e) {
			
			System.err.println("There seems to be a problem in calling method");
			
			e.printStackTrace();
			
		}
		
	}
	
	public void doSomeOperationsonFiles() throws FileNotFoundException{
		
		System.out.println("I am in doSomeOperationsonFiles methods");
		
		/*
		FileNotFoundException fileNotFoundException = new FileNotFoundException();
		
		throw fileNotFoundException;
		*/
		
		throw(new FileNotFoundException());
		
		
		
		
	}
	

}
