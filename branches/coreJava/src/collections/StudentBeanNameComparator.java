package collections;

import java.util.Comparator;

public class StudentBeanNameComparator implements Comparator<StudentBeanList> {

	@Override
	public int compare(StudentBeanList std1, StudentBeanList std2) {
		
		return std2.compareTo(std1);
	}

}
