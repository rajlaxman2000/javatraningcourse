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
	public static void main(String[] args) throws ParseException {
		
		Date date = new Date();
		//System.out.println(date);
		
		Student student1 = new Student("Adithya", 1, 24,date);
		Student student2 = new Student("Srujana", 2, 24,date);
		
		
		System.out.println(student1);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		date = dateFormat.parse("2014/08/22");	
		
		
		
		System.out.println(student2);		

	}

}
