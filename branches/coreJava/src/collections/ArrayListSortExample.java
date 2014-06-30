package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayListSortExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<StudentBeanList>  students = new ArrayList<StudentBeanList>();		
		StudentBeanList std1  = new StudentBeanList(201,2,"RAjesh");		
		StudentBeanList std2  = new StudentBeanList(101,10,"Sasi");		
		StudentBeanList std3  = new StudentBeanList(150,9,"Suny");		
		StudentBeanList std4  = new StudentBeanList(2030,7,"Karthik");		
		students.add(std3);
		students.add(std2);
		students.add(std4);		
		students.add(std1);
		
		System.out.println("********Studnets List before Sorting********");
		for(StudentBeanList student:students){
			System.out.println("Student Roll no ::"+student.getRollno());
			System.out.println("Student class ::"+student.getStandard());
			System.out.println("Student name ::"+student.getName());
		}		
		System.out.println("********Studnets List After Sorting********");		
		
		Collections.sort(students);
		for(StudentBeanList student:students){
			System.out.println("Student Roll no ::"+student.getRollno());
			System.out.println("Student class ::"+student.getStandard());
			System.out.println("Student name ::"+student.getName());
		}
		
		
		/*
		 * 		public static <T extends Comparable<? super T>> void sort(List<T> list) {
				StudentBeanList implements comparable
				StudentBeanRefined extends StudentBeanList		
		 		public static <T> void sort(List<T> list, Comparator<? super T> c) {
		 */
		System.out.println("********Studnets List sorted on name base ****");	
		Collections.sort(students, new StudentBeanNameComparator());
		for(StudentBeanList student:students){
			System.out.println("Student Roll no ::"+student.getRollno());
			System.out.println("Student class ::"+student.getStandard());
			System.out.println("Student name ::"+student.getName());
		}
		
		System.out.println("Traversing the List through iterator concept");
		//Iterator iterator = arrayList.iterator(); iterator.hasNext();
		
		for( Iterator<StudentBeanList> studentItr=students.iterator();studentItr.hasNext();){
			
			StudentBeanList student = studentItr.next();
			//studentItr.remove();
			System.out.println(student);
		}
		
		System.out.println("Seeing student size():: "+students.size());
		

	}

}
