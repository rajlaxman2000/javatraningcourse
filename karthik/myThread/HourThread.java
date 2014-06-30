package myThread;

public class HourThread extends Thread {
	int l;
			
		public  HourThread() {
			// TODO Auto-generated constructor stub
		
			super("Hour Thread");
			System.out.println("Child Thread: "+this);
			start();
		}
		
		public void run(){
			try{
				for( l=7;l<12;l++){
					System.out.println("Hours Thread:: "+l);
					Thread.sleep(3600000);
				}
			}catch (InterruptedException e) {
				System.out.println("Child thread interrupted");
			}
			
			//System.out.println("Existing from child thread");
		}
		

	}


