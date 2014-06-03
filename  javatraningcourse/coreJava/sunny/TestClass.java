
public class TestClass {

	public static void main(String[] args) {
		OuterClass obj=new OuterClass();
		obj.calculate();
		OuterClass.InnerStaticClass obj1=new OuterClass.InnerStaticClass();
obj1.cal1();
OuterClass.InnerNonStaticClass obj2=obj.new InnerNonStaticClass();
//OuterClass.InnerNonStaticClass class1= new OuterClass.InnerNonStaticClass();
obj2.reCalculte();
		
		
	

	}

}
