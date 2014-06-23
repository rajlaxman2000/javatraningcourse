package databaseConnect;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.PreparedStatement;

public class SampleTest {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost/", "dale", "dale420");
			Statement st = con.createStatement();
			//PreparedStatement ps=con.prepareStatement(null);
			//ps.execute("SELECT * FROM dale_tables.details");
		
			ResultSet rs = st.executeQuery("SELECT * FROM dale_tables.details");
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getNString(2);
				String location = rs.getNString(3);
				System.out.println("Name: " + name + " ID: " + id
						+ " Loaction: " + location);
			}
			rs.close();
			st.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Successfully Retrived....!!");
	}
}
