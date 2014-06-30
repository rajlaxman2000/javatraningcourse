package threads;

public class ThreadTest implements Runnable {
	Thread therd;
	public ThreadTest(){
		therd= new Thread(this,"Dale Thread");
	}
	@Override 
	public void run() {
		try{
		for(int i= 1; i<=10;i++){
			System.out.println("main"+i);
			therd.sleep(1000);
		}
		}catch(Exception e){
System.out.println("Main Thread Interrupted");
	}
	}
}
