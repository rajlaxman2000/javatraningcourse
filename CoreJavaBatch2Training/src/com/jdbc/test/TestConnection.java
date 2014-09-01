package com.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) {
		/// user name = root, psd = ""
		
		try {
		
		//Step1 :  register the driver class	
		Class.forName("com.mysql.jdbc.Driver");
		
		// Step2 : declare the connection url and username and pass word
		String DB_URL =  "jdbc:mysql://localhost/test";
		
		String USER = "root";
		
		String PASS= "";
		
		//Step3 :  Create connection from DriverManegr with connnection url and username and pass word
		Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
		
		//Step4: Create statement from connection object to play with quaries
		Statement statement = connection.createStatement();
		
		// Data base query
		String sql = "SELECT id, name, age FROM employee";
		
		ResultSet rs = statement.executeQuery(sql);
		
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
		// STEP 6: Clean-up environment
		rs.close();
		statement.close();
		connection.close();
		
		}catch(ClassNotFoundException notFoundException){
			
			notFoundException.printStackTrace();
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
