package com.basic.controlstructures;

import java.io.*;
import java.util.Scanner;

public class ControlStructuresTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

		ControlStructures cs = new ControlStructures();
		Scanner scn = new Scanner(new File("Student.txt"));
		String studentsWithDistinction[] = new String[10];
		int arrayCount = 0;
		int rank = 0;
		
		while (scn.hasNext()) {

			int sno = Integer.parseInt(scn.nextLine());
			cs.setSno(sno);
			String sname = scn.nextLine();
			cs.setSname(sname);
			String department = scn.nextLine();
			cs.setDepartment(department);
			int percentage = Integer.parseInt(scn.nextLine());
			cs.setPercentage(percentage);

			System.out.println("Student name is: "+cs.getSname());
			
			// if
			if (cs.getSno() < 0)
				System.out.println("Invalid Student ID");

			// ternary operator
			int section = (cs.getSno() > 0 && cs.getSno() < 200) ? 1 : 2;

			// if else
			if (section == 1)
				System.out.println("This student belongs to section 1");
			else
				System.out.println("This student belongs to section 2");

			// else if
			if (cs.getDepartment().equalsIgnoreCase("Math"))
				System.out.println("Student belongs to Math department");
			else if (cs.getDepartment().equalsIgnoreCase("cs"))
				System.out
						.println("Student belongs to Computer Science department");
			else
				System.out.println("Department name is not valid");

			int p = cs.getPercentage();
			int numberOfDisctinctions = 0;
			String studentwithDistinction = null;
			if (p >= 90){
				rank = 1;
				numberOfDisctinctions++;
				studentwithDistinction = cs.getSname();
				
			}
				
			else if (p >= 75 && p < 90)
				rank = 2;
			else if (p >= 60 && p < 75)
				rank = 3;
			else
				rank = 4;

			
			studentsWithDistinction[arrayCount] = studentwithDistinction;
			arrayCount++;
			
			// switch
			
			switch (rank) {
			
			case 1:
				System.out.println("passed in distinction");
				
				break;
			case 2:
				System.out.println("Passed with good score");
				break;
			case 3:
				System.out.println("passed with average score");
				break;
			default:
				System.out.println("failed");
			}

		}
		
		//for
		System.out.println("Students passes with distinction are: ");
		for(int i=0; i<studentsWithDistinction.length;i++){
			if(studentsWithDistinction[i]!=null)
			{
			
				System.out.println(studentsWithDistinction[i]);
			}
			
		}
		
		if(studentsWithDistinction.length>0){
			
			System.out.println("Students passes with distinction are: ");
			int count =0;
			
			
			//do while
			do{
				if(studentsWithDistinction[count]!=null)
				{
					System.out.println(studentsWithDistinction[count]);
					
				}
				count++;
			}while(count<studentsWithDistinction.length);
		}
	}
}
