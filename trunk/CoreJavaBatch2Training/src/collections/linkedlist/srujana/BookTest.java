package collections.linkedlist.srujana;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class BookTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Book book1 = new Book(1,"Are you afraid of the dark","Sidney Sheldon",2004);
		Book book2 = new Book(2,"Bloodline","Sidney Sheldon",1977);
		Book book3 = new Book(3,"Hamlet","William Shakespeare",1600);
		Book book4 = new Book(2,"Bloodline","Sidney Sheldon",1977);
		
		List<Book> bookArrayList = new ArrayList<Book>();
		List<Book> bookLinkedList = new LinkedList<Book>();

		bookArrayList.add(book1);
		bookArrayList.add(book2);
		bookLinkedList.add(book3);
		bookLinkedList.add(book4);
		
		System.out.println("\nArrayList: "+bookArrayList);
		System.out.println("\nLinkedList: "+bookLinkedList);
		
		bookArrayList.addAll(bookLinkedList);
		System.out.println("\nArrayList after merging linkedlist: "+bookArrayList);
		
		//Set
		Set<Book> bookset = new HashSet<Book>();
		bookset.addAll(bookArrayList);
		
		System.out.println("\nSet: "+bookset);
		System.out.println("\nsize of set: "+bookset.size());
		System.out.println("Set contains book 4: "+bookset.contains(book4));
		System.out.println("set contains book 2: "+bookset.contains(book2));
		
		bookset.remove(book4);
		System.out.println("After removing book 4, set contains book 4: "+bookset.contains(book4));
		System.out.println("After removing book 4, set contains book 2: "+bookset.contains(book2));
		System.out.println("size of set after removing book4: "+bookset.size());
		System.out.println("\nset after removing book 4: "+bookset);
		
		
		//LinkedHashset
		LinkedHashSet<Book> linkedHashset = new LinkedHashSet<Book>();
		linkedHashset.addAll(bookArrayList);
		System.out.println("\nLinked Hash set list: "+linkedHashset);
		
		System.out.println("\nsize of hash set: "+linkedHashset.size());
		System.out.println("Hashset contains book 4: "+linkedHashset.contains(book4));
		System.out.println("Hashset contains book 2: "+linkedHashset.contains(book2));
		
		linkedHashset.remove(book4);
		System.out.println("After removing book 4, Hashset contains book 4: "+linkedHashset.contains(book4));
		System.out.println("After removing book 4, Hashset contains book 2: "+linkedHashset.contains(book2));
		System.out.println("size of hash set after removing book4: "+linkedHashset.size());
		System.out.println("\nlinked hash set list after removing book 4: "+linkedHashset);
		
	}

}
