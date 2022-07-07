package cui;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {
	
	public static int berekenQuotient(int teller, int noemer) {
		return teller / noemer;
	}
	
	private static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean blijvenHerhalenFlag = true;
		do {
			try {
				System.out.print("teller: ");
				int teller = scanner.nextInt();
				System.out.print("noemer: ");
				int noemer = scanner.nextInt();
				int quotient = berekenQuotient(teller, noemer);
				System.out.printf("%nteller: %d, noemer: %d, quotient: %d", teller, noemer, quotient);
				blijvenHerhalenFlag = false;
			}
			catch(InputMismatchException e) {
				System.err.printf("%nException: %s%n", e);
				scanner.nextLine();
				System.out.println("you must enter integers, please try again");
			}
			catch(ArithmeticException e) {
				System.err.printf("%nException: %s%n", e);
				System.out.println("zero is invalid, please again");
			}
			catch(Exception e) {
				System.err.printf("%nException: %s%n", e);
			}
			
		}while(blijvenHerhalenFlag);
	}
	
	

}
