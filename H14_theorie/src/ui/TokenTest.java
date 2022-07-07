package ui;

import java.util.Scanner;

public class TokenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a sentence and press enter");
		Scanner invoer = new Scanner(System.in);
		String zin = invoer.nextLine();
		String[] woorden = zin.split(" ");
		System.out.printf("number of elements: %d%nThe tokens are:%n", woorden.length);
		for(String woord: woorden) {
			System.out.println("woord");
		}

	}

}
