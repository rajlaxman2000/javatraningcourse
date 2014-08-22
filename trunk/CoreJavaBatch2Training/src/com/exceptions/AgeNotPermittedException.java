package com.exceptions;

public class AgeNotPermittedException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public AgeNotPermittedException(String message){
		super(message);
	}

}
