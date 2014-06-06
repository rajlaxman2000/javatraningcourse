package defaultMethods;

public class Test {
public static void main(String[] args) {
	DefaultMethods methods= new DefaultMethods(10, 20);
	DefaultMethods methods2= new DefaultMethods(20, 30);
	System.out.println(methods.hashCode());
	System.out.println(methods.toString());
	System.out.println(methods2.hashCode());// y its 10
}
}
