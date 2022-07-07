package ui;

public class StringMisc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "hello there";
		char[] charArray = new char[5];
		
		System.out.printf("s1: %s%n", s1);
		
		System.out.printf("length of s1: %d%n", s1.length());
		
		System.out.println("string reversed is:");
		
		for(int i = s1.length()-1;i>=0;i--) {
			System.out.printf("%c ", s1.charAt(i));
		}
		
		//copy to charArray
		
		s1.getChars(0, 5, charArray, 0);
		
		for(char kar: charArray) {
			System.out.printf("%c ", kar);
		}

	}

}
