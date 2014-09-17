package com.java.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionExample {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) {
		
		String fileName = "sample.txt"; 
		
		try{
			FileReader fileReader = new FileReader(fileName);
			
		}catch (FileNotFoundException e) {
			
			//System.out.println("There seems to be some problem "+e.getMessage());
			
			System.err.println("There seems to be some problem :: \n"+e.getMessage());
			
		}finally{
			
		}
		
		
		System.out.println("I am team how r u");
		
		

	}

}
