package ui;

public class StringBuilderCapLen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder buffer = new StringBuilder("Hello, how are you?");
		
		System.out.printf("buffer = %s%nlength = %d%ncapacity = %d%n%n", 
				buffer.toString(),buffer.length(),buffer.capacity());
		
		buffer.ensureCapacity(75);
		System.out.printf("new capacity: %d%n", buffer.capacity());
		
		buffer.setLength(10);
		System.out.printf("new length: %d%nbuffer = %s%n", buffer.length(), buffer.toString());

	}

}
