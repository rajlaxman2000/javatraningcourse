package compositeinterfaceimplementation;

import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

//import java.io.FileNotFoundException;

public class TestEmployeeEx {
	
	public static void main(String[] args){
		
		Employee obj = new SoftwareEngineer();
		
		try {
			obj.getEmployeeDetails(2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
