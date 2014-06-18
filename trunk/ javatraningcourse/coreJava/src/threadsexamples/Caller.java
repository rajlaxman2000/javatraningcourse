package threadsexamples;

public class Caller implements Runnable {

	String msg;
	CallMe target;
	Thread t;

	public Caller(CallMe obj, String s) {
		target = obj;
		msg = s;
		t = new Thread(this);
		t.start();
	}

	public void run() {
		//target.call(msg);
		
		/* Synchornized block */
		synchronized (target) {
			target.call(msg);
		}
	}

}
