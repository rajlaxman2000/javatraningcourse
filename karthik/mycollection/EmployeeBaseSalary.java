package mycollection;

import java.util.Comparator;

public class EmployeeBaseSalary implements Comparator<EmployeeBaseList> {
	
	public int compare(EmployeeBaseList emp1, EmployeeBaseList emp2){
		return emp1.getEmpSalary()-emp2.getEmpSalary();
		
	}

}
