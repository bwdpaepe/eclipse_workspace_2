package ui;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = { "yellow", "green", "black", "tan", "grey", "white", "orange", "red","green" };
		
		SortedSet<String> sset = new TreeSet<>(Arrays.asList(names));
		System.out.println("sorted: ");
		printSet(sset);
		
		printSet(sset.headSet("orange"));
		printSet(sset.tailSet("orange"));
		System.out.printf("first: %s%n", sset.first());
		System.out.printf("last: %s%n", sset.last());

	}
	
	private static void printSet(SortedSet<String> sset) {
		for(String s: sset) {
			System.out.printf("%s ", s);
		}
	}

}
