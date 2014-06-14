package collections;

import java.util.Comparator;

public class StudentBeanStandardComparator implements Comparator<StudentBeanList> {

	@Override
		public int compare(StudentBeanList std1, StudentBeanList std2) {
			
			return std1.getStandard()-(std2.getStandard());
			}
}