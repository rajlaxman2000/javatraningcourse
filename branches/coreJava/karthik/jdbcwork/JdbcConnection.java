package jdbcwork;

import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class JdbcConnection {
	public static void main(String[] args) {
		java.sql.Connection connection = null;
		Statement statement = null;

		try {
			// Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("connecting to database");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost/", "root", "Karthik3132");
			System.out.println("statement creation");
			statement = connection.createStatement();

			DatabaseMetaData metaData = connection.getMetaData();

			String query = "SELECT * FROM database.employee ";

			ResultSet resultSet = statement.executeQuery(query);

			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				int salary = resultSet.getInt(4);
				String first = resultSet.getString(2);
				String last = resultSet.getString(3);

				System.out.print("ID: " + id + ", Salary: " + salary
						+ ", First: " + first + ", Last: " + last + "\n");
			}
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null)
					statement.close();
			} catch (SQLException se2) {
				try {
					if (connection != null)
						connection.close();
				} catch (SQLException se) {
					se.printStackTrace();
				}
			}
		}
	}
}
