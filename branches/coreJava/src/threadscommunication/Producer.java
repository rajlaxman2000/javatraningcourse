package threadscommunication;

class Producer implements Runnable {
	Q q;

	Producer(Q q) {
		this.q = q;
		new Thread(this, "Producer").start();
	}

	public void run() {
		int i = 0;
		while (true) {
			q.put(i++);
		}
	}
}

/*
  class Producer implements Runnable {
  
  public Q q;
  
  Producer(Q q) { this.q = q; new Thread(this, "Producer").start(); }
  
  public void run() { 
  	int i = 0; 
  	while (true) { 
  		q.put(i++); 
  	} 
  } 
 }
 */