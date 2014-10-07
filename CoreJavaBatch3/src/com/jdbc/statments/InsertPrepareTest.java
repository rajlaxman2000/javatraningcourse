package com.jdbc.statments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class InsertPrepareTest {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) {
		/// user name = root, psd = ""
		
		
		Connection connection					= null;
		PreparedStatement preparedStatement 	= null;		
		ResultSet rs							= null;
		
		try {
		
		//Step1 :  register the driver class	
		Class.forName("com.mysql.jdbc.Driver");
		
		// Step2 : declare the connection url and username and pass word
		String DB_URL =  "jdbc:mysql://localhost/test";
		
		String USER = "root";
		
		String PASS= "";
		
		
		
		//Step3 :  Create connection from DriverManegr with connection url and username and pass word
		
		/*
		 * This is to pass the url and user name and pass word individually
		 */
		connection = DriverManager.getConnection(DB_URL, USER, PASS);
		
		// Data base query		
		String sql = "insert into employee (name,age) values (?,?)";
		
		//Step4: Create statement from connection object to play with quaries
		preparedStatement =connection.prepareStatement(sql);	
	
			preparedStatement.setString(1, "Phani");
			preparedStatement.setInt(2, 33);			
		
				
		//Step5: Execution the query
		int noOfRows = preparedStatement.executeUpdate();
		System.out.println("REsult ::"+noOfRows);
		// Execute, executeQuery, executeUpdate
		/*
		
		while (rs.next()) {
			// Retrieve by column name
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int  age = rs.getInt("age");
			
			
			
			// Display values
			System.out.print("ID: " + id);
			System.out.print(", Name: " + name);
			System.out.print(", Age: " + age);
			
			System.out.println("\n");
					
		}
		*/
		
		}catch(ClassNotFoundException notFoundException){
			
			notFoundException.printStackTrace();
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{			
			try {
				// STEP 6: Clean-up environment
				//rs.close();
				preparedStatement.close();
				connection.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
