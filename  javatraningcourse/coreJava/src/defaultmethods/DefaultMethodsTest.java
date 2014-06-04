package defaultmethods;

import java.io.ObjectInputStream.GetField;

public class DefaultMethodsTest {
	
	public static void main(String[] args){
		
		Student student = new Student("Karthik",1000);
		
		//equals, getClass,hashCode, toString 
		
		System.out.println(student);// getClass().getName() + '@' + Integer.toHexString(hashCode())
		System.out.println(student.hashCode());
		
		
		System.out.println(student.getClass().getSimpleName());
		
		//equals, hashCode, ==
		

	}

}
