package overridingwithExceptions;

public class Case2Super1 {
	
	public void show() throws Exception {
		System.out.println("parent class");
	}
	
	public void add() throws RuntimeException {
		System.out.println("parent class");
	}
}
