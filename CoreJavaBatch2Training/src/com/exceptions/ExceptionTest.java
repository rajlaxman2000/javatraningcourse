package com.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;



public class ExceptionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Statment 1");
		System.out.println("Statment 2");
		
		File file = new File("student.txt");
		
		Student student = new Student();
		
		try {
			student.printDetails();
		} catch (ArithmeticException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		try {
			
			Scanner scanner = new Scanner(file);
			
		} catch (FileNotFoundException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
		try{			
		
			System.out.println("Statment 3"+5/0);
			
		}catch(Exception exception){			
			System.out.println("I am in catch block");
		}finally{
			
			System.err.println("There was problem happend");
			
		}
		
		System.out.println("Statment 4");
		System.out.println("Statment 5");
		
	}

}
