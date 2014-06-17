package threadsexamples;

public class ThreadObjExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		
		System.out.println("Current Thread :: "+t);
		t.setName("My Thread");
			
	 	System.out.println(t.getId());
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println(t.getContextClassLoader());
		System.out.println(t.getStackTrace());
		System.out.println(t.getState());
	 	
		try{
			for(int i=0;i<5;i++){
				System.out.println(i);
				Thread.sleep(5000);				
			}
			System.out.println("Thread is at the end");
		}catch (InterruptedException e) {
			System.err.println("Main method Interrupted"+e);
		}
		
	}

}
