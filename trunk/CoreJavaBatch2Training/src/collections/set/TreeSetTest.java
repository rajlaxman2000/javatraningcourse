package collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Set<Student> studentSet = new HashSet<Student>();
		
		Student std1 = new Student(10, "Harish", 20);
		Student std2 = new Student(8, "Srujana", 10);
		Student std3 = new Student(20, "Rajesh", 50);
		Student std4 = new Student(55, "Adithya", 12);
		Student std5 = new Student(3, "Bhuvan", 80);
		
		
			//System.out.println(std5.hashCode());
		Student std6 = new Student(3, "Bhuvan", 80);
		
		studentSet.add(std1);
		studentSet.add(std2);
		studentSet.add(std3);
		studentSet.add(std4);
		studentSet.add(std5);
		studentSet.add(std6);
		
		System.out.println(studentSet);
		
		Set<Student> studentsTreeSet = new TreeSet<Student>();
		
		studentsTreeSet.add(std1);
		studentsTreeSet.add(std2);
		studentsTreeSet.add(std3);
		studentsTreeSet.add(std4);
		studentsTreeSet.add(std5);
		studentsTreeSet.add(std6);
		
		System.out.println("Result of Tree Set of student objects ::\n"+studentsTreeSet);

	}

}
