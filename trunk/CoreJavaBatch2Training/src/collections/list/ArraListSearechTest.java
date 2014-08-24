package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArraListSearechTest {

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
		
	//	System.out.println("Employees List :: \n"+employeeList);
		
		Employee tmpEmp = new Employee(10,"Harish",20); 
		
		List<Employee> anotherEmpList = new ArrayList<Employee>();
		anotherEmpList.add(employee1);
		anotherEmpList.add(employee2);
			Employee tempEmp1 = new Employee(15,"Raghu", 50); 
		anotherEmpList.add(tempEmp1);
		
		
		boolean result =  employeeList.contains(employee1);
		//System.out.println("Search Result ::"+result);
		
		boolean result1 =  employeeList.containsAll(anotherEmpList);
		//System.out.println("Search Result ::"+result1);
		
		//anotherEmpList.remove(2);
		//anotherEmpList.remove(tempEmp1);
		//System.out.println(anotherEmpList);
		
		List<Employee> anotherEmpListForRemove  = new ArrayList<Employee>();
		
			anotherEmpListForRemove.add(employee1);
			anotherEmpListForRemove.add(employee4);
		
			System.out.println("employee list before removing the values :: \n"+employeeList);
			employeeList.removeAll(anotherEmpListForRemove);
			
			System.out.println("employee list after removing the values :: \n"+employeeList);
		
		

	}

}
