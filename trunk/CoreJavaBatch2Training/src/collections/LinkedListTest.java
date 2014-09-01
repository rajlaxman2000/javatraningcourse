package collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Employee> employees = new LinkedList<Employee>();
		
		Employee employee1 = new Employee(10, "Harish", 20);
		Employee employee2 = new Employee(8, "Srujana", 10);
		Employee employee3 = new Employee(20, "Rajesh", 50);
		Employee employee4 = new Employee(55, "Adithya", 12);
		Employee employee5 = new Employee(3, "Bhuvan", 80);
		
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		
		
		
		System.out.println(employees);

	}

}
