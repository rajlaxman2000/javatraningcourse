package threadsexamples;

//Demonstrate thread priorities.
public class ThreadPriorityEx {
	
	public static void main(String args[]) {
		
		//MAkign main thread has top priority
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		
		ThreadPriority hi = new ThreadPriority(Thread.NORM_PRIORITY + 2);
		ThreadPriority lo = new ThreadPriority(Thread.NORM_PRIORITY - 2);

		hi.start();
		lo.start();		
				
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
		
		lo.stop();
		hi.stop();
		// Wait for child threads to terminate.
		try {
			hi.t.join();
			lo.t.join();
		} catch (InterruptedException e) {
			System.out.println("InterruptedException caught");
		}
		System.out.println("Low-priority thread: " + lo.click);
		System.out.println("High-priority thread: " + hi.click);
	}
}