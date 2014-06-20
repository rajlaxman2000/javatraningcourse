package databaseConnect;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataRead {

	public static void main(String[] args) throws SQLException {

		int id = 0;
		String name = null;
		String loc = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost","dale", "dale420");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM dale_tables.details");
			while (rs.next()) {
				id = rs.getInt(1);
				name = rs.getString(2);
				loc = rs.getString(3);
				System.out.println("ID: " + id + " Name: " + name + " Location: " + loc);
			}
			rs.close();
			st.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
