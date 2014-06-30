package threadsexamples;

public class ThreadPriority implements Runnable{

	long click = 0;
	Thread t;
	private volatile boolean running = true;

	public ThreadPriority(int p) {
		t = new Thread(this);
		t.setPriority(p);
	}

	public void run() {
		while (running) {
			click++;
		}
	}

	public void stop() {
		running = false;
	}

	public void start() {
		t.start();
	}
}

