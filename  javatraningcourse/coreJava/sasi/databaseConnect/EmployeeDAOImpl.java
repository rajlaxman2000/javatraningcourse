package jdbcexamples;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDAOImpl extends GenericMySQLDAO implements EmployeeDAO {

	ResultSet rs = null;

	@Override
	public int insertEmployee(Employee employee) {
		Statement statement=null;
		ResultSet rs=null;
		Scanner sc= new Scanner(System.in);
		int id=sc.nextInt();
		int salary=sc.nextInt();
		String fname=sc.next();
		String lname=sc.next();
		String sql = "insert into test.employee (id, first_name, last_name, salary FROM employee) values (id,fname,lname)";
		rs = statement.executeUpdate(sql);
		return 0;
	}

	public List<Employee> getEmployees() {

		List<Employee> employees = new ArrayList<Employee>();
		Employee employee;
		Statement statement = null;
		ResultSet rs = null;

		try {
			Connection connection = getConnection();

			statement = connection.createStatement();

			String sql = "SELECT id, first_name, last_name, salary FROM employee";
			rs = statement.executeQuery(sql);

			// STEP 5: Extract data from result set
			while (rs.next()) {

				employee = new Employee(rs.getInt("id"),
						rs.getString("first_name"), rs.getString("first_name"),
						rs.getInt("salary"));
				employees.add(employee);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				super.closeMethod(rs, statement);
			} catch (SQLException e) {
				System.out
						.println("There seems to be a probblem in closing the things in super class");
				e.printStackTrace();
			}
		}
		return employees;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
