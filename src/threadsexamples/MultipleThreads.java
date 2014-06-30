package threadsexamples;

public class MultipleThreads implements Runnable {
	
	String threadName;
	Thread thread;
	
	public MultipleThreads(String threadName) {
		thread = new Thread(this,threadName);
		System.out.println("New Thread:  "+thread);
		thread.start();
	}
	
	public void run() {
		try{			
			for(int i=5;i>0;i--){
				System.out.println(thread.getName()+" : "+i);
				Thread.sleep(1000);
			}
			
		}catch (InterruptedException e) {
			System.err.println(thread.getName()+" theard interrupted"+e);
		}
		System.out.println(thread.getName()+ " exiting");
	}
}


