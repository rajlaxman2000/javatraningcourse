package defaultmethods;



public class DefaultMethodsTest {
	
	public static void main(String[] args){
		
		Student student = new Student("Karthik",1000);
		
		//equals, getClass,hashCode, toString 
		
		//System.out.println(student);// getClass().getName() + '@' + Integer.toHexString(hashCode())
		//System.out.println(student.hashCode());
		
		
		//System.out.println(student.getClass().getSimpleName());	
		//equals, hashCode, ==
		
		int a=100;
		int b=200;
		Integer integer1 = new Integer(a);
		Integer integer2 = new Integer(b); 
		
		Integer integer3 = integer1;
		
		String name = "Phani";
					
		if(integer1 == integer3){
			System.out.println("Both are equal");
		}else{
			System.out.println("Both are not equal");
		}
		
		System.out.println("integer 1 hash code ::"+integer1.hashCode()+"\n integer2 hash code ::"+integer2.hashCode());
		if(integer1.equals(integer2)){
			System.out.println("Both are equal");
		}else{
			System.out.println("Both are not equal");
		}
		
		Student student1 = new Student("Sasi", 12345);
		Student student2 = new Student("Sunny", 123456);
		Student student3 = new Student("Sasi", 12345);
		
		if(student1==student3){
			System.out.println("Student 1 & Student 3 are equal");
		}else{
			System.out.println("Student 1 & Student 3 are not equal");
		}
		
		if(student1.equals(student3)){
			System.out.println("Student 1 & Student 3 are equal");
		}else{
			System.out.println("Student 1 & Student 3 are not equal");
		}
		
		System.out.println(student1.hashCode());
		System.out.println(student3.hashCode());
		
	}
}