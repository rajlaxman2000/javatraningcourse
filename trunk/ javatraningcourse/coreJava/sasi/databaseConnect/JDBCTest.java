package jdbcexamples;

import jdbcexamples.EmployeeDAOImpl;

public class JDBCTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();
		
		
		//Employee employee = new Employee(empId, firstName, lastName, salary); 
		System.out.println(employeeDAO.getEmployees());
		employeeDAO.insertEmployee(employee);
		
		//EMPlo
		

	}

}
