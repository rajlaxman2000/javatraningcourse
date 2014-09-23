package com.java.collections;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<StudentForList> {

	@Override
	public int compare(StudentForList std1, StudentForList std2) {
		
		
		String str1 = std1.getName();
		String str2 = std2.getName();
		
		int x = str1.compareTo(str2);
			
		return x;
	}

}
