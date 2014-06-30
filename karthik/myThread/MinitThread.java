package myThread;

public class MinitThread extends Thread {

	int k;

	public MinitThread() {
		// TODO Auto-generated constructor stub

		// TODO Auto-generated constructor stub

		super("Minit Thread");
		// System.out.println("Child Thread: "+this);
		start();
	}

	public void run() {
		try {
			for (k=12; k < 60; k++) {
				System.out.println("Minits Thread:: " + k);
				Thread.sleep(60000);
			}
			while (true) {
				
				for (k=0; k < 60; k++) {
					System.out.println("Minits Thread:: " + k);
					Thread.sleep(60000);
				}
			
			
			}
		} catch (InterruptedException e) {
			System.out.println("Child thread interrupted");
		}

		// System.out.println("Existing from child thread");
	}

}
