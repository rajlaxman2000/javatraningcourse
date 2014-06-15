package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<ArrayListClass> emp = new ArrayList<ArrayListClass>();
		ArrayListClass alc1 = new ArrayListClass(123, 20, "xelo");
		ArrayListClass alc2 = new ArrayListClass(555, 45, "killo");
		ArrayListClass alc3 = new ArrayListClass(91, 35, "avacado");
		emp.add(alc1);
		emp.add(alc2);
		emp.add(alc3);
		int x=alc1.compareTo(alc2);
		System.out.println(x);
		
		/*for (ArrayListClass all : emp) {
			System.out.println("Id :" + all.getId());
			System.out.println("No :" + all.getNo());
			System.out.println("Name :" + all.getName());
		}
		System.out.println("After sorting");
		Collections.sort(emp);
		for (ArrayListClass all : emp) {
			System.out.println("Id :" + all.getId());
			System.out.println("No :" + all.getNo());
			System.out.println("Name :" + all.getName());
		}
		System.out.println("After sorting Names");
		Collections.sort(emp, new ArraySortNames());
		for (ArrayListClass all : emp) {
			System.out.println("Id :" + all.getId());
			System.out.println("No :" + all.getNo());
			System.out.println("Name :" + all.getName());
		}*/
	}
	public int compr(int x,int y ){
		if(x>y)
			return 1;
		else if (x<y) {
			return -1;
		}
		return 0;
	}
}
