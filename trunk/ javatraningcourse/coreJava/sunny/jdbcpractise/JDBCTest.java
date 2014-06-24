package jdbcpractise;

import java.sql.SQLException;
import java.util.Scanner;

public class JDBCTest {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		System.out.println("   MENU\n1. Display\n2.insert\n3.update\n4.exit");
		Scanner sc= new Scanner(System.in);
		int key=sc.nextInt();
		switch (key) {
		case 1:
			System.out.println(employeeDAO.getEmployees());	
			break;
		case 2:
			employeeDAO.insertEmployee(null);
			break;
		case 3:
			employeeDAO.updateEmployee(null);
			break;
		case 4:
		System.exit(0);
		default:
			break;
		}
		//Employee employee = new Employee(empId, firstName, lastName, salary); 
		
		
		
		//EMPlo
		

	}

}
