package variables;

public class StaticTest {
	
	
	public static void main(String args[]){
	
		StaticUse obj1= new StaticUse();		
		obj1.x=100;
		obj1.y=10;
		obj1.z="Sasi";
		System.out.println(obj1.toString());	
		
		StaticUse.x=200;		
		System.out.println(obj1.toString());	
		//////////////////////////////////////////////////
		StaticUse obj2= new StaticUse();
		obj2.x=500;
		obj2.y=50;
		obj2.z="Karthik";
		
		System.out.println(obj2.toString());	
		
		StaticUse.x=12345;
		
		System.out.println(obj1.toString());	
		System.out.println(obj2.toString());	
	}

}
