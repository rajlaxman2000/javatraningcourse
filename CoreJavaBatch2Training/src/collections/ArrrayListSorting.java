package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.exceptions.AgeNotPermittedException;

public class ArrrayListSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<Employee>();		
		
		Employee employee1 = new Employee(10, "Harish", 20);
		Employee employee2 = new Employee(8, "Srujana", 10);
		Employee employee3 = new Employee(20, "Rajesh", 50);
		Employee employee4 = new Employee(55, "Adithya", 12);
		Employee employee5 = new Employee(3, "Bhuvan", 80);
		
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		employeeList.add(employee5);
		
		
		System.out.println(employeeList);
		
		/*
		
		Collections.sort(employeeList);
		
		System.out.println("Printng the collection after sorting");
		
		System.out.println(employeeList);
		*/
		
		// Sorting by using age comparator
		EmpAgeComparator ageComparator = new EmpAgeComparator();
		Collections.sort(employeeList, ageComparator);
		
		System.out.println("Printng the collection after sorting by age");
		
		System.out.println(employeeList);
		
	
		
		/*
		Employee emp1 = new Employee(1, "Rajesh", 30);
		Employee emp2 = new Employee(2, "Raghu", 29);
		
		int res = emp1.compareTo(emp2);
		
		System.out.println("Emp comparing :: "+res);
		 */

	}

}
