package mycollection;

import java.util.Comparator;

public class EmployeeBaseBranch  implements Comparator<EmployeeBaseList> {
	public int compare(EmployeeBaseList emp1,EmployeeBaseList emp2)
	{
		return emp1.getBranch().compareTo(emp2.getBranch());
	}

}
