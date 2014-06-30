package threadsexamples;

public class CallMe {

	//public synchronized void call(String msg) {
	public void call(String msg) {
		System.out.print("[" + msg);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
		System.out.println("]");
	}

}
