package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSortTest {
	
	public static void main(String[] args){
		
		ArrayListSortTest test = new ArrayListSortTest();		
			test.sortArrayList();
	}
	
	public void sortArrayList(){
		
		/*
		StudentForList student1 = new StudentForList(10, "Abhinav", 30, "M.Sc");
		
		StudentForList student2 = new StudentForList(9, "Raghu", 28, "B.Sc");
		
		StudentForList student3 = new StudentForList(10, "Abhinav", 30, "M.C.A");
		
		
		boolean res = student1.equals(student2);
		System.out.println("Result is ::"+res);
		
		boolean res1 = student1.equals(student3);
		
		System.out.println("Result is ::"+res1);
		
		// How to compare to objects to check which one is small and which one is big
		
		int x = student1.compareTo(student2);
		
		System.out.println(x);
		*/
		
		StudentForList student1 = new StudentForList(8, "Abhinav", 30, "M.Sc");
		StudentForList student2 = new StudentForList(3, "Harsha", 23, "M.S");
		StudentForList student3 = new StudentForList(12, "ManiDeep", 23, "M.S");
		StudentForList student4 = new StudentForList(16, "Giri", 31, "Graduation");
		StudentForList student5 = new StudentForList(5, "Phani", 32, "M.Tech");
		
		List<StudentForList> students = new ArrayList<StudentForList>();
		
			students.add(student1);
			students.add(student2);
			students.add(student3);
			students.add(student4);
			students.add(student5);
		
		System.out.println("Student list before sorting");
		System.out.println(students);
		
			Collections.sort(students);
		
		System.out.println("Student list After sorting by ID");
		System.out.println(students);
		
			StudentNameComparator studentNameComparator = new StudentNameComparator();
			Collections.sort(students, studentNameComparator);
			
		System.out.println("Student list After sorting by Name");
		System.out.println(students);
		
		
		/*
		StudentNameComparator studentNameComparator = new StudentNameComparator();
		
			int x = studentNameComparator.compare(student1, student2);
		System.out.println("Result :: "+x);
		*/
	}

}
