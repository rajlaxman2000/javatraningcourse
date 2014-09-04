package com.jdbc.statments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;



public class PreparedStatmentAutoGenerated {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	/// user name = root, psd = ""
		
		
		Connection connection	= null;
	
		PreparedStatement preparedStatement = null;
		ResultSet rs			= null;;
		
		try {
		
		//Step1 :  register the driver class	
		Class.forName("com.mysql.jdbc.Driver");
		
		// Step2 : declare the connection url and username and pass word
		String DB_URL =  "jdbc:mysql://localhost/test";
		
		String USER = "root";
		
		String PASS= "";
				
		connection = DriverManager.getConnection(DB_URL, USER, PASS);
				
		String insertSql = "insert into employee (name, age) values (?,?)";
		
		preparedStatement =  connection.prepareStatement(insertSql, PreparedStatement.RETURN_GENERATED_KEYS);
		
		
		//preparedStatement =  connection.prepareStatement(insertSql, 1);
		
			preparedStatement.setString(1, "Adithya");
			preparedStatement.setInt(2, 23);	
		
		int noOfEffectedRows = preparedStatement.executeUpdate();
		
		System.out.println("No of effected rows from the given insert query:: "+noOfEffectedRows);

		rs = preparedStatement.getGeneratedKeys();
		
		while(rs.next()){
			// Column name for the auto generated key in result set is : "GENERATED_KEY"
			// But better we prefer with column index
			//System.out.println("Key value ::"+rs.getInt("GENERATED_KEY"));
			System.out.println("Key value ::"+rs.getInt(1));
		}
		
		
		}catch(ClassNotFoundException notFoundException){
			
			notFoundException.printStackTrace();
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
				try {
					// STEP 6: Clean-up environment
					rs.close();
					preparedStatement.close();
					connection.close();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
			
		}
		
		
		

	}

}
