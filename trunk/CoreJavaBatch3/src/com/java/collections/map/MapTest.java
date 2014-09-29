package com.java.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import com.java.collections.set.StudentForSet;

public class MapTest {

	public static void main(String[] args){
		
		StudentForMap student1 = new StudentForMap(8, "Abhinav", 30, "M.Sc");
		StudentForMap student2 = new StudentForMap(3, "Harsha", 23, "M.S");
		StudentForMap student3 = new StudentForMap(12, "ManiDeep", 23, "M.S");
		StudentForMap student4 = new StudentForMap(16, "Giri", 31, "Graduation");
		StudentForMap student5 = new StudentForMap(5, "Phani", 32, "M.Tech");
		
		Map<Integer, StudentForMap> studentsMap = new HashMap<Integer, StudentForMap>();
		
		studentsMap.put(student1.getId(),student1);
		studentsMap.put(student2.getId(), student2);
		studentsMap.put(student3.getId(), student3);
		studentsMap.put(student4.getId(), student4);
		studentsMap.put(student5.getId(), student5);
		
			for(Integer key :studentsMap.keySet()){
				System.out.println(studentsMap.get(key));
			}


			
		Map<String, StudentForMap> studentsMapStr = new HashMap<String, StudentForMap>();
			
			studentsMapStr.put(student1.getName(),student1);
			studentsMapStr.put(student2.getName(), student2);
			studentsMapStr.put(student3.getName(), student3);
			studentsMapStr.put(student4.getName(), student4);
			studentsMapStr.put(student5.getName(), student5);
			
		Map<Integer, StudentForMap> studentsLinkedHashMap = new LinkedHashMap<Integer, StudentForMap>();
			
		studentsLinkedHashMap.put(student1.getId(),student1);
		studentsLinkedHashMap.put(student2.getId(), student2);
		studentsLinkedHashMap.put(student3.getId(), student3);
		studentsLinkedHashMap.put(student4.getId(), student4);
		studentsLinkedHashMap.put(student5.getId(), student5);
			
		System.out.println("\n ********  Map which is Saved in Linked Hash Map ************\n");
				for(Integer key :studentsLinkedHashMap.keySet()){
					System.out.println(studentsLinkedHashMap.get(key));
				}
			
	}
}
