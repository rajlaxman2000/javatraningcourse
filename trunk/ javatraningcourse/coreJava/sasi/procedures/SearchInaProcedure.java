package procedures;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SearchInaProcedure {
	public static void main(String[] args) throws SQLException,
			ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost/dale_tables", "dale", "dale420");// com.mysql.jdbc.Driver
		CallableStatement cal = con.prepareCall("{call data()}");
		ResultSet rs = cal.executeQuery();
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter Id to Retrive:");
		int id = sc.nextInt();
		while (rs.next()) {
			if (rs.getInt(1) == id) {
				System.out.print("Name:" + rs.getString(2));
				System.out.print(" Location:" + rs.getString(3));
			}
		}
	}
}
