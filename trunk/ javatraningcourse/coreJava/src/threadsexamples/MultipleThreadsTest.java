package threadsexamples;

public class MultipleThreadsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new MultipleThreads("One");
		new MultipleThreads("Two");
		new MultipleThreads("Three");
		try{
			Thread.sleep(10000);
		}catch (InterruptedException e) {
			System.err.println("Main thread interrupted");
		}
		System.out.println("Main thread existing");
	}

}
