package com.jdbc.statments;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.framework.GenericDAO;

public class BatchProcessingTest extends GenericDAO {

	PreparedStatement preparedStatement=null;	
	Statement statement = null;	
	ResultSet rs		= null;
	Connection connection = null;
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BatchProcessingTest test = new BatchProcessingTest();
		test.startBatchProcessing();
	}
	
	public void startBatchProcessing(){
		
		String sql = "Insert into employee (name, age, doj) values (?,?,?)";
		
		try{
		
			connection = getConnection();
			
			connection.setAutoCommit(false);
			
			@SuppressWarnings("deprecation")
			Date doj1 = new Date(2014,10,16);
			
			
			preparedStatement =  connection.prepareStatement(sql);
			
				preparedStatement.setString(1, "Raghu");
				preparedStatement.setString(2, "20");
				preparedStatement.setDate(3,doj1);
				
			preparedStatement.addBatch();
			
				preparedStatement.setString(1, "Ramesh");
				preparedStatement.setString(2, "25");
				preparedStatement.setDate(3,doj1);
				
			preparedStatement.addBatch();
		
			int[] count = preparedStatement.executeBatch();
			
			System.out.println("I am after executing the batch");
				System.out.println(count);
			connection.commit();	
				
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException se) {
			se.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e) {
				try {
					connection.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				e.printStackTrace();
			}
		}finally{
			closeThings(preparedStatement);
		}
	}
	
	

}
