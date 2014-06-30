package jdbcwork;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;

public class InsertTest {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter first name");
		String first_name=sc.next();
		System.out.println("enter last name");
		String last_name=sc.next();
		System.out.println("enter salary");
		int salary=sc.nextInt();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost/", "root", "Karthik3132");
			
		Statement statement=connection.createStatement();
		PreparedStatement preparedStatement= connection.prepareStatement("insert into database.employee values(?,?,?,?)");
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2,first_name );
		preparedStatement.setString(3,last_name );
		preparedStatement.setInt(4,salary);
		preparedStatement.executeUpdate();
		statement.close();
		preparedStatement.close();
		
				
		}
		catch(Exception sq){
			sq.printStackTrace();
		}
		
	}

}
