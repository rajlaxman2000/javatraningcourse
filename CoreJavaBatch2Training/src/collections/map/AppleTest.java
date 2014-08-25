package collections.map;

import java.util.HashMap;

public class AppleTest {
	
	public static void main(String[] args) {
		
		Apple a1 = new Apple("green");
		Apple a2 = new Apple("red");
		Apple a3 = new Apple("redGreen");
 
		//hashMap stores apple type and its quantity
		HashMap<Apple, Integer> m = new HashMap<Apple, Integer>();
		
		System.out.println("a1 hash code ::"+a1.hashCode());
		System.out.println("a2 hash code ::"+a2.hashCode());
		System.out.println("a3 hash code ::"+a3.hashCode());
		
	//	System.out.println("Is a2 and a3 are equal?? ::"+a2.equals(a3));
	
		
		
		m.put(a1, 10);
		m.put(a2, 20);
		m.put(a3, 30);
		
		System.out.println(m);
		
		System.out.println("Value in the key:: "+m.get(a2));
		System.out.println("Value in the key:: "+m.get(a3));
		
		
		//System.out.println(m.get(new Apple("green")));
	}

}
