package compositeinterfaceimplementation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLDataException;
import java.util.NoSuchElementException;

public class SoftwareEngineer extends Employee{
	
	public void getEmployeeDetails(Number y) throws RuntimeException,SQLDataException{
		System.out.println("This is method from Software Engineer class");
	}
	
	public void getEmployeeDetails(Integer y) throws NoSuchElementException{
		System.out.println("This is overrided method from Software Engineer class");
	}
	

}
