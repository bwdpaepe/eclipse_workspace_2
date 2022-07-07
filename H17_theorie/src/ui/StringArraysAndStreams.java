package ui;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringArraysAndStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings = 
	         {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};

	    // display original strings
	    System.out.printf("Original strings: %s%n", Arrays.asList(strings));
	    
	    // to uppercase
	    System.out.printf("strings in uppercase: %s%n", 
	    Arrays.stream(strings)
	          .map(String::toUpperCase)
	          .collect(Collectors.toList()));
	    
	    // strings less than "n" (case insens) sorted ascending
	    System.out.printf("strings less than n sorted ascend: %s%n", 
	    		Arrays.stream(strings)
	    		      .filter(s->s.compareToIgnoreCase("n")<0)
	    		      .sorted(String.CASE_INSENSITIVE_ORDER)
	    		      .collect(Collectors.toList()));
	    
	 // strings less than "n" (case insens) sorted descending
	    System.out.printf("strings less than n sorted descend: %s%n", 
	    		Arrays.stream(strings)
	    		      .filter(s->s.compareToIgnoreCase("n")<0)
	    		      .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
	    		      .collect(Collectors.toList()));
	          
	}

}
