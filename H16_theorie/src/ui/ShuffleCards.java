package ui;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
		
		List<String> suitsList = Arrays.asList(SUITS);
		
		Collections.sort(suitsList);
		System.out.println("sorted");
		printList(suitsList);
		
		Collections.shuffle(suitsList);
		System.out.println("shuffled");
		printList(suitsList);
		
		
		

	}
	
	private static void printList(List<String> list) {
		for(String s: list) {
			System.out.printf("%s ", s);
		}
		System.out.println();
	}

}
