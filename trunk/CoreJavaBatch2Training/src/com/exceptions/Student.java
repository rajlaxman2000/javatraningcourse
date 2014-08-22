package com.exceptions;

public class Student {
	
	private int no;
	
	private int age;
	
	public String toString(){
		return "No::"+no+"; Age ::"+age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age) throws AgeNotPermittedException {
		if(age<0 || age>100){
			throw new AgeNotPermittedException("Age seems to be out of bound, please chekc the value"+age);
		}else{
			this.age = age;
		}
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}



	
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
