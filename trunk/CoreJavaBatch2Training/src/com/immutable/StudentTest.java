package com.immutable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StudentTest {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException {
		
		Date date = new Date();
		//System.out.println(date);
		
		Student student1 = new Student("Adithya", 1, 24,date);
		
		Student student2 = new Student("Srujana", 2, 24,date);
		
		System.out.println("Objects are created and printing before modification");
		System.out.println("Student 1 ::"+student1);
		System.out.println("Student 2::"+student2);
		
		date.setHours(20);
		date.setDate(3);
		
		Date date2 = student1.getDob();
		
		date2.setDate(30);
		
		System.out.println("\nObjects are created and printing after modification");
		System.out.println("Student 1 ::"+student1);
		System.out.println("Student2 2::"+student2);
		
		/*
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		date = dateFormat.parse("2014/08/22");	
		*/
		
		
		//System.out.println(student2);		

	}

}
