package myExceptionhandling;

public class IllegalThreadStateExTest {
			 
		public static void main(String args[]){
		IllegalThreadStateEx X1 = new IllegalThreadStateEx();
		 
		Thread.currentThread().setName("Main Thread");
		 
		 
		try{
		System.out.println(Thread.currentThread().getName( ));
		X1.run();
		}
		catch (IllegalThreadStateException e) {
		System.out.println("Illegal Thread State Exception"+e);
		}
		
				 
		}
		}


