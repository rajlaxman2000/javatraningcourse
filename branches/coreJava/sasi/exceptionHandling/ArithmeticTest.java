package exceptionHandling;

public class ArithmeticTest {
	public static void main(String[] args) {
		ArithmeticExceptionTest test = new ArithmeticExceptionTest();
		try {
			test.exe();
		} catch (MyOwnException e) {
			// TODO Auto-generated catch block
			MyOwnException ex = new MyOwnException(e.getMessage());
			System.out.println("Hell Is always goood::  " + ex.getMessage());
		}
	}
}
