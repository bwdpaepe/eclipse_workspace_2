package ui;

import java.util.Arrays;

public class RegexSubstitution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstString = "This sentence end in 5 stars ****";
		String secondString = "1, 2, 3, 4, 5, 6, 7, 8";
		
		System.out.printf("Original String 1: %s%n", firstString);
		//replace '*' with '^'
		firstString = firstString.replaceAll("\\*", "^");
		System.out.printf("* replaced with ^: %s%n", firstString);
		
		firstString = firstString.replaceAll("stars", "carets");
		System.out.printf("\"stars\" replaces by \"carets\": %s%n", firstString);
		
		System.out.printf("Every word replaced by \"word\": %s%n%n", firstString.replaceAll("\\w+", "word"));
		
		System.out.printf("Original String 2: %s%n", secondString);
		for(int i = 0; i < 3; i++) {
			secondString = secondString.replaceFirst("\\d", "digit");
		}
		
		System.out.printf("first 3 digits replaced by \"digit\": %s%n", secondString);
		
		System.out.print("String split at commas: ");
		String[] res = secondString.split(",\\s");
		System.out.println(Arrays.toString(res));
		

	}

}
