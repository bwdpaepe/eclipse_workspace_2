package ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] colors = { "MAGENTA", "RED", "WHITE", "BLUE", "CYAN" };
		List<String> lijstColors = Arrays.asList(colors);
		System.out.printf("unsorted: %s%n", lijstColors);
		
		//sort
		Collections.sort(lijstColors);
		System.out.printf("sorted: %s%n", lijstColors);
		
		vervolg1();
	}
	
	private static void vervolg1() {
		String[] colors = { "MAGENTA", "RED", "WHITE", "BLUE", "CYAN" };
		List<String> lijstColors = Arrays.asList(colors);
		
		Collections.sort(lijstColors, Collections.reverseOrder());
		System.out.printf("sorted reverse: %s%n", lijstColors);
		
		
	}

}
