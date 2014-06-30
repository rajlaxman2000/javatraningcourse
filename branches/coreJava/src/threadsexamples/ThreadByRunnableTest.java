package threadsexamples;

public class ThreadByRunnableTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThreadByRunnable t = new ThreadByRunnable();
		
		try{
			for(int i=5;i>0;i--){
				System.out.println("Main Thread: "+i);
				Thread.sleep(1000);
			}
		}catch (InterruptedException e) {
			System.err.println("Main thread interrupted"+e);
		}
		
		System.out.println("Main thread existing");

	}

}
