package ui;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] colors = {"red", "white", "blue", "green", "gray", "orange", "tan", "white", "cyan",
				"peach", "gray", "orange"}; 
		
		List<String> lijst = Arrays.asList(colors);
		printND(lijst);
		

	}
	
	private static void printND(Collection<String> collection) {
		Set<String> set = new HashSet<>(collection);
		System.out.println("\nNonduplicates: ");
		for(String s: set) {
			System.out.printf("%s ", s);
		}
	}

}
