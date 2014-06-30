package myThread;


public class ClockTest {
	public static void main(String[] args) {
		HourThread hr=new HourThread();
		MinitThread mt=new MinitThread();
		
		try{
			while(true){
			for(int i=0;i<60;i++){
				System.out.println(hr.l+":"+mt.k+":"+i);
				Thread.sleep(1000);
			}
		}}catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		System.out.println("Exisitng from main thread");

	}


}
