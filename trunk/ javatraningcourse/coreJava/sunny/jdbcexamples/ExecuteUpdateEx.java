package jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ExecuteUpdateEx {

	public static void main(String[] args) throws SQLException {

		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID:");
		int id = sc.nextInt();
		System.out.println("Enter Name:");
		String name = sc.next();
		System.out.println("Enter Location:");
		String loc = sc.next();*/
		try {
			//int keys=0;
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost/", "root", "sunny16");
			Statement st = con.createStatement();
	 //st.executeUpdate("update sunny.employee set first_name='Sunny', last_name='Karra', salary=1000 where id=2" );


System.out.println(st.executeUpdate("update sunny.employee set first_name='Sunny', last_name='Karra', salary=1000 where id=3"));

//st.RETURN_GENERATED_KEYS;


			/*PreparedStatement ps = con
					.prepareStatement("insert into dale_tables.details values(?,?,?)");
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, loc);
			ps.executeUpdate();
			ps.close();*/
			st.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" Details Inserted Successfully....!!!");
	}
}
