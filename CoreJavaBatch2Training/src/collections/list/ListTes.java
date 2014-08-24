package collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		
		List<Employee> employeeList = new ArrayList<Employee>();		
		
		Employee employee1 = new Employee(1, "Name1", 10);		
		Employee employee2 = new Employee(2, "Name2", 11);
		
		employeeList.add(employee1);	
		
		employeeList.add(employee2);		
		
		/*
		for(int i=0;i<employeeList.size();i++){
			System.out.println(employeeList.get(i));
		}
		*/
		
		for (Employee emp : employeeList) {
			System.out.println(emp);
			
		}
		
		/*
		System.out.println("****************************");
		
		System.out.println(employeeList.toString());
		*/
	}
}
