package overridingwithExceptions;

public class Case1SubClass extends Case1Super {

	public static void main(String[] args) {
		Case1Super s = new Case1SubClass();// compilation error
		s.show();
	}

	public void show() throws IOException { // compilation error
		System.out.println("parent class");
	}
}
