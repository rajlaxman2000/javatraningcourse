package com.java.collections;

public class Equals {

	
	public static void main(String[] args) {
	 //equal and equalsIgnorecase//
		String s1="harsha";
		String s2="manideep";
		String s3="HARSHA";
		String s4="MANIDEEP";
		System.out.println(s1+"equal"+s2+"----"+s1.equals(s2));
		System.out.println(s1+"equal"+s3+"----"+s1.equals(s3));
		System.out.println(s1+"equal"+s3+"----"+s1.equals(s3));
		System.out.println(s2+"equal"+s4+"----"+s2.equalsIgnoreCase(s4));
	}

}
