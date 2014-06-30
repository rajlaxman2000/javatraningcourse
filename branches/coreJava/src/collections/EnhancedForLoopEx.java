package collections;

import java.util.ArrayList;
import java.util.List;

public class EnhancedForLoopEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Student std1 = new Student(10, "Rajesh");
		Student std2 = new Student(11, "Rajesh11");
		Student std3 = new Student(12, "Rajesh12");
		Student std4 = new Student(13, "Rajesh13");
		Student std5 = new Student(14, "Rajesh14");
		Student std6 = new Student(15, "Rajesh15");
		
		
		List<Student> students = new ArrayList<Student>();
		//<Student> students1 = new ArrayList<Student>();
		students.add(std1);
		students.add(std2);
		students.add(std3);
		students.add(std4);
		students.add(std5);
		students.add(std6);
		
		for(int i=0;i<students.size();i++){
			System.out.println(students.get(i).getId());
		}
		
		for(Student student:students){
			System.out.println(student);
		}
		
		/*
		 * 
		 * writing the code with even raising the Exception 
		final String numbRegEx="\\d+";
		
			String s = new String("100");
			boolean a = s.matches(numbRegEx);
			System.out.println(a);
			Integer x=null;
			if(a == true){
				x = new Integer(s);
			}else{
				System.out.println("beter you check the format of the string");
			}
		
		
		for(int i=0;i<students.size();i++){
			System.out.println(students.get(i).getId());
		}
		if(x!=null){
			for(Student student:students){
				System.out.println(student);
			}
		}
		
		*/
	}

}
