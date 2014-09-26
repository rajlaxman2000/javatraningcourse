package com.java.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HastSetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
			HashSet<StudentForSet> studentsSet = new HashSet<StudentForSet>();
			
			StudentForSet student1 = new StudentForSet(8, "Abhinav", 30, "M.Sc");
			StudentForSet student2 = new StudentForSet(3, "Harsha", 23, "M.S");
			StudentForSet student3 = new StudentForSet(12, "ManiDeep", 23, "M.S");
			StudentForSet student4 = new StudentForSet(16, "Giri", 31, "Graduation");
			StudentForSet student5 = new StudentForSet(5, "Phani", 32, "M.Tech");
			
			StudentForSet student6 = new StudentForSet(5, "Phani", 32, "M.Tech");
			
			studentsSet.add(student1);
			studentsSet.add(student2);
			studentsSet.add(student3);
			studentsSet.add(student4);
			studentsSet.add(student5);
			//studentsSet.add(student6);
			
			
			//System.out.println(studentsSet);
			
			studentsSet.remove(student6);
			
			//System.out.println(studentsSet);
			
			
			boolean res = studentsSet.contains(student6);
			 System.out.println(res);
			
			 
			 LinkedHashSet<StudentForSet> studentsLinkedHashset = new LinkedHashSet<StudentForSet>();
			 
			 studentsLinkedHashset.add(student1);
			 studentsLinkedHashset.add(student2);
			 studentsLinkedHashset.add(student3);
			 studentsLinkedHashset.add(student4);
			 studentsLinkedHashset.add(student5);
			 
			 System.out.println(studentsLinkedHashset);
			 
	}

}
