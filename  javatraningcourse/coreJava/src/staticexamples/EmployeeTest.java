package staticexamples;

public class EmployeeTest {
	
	public static void main(String[] args){
		
		Employee emp1 = new Employee(1,"Adithya","05101990");
		
		Employee emp2 = new Employee();
		
		System.out.println(emp1.getName());
		
		String name = new String("Rajesh");
		
		name = name + "Reddy";
		
		System.out.println(name.concat("DNSVL"));
		
		System.out.println(name);
		
		int no = 1;
		
		Integer number = new Integer(123);
		
		Long long1;
		
		
		System.out.println(number.toBinaryString(10));
		
		StringBuilder builder = new StringBuilder("Rajesh");
		
		builder.append(" Reddy");
		builder.append(" DNSVL");
		System.out.println(builder);
		
	}

}
