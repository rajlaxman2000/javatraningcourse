package threadsexamples;

public class ThreadByRunnable implements Runnable  {

	Thread thread;
	
	public ThreadByRunnable(){
		thread = new Thread(this,"Demo Thread");
		System.out.println("Child Thread: "+thread);
		thread.start();
	}
	@Override
	public void run() {
		try{
			for(int i=5;i>0;i--){
				System.out.println("Child Thread: "+i);
				Thread.sleep(500);
			}
		}catch (InterruptedException e) {
			System.out.println("Child Thread Interrupted"+e);
		}
		System.out.println("Existing the child thread");
	}

}
