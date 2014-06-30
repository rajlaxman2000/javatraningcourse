package exceptionHandling;

public class ClassNotFoundExceptionTest {
public static void main(String[] args) throws ClassNotFoundException {
Class.forName("ClassNotFound");
	System.out.println("Class Exists");
 
}
}
