package javaioconcept.javatpoint;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author Rajesh_Duvvi
 *	Example of Reading the data of current java file and writing it into another file
 */
public class SourceJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  
		try {
			SourceJava.copyFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void copyFile() throws Exception{
		
		FileInputStream fin=new FileInputStream("fileWrite2.txt");  
		
		FileOutputStream fout=new FileOutputStream("TargetJava.java");
		
		int i=0;
		
		while((i=fin.read())!=-1){  
			fout.write((byte)i);  
		}  		  
		fin.close();  
	}  
	

}
