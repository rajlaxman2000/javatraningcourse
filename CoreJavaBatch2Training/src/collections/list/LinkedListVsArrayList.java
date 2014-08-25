package collections.list;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class LinkedListVsArrayList {
	
	public static final int size = 1000000;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
	
		List<Employee> empList = new ArrayList<Employee>();
		
		Employee tmpEmp1  = new Employee();
		
		long startTime = System.currentTimeMillis();
		
		for(int i=1;i<=size;i++){
			tmpEmp1.setEmpId(i);
			tmpEmp1.setAge(10+i);
			tmpEmp1.setName("Name"+i);
			empList.add(tmpEmp1);
		}		
		
		long totalTime = System.currentTimeMillis()-startTime;
		
		System.out.println("Time took for inserting "+size+" elements in array List :: "+totalTime+" ms");
		
		List<Employee> empLinkedList = new LinkedList<Employee>();
		
		Employee tmpEmp2  = new Employee();
		
		startTime = System.currentTimeMillis();
		for(int i=1;i<=size;i++){
			tmpEmp2.setEmpId(i);
			tmpEmp2.setAge(10+i);
			tmpEmp2.setName("Name"+i);
			empLinkedList.add(tmpEmp2);
		}
		totalTime = System.currentTimeMillis()-startTime;
		System.out.println("Time took for inserting "+size+" elements in Linked List :: "+totalTime+" ms");
		
		
		/* Searching time for Array List and linked list*/
		
		Employee tmpEmp3 = new Employee(50000, "Name50000", 50010);
		
		startTime = System.currentTimeMillis();
		empList.contains(tmpEmp3);
		System.out.println("Time to search the middle element in array List:: "+(System.currentTimeMillis()-startTime)+"ms");
		
		startTime = System.currentTimeMillis();
		empLinkedList.contains(tmpEmp3);
		System.out.println("Time to search the middle element in Linked List:: "+(System.currentTimeMillis()-startTime)+"ms");
	}

}
