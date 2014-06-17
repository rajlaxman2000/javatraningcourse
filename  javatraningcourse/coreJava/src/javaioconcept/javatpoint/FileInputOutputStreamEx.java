package javaioconcept.javatpoint;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author Rajesh_Duvvi Simple program of writing data into the file
 */
public class FileInputOutputStreamEx {

	public static void main(String args[]) {
		
		FileInputOutputStreamEx outputInputStreamEx = new FileInputOutputStreamEx();

		//outputInputStreamEx.fileWriteOutPutMethod();
		
		outputInputStreamEx.fileReadInputMethod();

	}

	public void fileWriteOutPutMethod() {
		try {
			
			FileOutputStream fout = new FileOutputStream("abc.txt");
			
			String s = "Sachin Tendulkar is my favourite player";

			byte b[] = s.getBytes();
			
			fout.write(b);

			fout.close();
			
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void fileReadInputMethod() {
		try {
			FileInputStream fin = new FileInputStream("abc.txt");
			int i;
			while ((i = fin.read()) != -1)
				System.out.print((char)i);
				//System.out.print((char) i); try this will realize the difference  between print and println 
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}