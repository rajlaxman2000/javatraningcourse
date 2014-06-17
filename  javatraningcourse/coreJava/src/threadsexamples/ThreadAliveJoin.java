package threadsexamples;

public class ThreadAliveJoin implements Runnable{

	String name;
	Thread thread;

	public ThreadAliveJoin(String name){
		thread = new Thread(this,name);
		System.out.println("New Thread: "+thread);
		thread.start();
	}
	@Override
	public void run() {
		try{
			for(int i=5;i>0;i--){
				System.out.println(thread.getName()+" : "+i);
				Thread.sleep(1000);
			}			
		}catch (InterruptedException e) {
			System.out.println(thread.getName()+" interrupted");
		}
		System.out.println(thread.getName()+" existing.");		
	}

}
