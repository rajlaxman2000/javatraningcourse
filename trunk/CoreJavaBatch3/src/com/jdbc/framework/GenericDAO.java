package com.jdbc.framework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class GenericDAO {
	
	public static Connection connection	= null;
	
	//private final static String DB_URL =  "jdbc:mysql://localhost/test_batch3";
	private final static String DB_URL =  "jdbc:mysql://localhost/test_batch3";
	
	private final static String USER = "root";
	
	private final static String PASS= "";
	
	private final static String driverName = "com.mysql.jdbc.Driver";
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		
		Class.forName(driverName);
		connection = DriverManager.getConnection(DB_URL, USER, PASS);
		
		return  connection;
	}
	
	public void closeThings(Statement statement, ResultSet resultSet){
		try{
			statement.close();
			resultSet.close();
			connection.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void closeThings(Statement statement){
		try{
			statement.close();
			
			connection.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	/*
	public void closeThings(PreparedStatement preparedStatement, ResultSet resultSet){
		try{
			preparedStatement.close();
			resultSet.close();
			connection.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	*/

	/*
	public void closeThings(CallableStatement callableStatement, ResultSet resultSet){
		try{
			callableStatement.close();
			resultSet.close();
			connection.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	*/
	
	
	

}
