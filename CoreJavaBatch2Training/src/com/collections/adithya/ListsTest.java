package com.collections.adithya;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

//import sun.security.krb5.internal.crypto.crc32;

public class ListsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Cricket> cricketList1 = new ArrayList<Cricket>();
		List<Cricket> cricketList2 = new LinkedList<Cricket>();
		
		Cricket team1 = new Cricket("India", 1, "Virat");
		Cricket team2 = new Cricket("Australia", 4, "Gilchrist");
		Cricket team3 = new Cricket("England", 2, "Flintoff");
		
		Cricket team4 = new Cricket("SriLanka", 5, "Mahela");
		Cricket team5 = new Cricket("New Zealand", 3, "Vettori");
		
		Cricket team6 = new Cricket("West Indies", 6, "Lara");
		Cricket team7 = new Cricket("New Zealand", 3, "Vettori");
		
		//ArrayList
		cricketList1.add(team1);
		cricketList1.add(team2);
		cricketList1.add(team3);
		System.out.println("ArrayList items::"+cricketList1);
		
		//LinkedList
		cricketList2.add(team4);
		cricketList2.add(team5);
		System.out.println();
		System.out.println("LinkedList items::"+cricketList2);
		
		//add linked to array
		cricketList1.addAll(cricketList2);
		System.out.println();
		System.out.println("ArrayList+LinkedList::"+cricketList1);
		//sorting this array
		Collections.sort(cricketList1);
		System.out.println();
		System.out.println("Sorted ArrayList+LinkedList::"+cricketList1);
		
		//SET
		Set<Cricket> cricketList3 = new HashSet<Cricket>();
		
		cricketList3.add(team6);
		cricketList3.add(team7);
		System.out.println();
		System.out.println("Set elements::"+cricketList3);
		//adding array and linkedlist to Set
		cricketList3.addAll(cricketList1);
		System.out.println();
		System.out.println("Set elements+Array+LinkedList::"+cricketList3);
		
		System.out.println("size of Set:"+cricketList3.size());
		System.out.println("England team removed::"+cricketList3.remove(team3));
		System.out.println("Set contains LinkedList:"+cricketList3.containsAll(cricketList2));
		
		//LinkedHashSet
		LinkedHashSet<Cricket> linkedHash = new LinkedHashSet<Cricket>();
		linkedHash.addAll(cricketList3);
		System.out.println();
		System.out.println("linkedHashSet elements:"+linkedHash);
		
		linkedHash.removeAll(cricketList2);
		System.out.println();
		System.out.println("LinkedHashSet after removing LinkedList::"+linkedHash);
		
		
		
		
	}

}
