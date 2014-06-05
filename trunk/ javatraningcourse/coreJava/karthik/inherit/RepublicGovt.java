package inherit;

public class RepublicGovt extends Govt {
	
	public int noofsenetors;
	public int noofstates;

	
	public void formcabinet(){
		System.out.println("cabinate members selected");
	}
	public void electpresident(){
		System.out.println("pm elected");
	}
	public  void attendparliament(){
	
	System.out.println("metod override from abstract class");
	}


}
