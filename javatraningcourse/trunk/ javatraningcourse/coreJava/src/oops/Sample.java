package oops;

public class Sample {

	public static void main(String[] args) {
		//System.out.println("Hello Java world");
		
		Student student = new Student(20,1000,"Sasi");
		
		Student student1 = new Student();
		
		System.out.println("Actual age:"+student.getAge(007));
		System.out.println("trying to get the age:"+student.getAge(0));
		System.out.println(student.getNo());
		
		student.setAge(100);
		
		System.out.println(student1.getNo());
	}
	

}
