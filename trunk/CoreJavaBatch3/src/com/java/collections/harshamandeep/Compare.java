package com.java.collections.harshamandeep;

public class Compare {

	static String arr[] = { "harsha", "teja", "Katakam", "harmil", "manideep" };

	public static void main(String[] args) {

		for (int j = 0; j < arr.length; j++) {
			for (int i = j + 1; i < arr.length; i++) {
				if (arr[i].compareTo(arr[j]) < 0) {
					String t = arr[j];
					arr[j] = arr[i];
					arr[i] = t;
				}
			}
			System.out.println(arr[j]);
		}
		// need to know how to write same code in compareIgnore//

	}
}