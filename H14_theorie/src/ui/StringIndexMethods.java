package ui;

public class StringIndexMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String letters = "abcdefghijklmabcdefghijklm";
		
		System.out.printf("c is located at position %d%n", letters.indexOf('c'));
		
		System.out.printf("a is located at position %d%n", letters.indexOf('a',1));
		
		System.out.printf("$ is located at position %d%n", letters.indexOf('$'));
		
		System.out.printf("last c is located at position %d%n", letters.lastIndexOf('c'));
		
		System.out.printf("last a is located at position %d%n", letters.lastIndexOf('a',25));
		
		System.out.printf("last $ is located at position %d%n", letters.lastIndexOf('$'));
		
		System.out.printf("def is located at position %d%n", letters.indexOf("def"));
		
		System.out.printf("def is located at position %d%n", letters.indexOf("def",7));
		
		System.out.printf("\"hello\" is located at position %d%n", letters.indexOf("hello"));
		
		System.out.printf("last def is located at position %d%n", letters.lastIndexOf("def"));
		
		System.out.printf("last def is located at position %d%n", letters.lastIndexOf("def",25));
		
		System.out.printf("last \"hello\" is located at position %d%n", letters.lastIndexOf("hello"));
	}

}
