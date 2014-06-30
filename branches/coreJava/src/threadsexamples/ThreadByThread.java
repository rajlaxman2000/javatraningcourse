package threadsexamples;

public class ThreadByThread extends Thread {
	
	public ThreadByThread() {
		super("Demp Thread");
		System.out.println("Child Thread: "+this);
		start();
	}
	
	public void run(){
		try{
			for(int i=5;i>0;i--){
				System.out.println("Child Thread:: "+i);
				Thread.sleep(500);
			}
		}catch (InterruptedException e) {
			System.out.println("Child thread interrupted");
		}
		
		System.out.println("Existing from child thread");
	}
	

}
