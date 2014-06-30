package collections;

import java.util.Comparator;

public class ArraySortNames implements Comparator<ArrayListClass> {

	@Override
	public int compare(ArrayListClass alc1, ArrayListClass alc2) {
		return alc2.compareTo(alc1);
	}

}
