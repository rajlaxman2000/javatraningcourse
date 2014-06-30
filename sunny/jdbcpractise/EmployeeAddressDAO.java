package jdbcpractise;

import java.util.List;

public interface EmployeeAddressDAO {
public int insertEmployeeAddress(Employee employee);
	
	public List<EmpAddress> getEmployees();
	
	public Employee updateEmployee(Employee employee);

}
