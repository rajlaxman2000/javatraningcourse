package javaioconcept.javatpoint;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

import javax.imageio.stream.FileCacheImageInputStream;

public class SequenceInputStreamExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			//SequenceInputStreamExample.readFrom2Files();
			SequenceInputStreamExample.readFrom2FilesWriteInto3();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @throws Exception
	 * In this example, we are printing the data of two files f1.txt and f2.txt. 
	 */
	public static void readFrom2Files() throws Exception {
		FileInputStream fin1 = new FileInputStream("f1.txt");
		FileInputStream fin2 = new FileInputStream("f2.txt");

		SequenceInputStream sis = new SequenceInputStream(fin1, fin2);
		int i;
		while ((i = sis.read()) != -1) {
			System.out.print((char) i);
		}
	}

	/**
	 * @throws Exception
	 * 
	 * In this example, we are writing the data of two files f1.txt and f2.txt 
	 * 	into another file named target.txt. 
	 */
	public static void readFrom2FilesWriteInto3() throws Exception {
		FileInputStream fin1 = new FileInputStream("f1.txt");
		FileInputStream fin2 = new FileInputStream("f2.txt");

		FileOutputStream fout = new FileOutputStream("target.txt");

		SequenceInputStream sis = new SequenceInputStream(fin1, fin2);
		int i;
		while ((i = sis.read()) != -1) {
			fout.write(i);
		}

		sis.close();
		fout.close();
		fin1.close();
		fin2.close();
	}
	
	public static void readFrom2FilesUsingEnumeration() throws Exception {
		
	}

}
