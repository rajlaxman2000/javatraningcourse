package threadsexamples;

import java.io.FileOutputStream;

public class TestThread implements Runnable{

	Thread t;
	public TestThread(){
		
		t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		try {
			
			FileOutputStream fout = new FileOutputStream("TestTHreadCapacity.txt");
			
			String s = "Sachin Tendulkar is my favourite player, He is very good player";

			byte b[] = s.getBytes();
			
			fout.write(b);

			fout.close();
			
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

	
}
