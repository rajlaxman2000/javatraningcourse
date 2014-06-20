package databaseConnect;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class UpdateQry {

	public static void main(String[] args) throws SQLException {

		int id = 0;
		String name = null;
		String loc = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost", "dale", "dale420");
			Statement st = con.createStatement();
			PreparedStatement ps = con
					.prepareStatement("UPDATE dale_tables.details  set name=sas, location=lol WHERE id=1");
			//ps.setString(2, "scrap");
			//ps.setString(3, "POL");
			ps.close();
			st.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Updated Successfuly");
	}

}
