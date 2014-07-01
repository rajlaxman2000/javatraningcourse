package jdbcexamples.files;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FileAsciiStream extends GenericMySQLDAO {

	public static void main(String[] args) {
		Connection connection = null;

		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			connection = getConnection();

			System.out.println("Creating statement...");
			stmt = connection.createStatement();

			// Open a FileInputStream
			File f = new File("XML_Data.xml");
			long fileLength = f.length();
			FileInputStream fis = new FileInputStream(f);

			// Create PreparedStatement and stream data
			String SQL = "INSERT INTO employee (xml_file) VALUES (?)";
			pstmt = connection.prepareStatement(SQL);			
			pstmt.setAsciiStream(1, fis, (int) fileLength);
			
			pstmt.execute();

			// Close input stream
			fis.close();

			// Do a query to get the row
			SQL = "SELECT xml_file FROM employee WHERE id=55";
			rs = stmt.executeQuery(SQL);
			// Get the first row
			if (rs.next()) {
				// Retrieve data from input stream
				InputStream xmlInputStream = rs.getAsciiStream(1);
				int c;
				ByteArrayOutputStream bos = new ByteArrayOutputStream();
				while ((c = xmlInputStream.read()) != -1)
					bos.write(c);
				// Print results
				System.out.println(bos.toString());
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// closeMethod(stmt);
				closeMethod(rs, stmt);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
