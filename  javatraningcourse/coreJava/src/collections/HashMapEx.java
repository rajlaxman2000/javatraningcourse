package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashMapEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		StudentBeanForMap std1 = new StudentBeanForMap(1210,"RAjesh",new Integer(30));
		StudentBeanForMap std2 = new StudentBeanForMap(101,"Sasi",23);
		StudentBeanForMap std3 = new StudentBeanForMap(1,"Sunny",24);
		StudentBeanForMap std4 = new StudentBeanForMap(186,"Karthik",25);
		StudentBeanForMap std5 = new StudentBeanForMap(2008,"Chaitu",27);
		
		
		Map<Integer, StudentBeanForMap> stdMap = new HashMap<Integer, StudentBeanForMap>(10); 
		
		stdMap.put(std1.getsNo(), std1);
		stdMap.put(std2.getsNo(), std2);
		stdMap.put(std3.getsNo(), std3);
		stdMap.put(std4.getsNo(), std4);
		stdMap.put(std5.getsNo(), std5);
		System.out.println("Normal Map");
		System.out.println(stdMap);
		System.out.println("*****************************************");
		
		//System.out.println(stdMap.get(104));
		
		Map<Integer, StudentBeanForMap>  linkedHasMap = new LinkedHashMap<Integer, StudentBeanForMap>();  
			
		linkedHasMap.put(std1.getsNo(), std1);
		linkedHasMap.put(std2.getsNo(), std2);
		linkedHasMap.put(std3.getsNo(), std3);
		linkedHasMap.put(std4.getsNo(), std4);
		linkedHasMap.put(std5.getsNo(), std5);
		
		System.out.println("It is linked Hasp Map wich will preseve insertion order");
		System.out.println(linkedHasMap);
		System.out.println("*****************************************");
		
		SortedMap<Integer, StudentBeanForMap> treeMap = new TreeMap<Integer, StudentBeanForMap>();
		treeMap.putAll(linkedHasMap);
		
		
		
		System.out.println("This is Tree Map guys");
		System.out.println(treeMap);	
		
		Set<Integer> keys = stdMap.keySet();
		
		System.out.println(keys);
		
		TreeSet<Integer> sortedKeys = new TreeSet<Integer>();
		
		sortedKeys.addAll(keys);
		System.out.println("After sorting");
		System.out.println(sortedKeys);
		
		System.out.println("Prting keys using iterator");
		
		for (Iterator<Integer>  intIterator=keys.iterator(); keys.iterator().hasNext();) {
			System.out.println(intIterator.next());
		}
	}

}
