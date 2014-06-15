package collections;

import java.util.Comparator;

public class StudentForMapComparator implements Comparator<StudentForMap>{

	@Override
	public int compare(StudentForMap std1, StudentForMap std2) {
		
		return std1.getName().compareTo(std2.getName());
	}

}
