package javaioconcept;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Writer2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char[] in = new char[50]; // to store input
		int size = 0;
		printWriteMethod();
		/*
		try {
			File file = new File("fileWrite2.txt"); // just an object

			FileWriter fw = new FileWriter(file); // create an actual file & a FileWriter obj
			fw.write("howdy\nfolks\n"); // write characters to the file
			fw.flush(); // flush before closing
			fw.close(); // close file when done
			FileReader fr = new FileReader(file); // create a FileReader object
			size = fr.read(in); // read the whole file!
			System.out.print(size + " "); // how many bytes read
			for (char c : in)// print the array
				System.out.print(c);
			fr.close(); // again, always close
		} catch (IOException e) {
			System.err.println("Opps there seems to be an exception");
		}*/
	}
	
	/**
	 * 
	 */
	public static void printWriteMethod(){
		File file = new File("fileWrite2.txt"); // create a File object
		
		try {
			/*
			System.out.println(file.exists());
			PrintWriter pw = new PrintWriter(file);
			System.out.println(file.exists());
			*/			
			//PrintStream
			FileWriter fw = new FileWriter(file); // create a FileWriter
			PrintWriter pw = new PrintWriter(fw); // create a PrintWriter that will send its output to a Writer
			pw.println("howdy"); // write the data
			pw.println("folks");
			fw.flush(); 
			fw.close();
			
			
			FileReader fr = new FileReader(file); // create a FileReader to get data from 'file'
			BufferedReader br = new BufferedReader(fr); // create a BufferReader to
				// get its data from a Reader
			String data=null;
			 while((data = br.readLine())!= null)
			  {
			   System.out.println(data);
			  }
			
			//System.out.println(data);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}//// pass file to the PrintWriter constructor
	}
}