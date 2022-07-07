package ui;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsExtra1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character[] letters = {'P', 'C', 'M'};
		List<Character> letterLijst = Arrays.asList(letters);
		
		System.out.println("list contains:");
		
		output(letterLijst);
		
		Collections.reverse(letterLijst);
		System.out.println("list reverse:");
		output(letterLijst);
		
		Character[] lettersCopy = new Character[3];
		List<Character> copyLijst = Arrays.asList(lettersCopy);
		
		//Collections.copy(letterLijst, copyLijst);
		Collections.copy(copyLijst, letterLijst);
		System.out.println("copy:");
		output(copyLijst);
		
		Collections.fill(letterLijst, 'R');
		System.out.println("fill:");
		output(letterLijst);
		

	}
	
	private static void output(List<Character> listRef) {
		System.out.print("The list is: ");
		for(Character kar: listRef) {
			System.out.printf("%s ", kar);
		}
		
		System.out.printf("%nMax: %s",  Collections.max(listRef));
		System.out.printf("%nMin: %s",  Collections.min(listRef));
	}

}
