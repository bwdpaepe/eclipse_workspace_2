package ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] colors1 = { "MAGENTA", "RED", "WHITE", "BLUE", "CYAN" };
		List<String> list1 = new LinkedList<>(Arrays.asList(colors1));
		
		String[] colors2 = { "RED", "WHITE", "BLUE" };
		List<String> list2 = new LinkedList<>(Arrays.asList(colors2));
		
		list1.addAll(list2);
		
		list2 = null;
		
		convertToLowercase(list1);
		
		printList(list1);
		
		

	}
	
	private static void printList(List<String> list) {
		for(String s: list) {
			System.out.printf("%s ", s);
		}
		System.out.println();
	}
	
	private static void convertToLowercase(List<String> list) {
		ListIterator<String> iterator = list.listIterator();
		while(iterator.hasNext()) {
			iterator.set(iterator.next().toLowerCase());
		}
		
	}

}
