package mycollection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortEmployee {
	public static void main(String[] args) {

		ArrayList<EmployeeBaseList> employeeBaseLists = new ArrayList<EmployeeBaseList>();

		EmployeeBaseList emp1 = new EmployeeBaseList(32, 40000, "Alex", "USA");
		EmployeeBaseList emp2 = new EmployeeBaseList(8734, 80000, "Ram",
				"India");
		EmployeeBaseList emp3 = new EmployeeBaseList(7474, 35000, "Nancy", "UK");
		EmployeeBaseList emp4 = new EmployeeBaseList(757, 67000, "Catrey",
				"USA");
		EmployeeBaseList emp5 = new EmployeeBaseList(302, 400000, "Dheerj",
				"India");

		employeeBaseLists.add(emp4);
		employeeBaseLists.add(emp5);
		employeeBaseLists.add(emp2);
		employeeBaseLists.add(emp3);
		employeeBaseLists.add(emp1);
		System.out.println("before sorting");
		  for(EmployeeBaseList employeeBaseList:employeeBaseLists){
		  System.out.println("Emp id ::"+employeeBaseList.getEmpId());
		  System.out.println("Emp salary ::"+employeeBaseList.getEmpSalary());
		  System.out.println("Emp name ::"+employeeBaseList.getEmpName());
		  System.out.println("Emp branch ::"+employeeBaseList.getBranch());
		  
		  }
		
		System.out.println("list after sorting");
		Collections.sort(employeeBaseLists);
		System.out.println(employeeBaseLists);
		
		/*Collections.sort(employeeBaseLists);
		for (EmployeeBaseList employeeBaseList : employeeBaseLists) {
			System.out.println("Emp id ::" + employeeBaseList.getEmpId());
			System.out.println("Emp salary ::"
					+ employeeBaseList.getEmpSalary());
			System.out.println("Emp name ::" + employeeBaseList.getEmpName());
			System.out.println("Emp branch ::" + employeeBaseList.getBranch());

		}*/
		
		System.out.println("list after sorting based on salary");
		Collections.sort(employeeBaseLists, new EmployeeBaseSalary());
		 for(EmployeeBaseList employeeBaseList:employeeBaseLists){
			  System.out.println("Emp id ::"+employeeBaseList.getEmpId());
			  System.out.println("Emp salary ::"+employeeBaseList.getEmpSalary());
			  System.out.println("Emp name ::"+employeeBaseList.getEmpName());
			  System.out.println("Emp branch ::"+employeeBaseList.getBranch());
			  
			  }
		 System.out.println("list after sorting based on name");
			Collections.sort(employeeBaseLists, new EmployeeBasedName());
			 for(EmployeeBaseList employeeBaseList:employeeBaseLists){
				  System.out.println("Emp id ::"+employeeBaseList.getEmpId());
				  System.out.println("Emp salary ::"+employeeBaseList.getEmpSalary());
				  System.out.println("Emp name ::"+employeeBaseList.getEmpName());
				  System.out.println("Emp branch ::"+employeeBaseList.getBranch());
				  
				  }//System.out.println(employeeBaseLists);
				
			 System.out.println("list after sorting based on branch");
				Collections.sort(employeeBaseLists, new EmployeeBaseBranch());
				 for(EmployeeBaseList employeeBaseList:employeeBaseLists){
					  System.out.println("Emp id ::"+employeeBaseList.getEmpId());
					  System.out.println("Emp salary ::"+employeeBaseList.getEmpSalary());
					  System.out.println("Emp name ::"+employeeBaseList.getEmpName());
					  System.out.println("Emp branch ::"+employeeBaseList.getBranch());
					  
					  }
	}
}
