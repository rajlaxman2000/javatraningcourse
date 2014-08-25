package collections.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import collections.set.Student;

public class HashMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
		
		Student std1 = new Student(10, "Harish", 20);
		Student std2 = new Student(8, "Srujana", 10);
		Student std3 = new Student(20, "Rajesh", 50);
		Student std4 = new Student(55, "Adithya", 12);
		Student std5 = new Student(30, "Bhuvan", 80);
		

	
		studentMap.put(std1.getsNO(), std1);
		studentMap.put(std2.getsNO(), std2);
		studentMap.put(std3.getsNO(), std3);
		studentMap.put(std4.getsNO(), std4);
		studentMap.put(std5.getsNO(), std5);
		
		System.out.println("Students hash map :: \n");
		System.out.println("\n"+studentMap);

		
		Map<Integer, Student> studentLinkedHashMap = new LinkedHashMap<Integer, Student>();
		
		studentLinkedHashMap.put(std1.getsNO(), std1);
		studentLinkedHashMap.put(std2.getsNO(), std2);
		studentLinkedHashMap.put(std3.getsNO(), std3);
		studentLinkedHashMap.put(std4.getsNO(), std4);
		studentLinkedHashMap.put(std5.getsNO(), std5);
		System.out.println("\n Students Liked hash map :: \n");
		System.out.println("\n"+studentLinkedHashMap);
		
		Map<Integer, Student> studentTreeMap = new TreeMap<Integer, Student>();
		
		studentTreeMap.put(std1.getsNO(), std1);
		studentTreeMap.put(std2.getsNO(), std2);
		studentTreeMap.put(std3.getsNO(), std3);
		studentTreeMap.put(std4.getsNO(), std4);
		studentTreeMap.put(std5.getsNO(), std5);
		System.out.println("\n Students Tree map :: \n");
		System.out.println("\n"+studentTreeMap);
		
	}

}
