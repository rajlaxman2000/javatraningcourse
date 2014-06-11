package myExceptionhandling;

public class IllegalThreadStateEx implements Runnable {
		Thread t = new Thread(this,"Running Thread:");
		 
		public void run(){
		t.start();
		System.out.println("Running Thread:" + t);
		}
		}


