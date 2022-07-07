package ui;

public class StringBuilderChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder buffer = new StringBuilder("hello there");
		System.out.printf("buffer = %s%n", buffer.toString());
		System.out.printf("character at 0: %s%ncharacter at 4: %s%n%n", 
				buffer.charAt(0), buffer.charAt(4));
		
		char[] charArray = new char[buffer.length()];
		buffer.getChars(0, buffer.length(), charArray, 0);
		System.out.print("the characters are: ");
		for(char character: charArray) {
			System.out.print(character);
		}
		
		buffer.setCharAt(0, 'H');
		buffer.setCharAt(6, 'T');
		
		System.out.printf("%n%nbuffer = %s", buffer.toString());
		
		buffer.reverse();
		System.out.printf("%n%nbuffer = %s", buffer.toString());

	}

}
