package collections;

import java.util.Comparator;

public class EmpNameComparator implements Comparator<Employee> {

	
	public int compare(Employee emp1, Employee emp2) {
		
		String name1 = emp1.getName();
		String name2= emp2.getName();
		
		return name1.compareTo(name2);
		
		//return emp1.getName().compareTo(emp2.getName());
	}

	

}
