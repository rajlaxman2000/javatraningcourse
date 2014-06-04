package polymorpshim;

public class SumOfNumbers {
	
	public void sum(int a, int b){
		System.out.println(a+b);
	}
	
	public void sum(int a, int b, int c){
		System.out.println(a+b+c);
	}
	
	public void sum(int a, float b){
		System.out.println(a+b);
	}

	public void sum(float a, int b){
		System.out.println(a+b);
	}
	
	public void sum(float a, float b){
		System.out.println(a+b);
	}

}
