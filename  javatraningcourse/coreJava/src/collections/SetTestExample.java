package collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTestExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		String str1 = "ABC";
		String str2 = "ABCd";
		String str3 = "abc";
		String str4 = "ABCx";
		String str5 = "ABCV";
		
		HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add(str1);
		hashSet.add(str2);
		hashSet.add(str3);
		hashSet.add(str4);
		hashSet.add(str5);
		
		//hashSet.iterator()
		System.out.println(hashSet);		
		*/
		StudentBeanForSet std1  = new StudentBeanForSet(201,2,"RAjesh");		
		StudentBeanForSet std2  = new StudentBeanForSet(101,10,"Sasi");		
		StudentBeanForSet std3  = new StudentBeanForSet(150,9,"Suny");		
		StudentBeanForSet std4  = new StudentBeanForSet(2030,7,"Karthik");
		StudentBeanForSet std5  = new StudentBeanForSet(201,2,"RAjesh");
		
		HashSet<StudentBeanForSet> studentSet = new HashSet<StudentBeanForSet>();
		
		studentSet.add(std1);
		studentSet.add(std2);
		studentSet.add(std3);
		studentSet.add(std4);
		studentSet.add(std5);		
		System.out.println(studentSet);
		
		LinkedHashSet<StudentBeanForSet> studentLinkedHashSet = new LinkedHashSet<StudentBeanForSet>();
		studentLinkedHashSet.add(std1);
		studentLinkedHashSet.add(std2);
		studentLinkedHashSet.add(std3);
		studentLinkedHashSet.add(std4);
		studentLinkedHashSet.add(std5);
		System.out.println(studentLinkedHashSet);
		
		TreeSet<StudentBeanForSet> studentLinkedHashSet1 = new TreeSet<StudentBeanForSet>();
		studentLinkedHashSet1.add(std1);
		studentLinkedHashSet1.add(std2);
		studentLinkedHashSet1.add(std3);
		studentLinkedHashSet1.add(std4);
		studentLinkedHashSet1.add(std5);
		
		System.out.println(studentLinkedHashSet);
		//studentLinkedHashSet
		//Collections.sort(studentLinkedHashSet);
		
	}

}
