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

public class HashMapObjectKeyEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		StudentForMap std1 = new StudentForMap(1210,"Rajesh");
		StudentForMap std2 = new StudentForMap(101,"Sasi");
		StudentForMap std3 = new StudentForMap(1,"Sunny");
		StudentForMap std4 = new StudentForMap(186,"Karthik");
		StudentForMap std5 = new StudentForMap(2008,"Chaitu");
		StudentForMap std6 = new StudentForMap(1210,"Rajesh");
		//StudentBeanForMap std7 = new StudentBeanForMap(1210,"raghu Kumar",100);
		Parent pr1 = new Parent("Durga","RAO",58);
		Parent pr2 = new Parent("Hari","Prasad",60);
		Parent pr3 = new Parent("Phani","Bhushan",70);
		Parent pr4 = new Parent("Prasad","RAO",50);
		
		
		Map<StudentForMap, Parent> stdMap = new HashMap<StudentForMap, Parent>(10); 
		
				
		stdMap.put(std1, pr1);		
		stdMap.put(std2, pr1);		
		stdMap.put(std3, pr2);
		stdMap.put(std4, pr3);
		stdMap.put(std5, pr4);
		stdMap.put(std6, pr4);
		
		
		//stdMap.put(std7.getsNo(), std7);
		System.out.println("Normal Map");
		System.out.println(stdMap);
		System.out.println("*****************************************");
		
		//System.out.println(stdMap.get(104));
		
		Map<StudentForMap, Parent>  linkedHashMap = new LinkedHashMap<StudentForMap, Parent>();  
			
		linkedHashMap.put(std1, pr1);
		linkedHashMap.put(std2, pr2);
		linkedHashMap.put(std3, pr3);
		linkedHashMap.put(std4, pr4);
		linkedHashMap.put(std5, pr4);
		linkedHashMap.put(std6, pr4);
		//linkedHasMap.put(std7.getsName(), std7);
		System.out.println("It is linked Hasp Map wich will preseve insertion order");
		System.out.println(linkedHashMap);
		System.out.println("*****************************************");
		
		StudentForMapComparator comparator = new StudentForMapComparator();
		SortedMap<StudentForMap, Parent> treeMap = new TreeMap<StudentForMap, Parent>(comparator);
		treeMap.putAll(linkedHashMap);		
		
		System.out.println("This is Tree Map guys");
		System.out.println(treeMap);	
		
	}

}
