package overridingwithExceptions;

import java.io.IOException;

public class Case2SubClass1 extends Case2Super1 {

	public static void main(String[] args) {
		
			Case2Super1 s = new Case2SubClass1();// compilation error
			
				try {
					s.show();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				
	}

	/* public void show() throws Exception { // Correct */
	public void show() throws RuntimeException { // fine because un checked/runtime exception
		System.out.println("parent class");
	}
	
	/* public void add() throws IOException{ //compilation error bcz it is not subclass of Runtime Exception*/
	public void add() throws NullPointerException{  // fine because it is sub class off Runtime Exception 
		System.out.println("parent class");
	}
}
