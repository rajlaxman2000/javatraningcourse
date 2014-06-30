package interfaceinheritence;

public abstract class GenericEmployee{
	
	public Employee getEmpDetails(int empId){
		
		Employee employee = new Employee(1,30,"Rajesh",80000);
		
		return employee;		
	}
	
	public int getSalary(int empId){
		
		return 80000;
	}
	
	public abstract String getEmployeePrevilage(int empId);

}
