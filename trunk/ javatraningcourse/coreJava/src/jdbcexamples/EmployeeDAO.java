package jdbcexamples;

import java.util.List;

public interface EmployeeDAO {
	
	public int insertEmployee(Employee employee);
	
	public List<Employee> getEmployees();
	
	public Employee updateEmployee(Employee employee);
	
	

}
