package overridingwithExceptions;

public class Case1SubClass2 extends Case1Super {

	public static void main(String[] args) {
		
			Case1Super s = new Case1SubClass2();// compilation error
			s.show();
				
	}

	public void show() throws RuntimeException { // compilation error
		System.out.println("parent class");
	}
}
