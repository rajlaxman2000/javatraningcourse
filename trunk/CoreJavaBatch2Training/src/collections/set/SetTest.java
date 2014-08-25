package collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import collections.list.ArrrayListSorting;
import collections.list.Employee;

public class SetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Set<Student> studentSet = new HashSet<Student>();
		
		Student std1 = new Student(10, "Harish", 20);
		Student std2 = new Student(8, "Srujana", 10);
		Student std3 = new Student(20, "Rajesh", 50);
		Student std4 = new Student(55, "Adithya", 12);
		Student std5 = new Student(3, "Bhuvan", 80);
		
		
			//System.out.println(std5.hashCode());
		Student std6 = new Student(3, "Bhuvan", 80);
		
			//System.out.println(std6.hashCode());
			
		
		studentSet.add(std1);
		studentSet.add(std2);
		studentSet.add(std3);
		studentSet.add(std4);
		studentSet.add(std5);
		studentSet.add(std6);
		
		System.out.println(studentSet);
		
		/*
		List<Student> stdList = new ArrayList<Student>();
		
		
		Student[] objArray = (Student[]) studentSet.toArray();
		
		System.out.println(objArray[0].toString());
*/		
		
		/*
		Set<String> nameSet  = new HashSet<String>();
		
		nameSet.add("Rajesh");
		nameSet.add("Ramesh");
		nameSet.add("Rajesh");
		nameSet.add("Ramesh");
		
		System.out.println(nameSet);
		*/
		

	}

}
