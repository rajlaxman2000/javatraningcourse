package com.java.exceptions;

public class AgeNegitiveException extends Exception{

	private static final long serialVersionUID = 1L;

	public AgeNegitiveException(String errMsg){
		super(errMsg);
	}
	
}
