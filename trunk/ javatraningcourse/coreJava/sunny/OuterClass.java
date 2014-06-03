
public class OuterClass {
	//this is outer most class
	int x=70;
	int y=100;
	static int z=200;
    int sum=x+y;
	public void calculate(){
		System.out.println("result=" +sum);
        System.out.println("Static Z value="+z);
	}
	//this is inner static class
	public static class InnerStaticClass{
		int length=1000;
		int breadth=2000;
		int area=length*breadth;
		public  void cal1(){
			OuterClass.z=300;
			System.out.println("Area="+area);
		     System.out.println("New Static Z value="+z);
		
		}
	}
	//inner non-static class
	public class InnerNonStaticClass{
		public void reCalculte(){
			OuterClass obj=new OuterClass();
			obj.x=1;
			obj.y=2;
			OuterClass.z=3;
			int result=x+y;
			
			System.out.println("new result="+result);
			System.out.println("New Static Z value "+z);
			
			
		}
	}
	
	
	
	
	
	
	}
	
