package defaultMethods;

public class EqualTest2 {
public static void main(String[] args) {
	EqualTest1 test1=new EqualTest1();
	EqualTest1 test2=new EqualTest1();
test1.EqualTest(10, "Adam");
test2.EqualTest(10, "Adam");
/*	if(test1.a.equals(test2.b)){
// y it dont work with int
		
	}*/
	if(test1.b.equalsIgnoreCase(test2.b)){
		System.out.println("Iz Equal");
	}
}
}
