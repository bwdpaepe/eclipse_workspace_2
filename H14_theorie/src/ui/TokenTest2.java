package ui;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("enter a sentence and press enter: ");
		String sentence = input.nextLine();
		
		StringTokenizer tokens = new StringTokenizer(sentence);
		System.out.printf("number of elements: %d%nThe tokens are:%n", tokens.countTokens());
		while(tokens.hasMoreTokens()) {
			System.out.println(tokens.nextToken());
		}

	}

}
