package com.jdbc.transactions;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.farmework.GenericDAO;

public class EmployeeStatmentTransactionsTest extends GenericDAO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EmployeeStatmentTransactionsTest employeeStatmentTransactionsTest = new EmployeeStatmentTransactionsTest();
		
		employeeStatmentTransactionsTest.startExecuting();
	}// end main

	
	public void startExecuting(){
		Statement stmt = null;
		Connection connection = null;
		try {
			
			connection = getConnection();
			
			// STEP 4: Set auto commit as false.			
			connection.setAutoCommit(false);

			// STEP 5: Execute a query to delete statement with
			// required arguments for RS example.
			System.out.println("Creating statement...");
			stmt = connection.createStatement();
			
			// STEP 6: Now list all the available records.
			String sql = "SELECT empID, empName, position, salary FROM Employee";
			
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("List result set for reference....");
			printRs(rs);
			
			String SQL = new String("DELETE FROM Employee " + "WHERE empID =");
			
			for(int i=0;i<2;i++){
				
				int id = i+3; 
				if(id==4){
					throw new SQLException();
				}else{
					stmt.executeUpdate(SQL+id);
				}
				System.out.println("Executed qry ::"+SQL+id);
				
			}
					
		
			
					
		//	SQL = "DELETE FROM Employee " + "WHERE ID = 5";
			//stmt.executeUpdate(SQL);

			// STEP 10: Now list all the available records.
			sql = "SELECT * FROM Employee";
			rs = stmt.executeQuery(sql);
			System.out.println("List result set for reference....");
			printRs(rs);
			
			//Please do commit the transaction
			connection.commit();
			
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
			// If there is an error then roll back the changes.
			System.out.println("Rolling back data here....");
			try {
				if (connection != null){
					System.out.println("Roll back happening");
					connection.rollback();
					
					
				}	
			} catch (SQLException se2) {
				se2.printStackTrace();
			}// end try

		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {

			closeThings(stmt);
		}// end try
		

		System.out.println("Goodbye!");
	}
	public static void printRs(ResultSet rs) throws SQLException {
		// Ensure we start with first row
		rs.beforeFirst();
		while (rs.next()) {
			// Retrieve by column name
			int id = rs.getInt("empID");
			double salary = rs.getDouble("salary");
			String name = rs.getString("empName");
			String position = rs.getString("position");

			// Display values
			System.out.print("ID: " + id);
			System.out.print(", Salary: " + salary);
			System.out.print(", EMP Name: " + name);
			System.out.println(", EMP Position: " + position);
		}
		System.out.println();
	}// end printRs()

}
