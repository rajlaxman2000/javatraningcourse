package threadsexamples;

public class ThreadAliveJoinTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ThreadAliveJoin Obj1 = new ThreadAliveJoin("One");
		ThreadAliveJoin Obj2 = new ThreadAliveJoin("Two");
		ThreadAliveJoin Obj3 = new ThreadAliveJoin("Three");
		
		System.out.println("Thread one is alive: "+Obj1.thread.isAlive());
		System.out.println("Thread two is alive: "+Obj2.thread.isAlive());
		System.out.println("Thread three is alive: "+Obj3.thread.isAlive());
		//wait for thread to finish
		try{
			System.out.println("Waiting for threads to finish");
			Obj1.thread.join();
			System.out.println("I am after obj1 join method");
			Obj2.thread.join();
			System.out.println("I am after obj2 join method");
			Obj3.thread.join();
			System.out.println("I am after obj3 join method");
		}catch (InterruptedException e) {
			System.err.println("Main thread interrupted");
		}
		
		System.out.println("Thread one is alive: "+Obj1.thread.isAlive());
		System.out.println("Thread two is alive: "+Obj2.thread.isAlive());
		System.out.println("Thread three is alive: "+Obj3.thread.isAlive());
		
		System.out.println("Main thread existing");
	}

}
