package interfaceinheritence;

public class EmployeeTest {

	public static void main(String[] args){
	
			HrEmployees hrEmployee = new HrEmployees();
			
			Employee employee = hrEmployee.getEmpDetails(10);
			
			System.out.println(employee);			
			
			System.out.println(hrEmployee.getEmployeePrevilage(10));
			System.out.println(hrEmployee.getSalary(10));
	}
	
}
