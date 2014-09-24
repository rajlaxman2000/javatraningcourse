package com.student.framework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class Dbconnection {
	
	public static Connection connection	= null;
	
	private final static String DB_URL =  "jdbc:mysql://localhost/test";
	
	private final static String USER = "root";
	
	private final static String PASS= "";
	
	private final static String driverName = "com.mysql.jdbc.Driver";
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		
		Class.forName(driverName);
		connection = DriverManager.getConnection(DB_URL, USER, PASS);
		
		return  connection;
	}
	
	
	public void closeConn(Connection conn){
		try{
			conn.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void closeThings(Statement statement,ResultSet rs){
		try{
			statement.close();
			rs.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void closeThings(PreparedStatement ps,ResultSet rs){
		try{
			ps.close();
			rs.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void closePrepared(PreparedStatement ps){
		try{
			ps.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
