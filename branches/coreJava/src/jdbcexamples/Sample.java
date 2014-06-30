package jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample {
	
	static final String url = "jdbc:mysql://localhost/test"; 
	
	static final String user = "root";
	static final String password = "";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Connection connection=null;
		Statement statement=null;
		ResultSet res=null;
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			
			connection = DriverManager.getConnection(url, user, password);
			
			statement = connection.createStatement();
			
			String sqlQuery = "SELECT id, first_name, last_name, salary FROM employee";
			
			res =   statement.executeQuery(sqlQuery);
			
			while(res.next()){
				
				// Retrieve by column name
				int id = res.getInt("id");
				int salary = res.getInt("salary");
				String first = res.getString("first_name");
				String last = res.getString("first_name");

				// Display values
				System.out.print("ID: " + id);
				System.out.print(", Salary: " + salary);
				System.out.print(", First: " + first);
				System.out.println(", Last: " + last);
			}
			
			res.close();
			statement.close();
			connection.close();		
			

		}catch (Exception e) {
			// TODO: handle exception
		}finally{
			try {
				res.close();
				statement.close();
				connection.close();	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
				
		

	}

}
