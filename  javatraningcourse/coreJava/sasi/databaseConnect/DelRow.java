package databaseConnect;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DelRow {

	public static void main(String[] args) throws SQLException {

		int id = 0;
		String name = null;
		String loc = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost","dale", "dale420");
			Statement st = con.createStatement();
st.executeUpdate("DELETE FROM dale_tables.details WHERE id = 5");			
			st.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println("Removed Successfuly");
	}

}
