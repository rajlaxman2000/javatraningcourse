package jdbcwork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteClass {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter row to delete");
		int row=sc.nextInt();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost/", "root", "Karthik3132");
			Statement statement=connection.createStatement();
			statement.execute("DELETE FROM database.employee WHERE id="+row+"");
			statement.close();
			connection.close();
		}
			catch(Exception e){
				e.printStackTrace();
			}
		
	}

}
