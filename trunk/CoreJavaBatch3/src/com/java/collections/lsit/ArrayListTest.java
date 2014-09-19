package com.java.collections.lsit;

import java.util.List;
import java.util.ArrayList;

import com.java.collections.StudentForList;

public class ArrayListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//ArrayList<StudentForList> studentsList1 = new ArrayList<StudentForList>();
		
		List<StudentForList> students = new ArrayList<StudentForList>();
		
			StudentForList student1 = new StudentForList(1, "Rajesh", 30, "M.Sc");
			StudentForList student2 = new StudentForList(2, "Harsha", 23, "M.S");
			StudentForList student3 = new StudentForList(3, "ManiDeep", 23, "M.S");
			StudentForList student4 = new StudentForList(4, "Raghu", 31, "Graduation");
			StudentForList student5 = new StudentForList(5, "Ravi", 32, "M.Tech");
			
			StudentForList student6 = new StudentForList(6, "Ramaesh", 27, "B.Sc");
			
			students.add(student1);
			students.add(student2);
			students.add(student3);
			students.add(student4);
			students.add(student5);
			students.add(student5);
			
			
			students.add(2,student6);
			System.out.println("Student List \n");
			/*
			 
			for(int i=0;i<students.size();i++){
				System.out.println(students.get(i));
			}
			System.out.println(students);
			
			*/
			
			for(StudentForList student:students){
				
				System.out.println(student);
			}
			
			//students.remove(4);
			//students.remove(student5);
			students.remove(student5);
			
			System.out.println("Displaying after removing Student List \n");
			
			for(StudentForList student:students){				
				System.out.println(student);
			}
			
			//boolean res = students.contains(new StudentForList(5, "Ravi", 32, "M.Tech"));
			//boolean res = students.contains(student3);
		
			
			StudentForList tmpStudent = new StudentForList(5, "Ravi", 32, "M.Tech");
			
			boolean res = students.contains(tmpStudent);
			
			
			if(res == true){
				System.out.println("Given student exist in the students list");
			}else{
				System.out.println("Given student doesn't exist in the students list");
			}
			
	}

}
