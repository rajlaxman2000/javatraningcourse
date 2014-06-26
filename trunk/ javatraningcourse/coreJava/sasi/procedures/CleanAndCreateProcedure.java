package procedures;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CleanAndCreateProcedure {
	public static void main(String[] args) throws SQLException,
			ClassNotFoundException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost/dale_tables", "dale", "dale420");
		Statement st = con.createStatement();
		String cdproc = "drop procedure if exists data";
		st.execute(cdproc);
		String crtpr = "create procedure data() begin select * from details; end";
		Statement st2 = con.createStatement();
		st2.executeUpdate(crtpr);
		CallableStatement cal = con.prepareCall("{call data()}");
		ResultSet rs = cal.executeQuery();
		while (rs.next()) {
			System.out.print(rs.getInt("id"));
			System.out.print(" " + rs.getString("name"));
			System.out.print(" " + rs.getString("location") + "\n");

		}

	}
}
