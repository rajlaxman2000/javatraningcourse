package variables;

public class StaticMethodTest {
	
	public static void main(String[] args){
		
		StaticMethod.callMe(5,4);	
		
		StaticMethod staticMethod  = new StaticMethod();
		
		staticMethod.nonStaticcMethod();
	}
	

}
