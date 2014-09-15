package com.java.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionExample {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		String fileName = "sample.txt"; 
		FileReader fileReader = new FileReader(fileName);
		
		

	}

}
