package jdbcexamples;

public class JDBCTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		
		
		//Employee employee = new Employee(empId, firstName, lastName, salary); 
		System.out.println(employeeDAO.getEmployees());
		
		//EMPlo
		

	}

}
