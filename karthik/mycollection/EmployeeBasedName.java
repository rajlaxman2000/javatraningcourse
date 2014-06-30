package mycollection;

import java.util.Comparator;

public class EmployeeBasedName implements Comparator<EmployeeBaseList>{
	public int compare(EmployeeBaseList emp1,EmployeeBaseList emp2){
		return emp1.getEmpName().compareTo(emp2.getEmpName());
		
	}

}
