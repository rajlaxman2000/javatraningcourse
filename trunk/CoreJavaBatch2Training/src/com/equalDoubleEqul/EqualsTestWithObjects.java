package com.equalDoubleEqul;

public class EqualsTestWithObjects {

	public static void main(String[] args){
		
		Student std1 = new Student();
		Student std2 = new Student();
		
		boolean result;
		// == should return false
		result = (std1==std2);
		System.out.println("Comparing two different Objects with == operator: " + result);
		      
		//equals should return false because obj1 and obj2 are different
		result = std1.equals(std2);
		System.out.println("Comparing two different Objects with equals() method: " + result);
		      
		// "==" should return true because both obj1 and obj2 points same object
		std1=std2;
		result = (std1==std2);
		System.out.println("Comparing two reference pointing to same Object with == operator: " + result);
		
		result = std1.equals(std2);
		System.out.println("Comparing two reference pointing to same Object with equals operator: " + result);

		//Read more: http://javarevisited.blogspot.com/2012/12/difference-between-equals-method-and-equality-operator-java.html#ixzz3B64W8VDl
	}
}
