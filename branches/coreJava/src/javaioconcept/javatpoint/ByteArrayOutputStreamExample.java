package javaioconcept.javatpoint;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

/**
 * @author Rajesh_Duvvi Simple program of writing data by ByteArrayOutputStream
 *         class
 */
public class ByteArrayOutputStreamExample {

	public static void main(String[] args) {
		try {
			ByteArrayOutputStreamExample.outmethod();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void outmethod() throws Exception {
		
		FileOutputStream fout1 = new FileOutputStream("f1.txt");
		FileOutputStream fout2 = new FileOutputStream("f2.txt");

		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		bout.write(67);

		bout.writeTo(fout1);
		bout.writeTo(fout2);

		bout.flush();

		bout.close();// has no effect
		System.out.println("success...");
	}
}
