package jdbcpractise;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {
	
	public int insertEmployee(Employee employee) throws SQLException;
	
	public List<Employee> getEmployees();
	
	public Employee updateEmployee(Employee employee) throws SQLException;
	
	

}
