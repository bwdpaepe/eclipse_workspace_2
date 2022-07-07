package ui;

import java.util.Scanner;

public class StaticCharMethods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner invoer = new Scanner(System.in);
		System.out.println("enter a radix");
		int radix = invoer.nextInt();
		
		System.out.printf("choose: %n1 --%s%n2 -- %s%n", "convert digit to character", "convert character to digit");
		int choice = invoer.nextInt();
		
		switch (choice) {
		case 1: 
			System.out.println("enter digit");
			int digit = invoer.nextInt();
			System.out.printf("convert digit to character: %s%n", Character.forDigit(digit, radix));
			break;
		case 2: 
			System.out.println("enter character");
			char c = invoer.next().charAt(0);
			System.out.printf("convert character to digit: %d%n", Character.digit(c, radix));
			break;
		}

	}

}
