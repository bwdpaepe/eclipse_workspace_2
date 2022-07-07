package ui;

public class StringBuilderInsertDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object objectRef = "hello";
		String string = "goodbye";
		char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
		boolean booleanValue = true;
		char characterValue = 'Z';
		int integerValue= 7;
		long longValue = 100000000L;
		float floatValue = 2.5f;
		double doubleValue = 33.333;
		StringBuilder buffer = new StringBuilder();
		
		buffer.insert(0, objectRef);
		buffer.insert(0, "  ");
		buffer.insert(0, string);
		buffer.insert(0, "  ");
		buffer.insert(0, charArray);
		buffer.insert(0, "  ");
		buffer.insert(0, charArray, 3, 3);
		buffer.insert(0, "  ");
		buffer.insert(0, booleanValue);
		buffer.insert(0, "  ");
		buffer.insert(0, characterValue);
		buffer.insert(0, "  ");
		buffer.insert(0, integerValue);
		buffer.insert(0, "  ");
		buffer.insert(0, longValue);
		buffer.insert(0, "  ");
		buffer.insert(0, floatValue);
		buffer.insert(0, "  ");
		buffer.insert(0, doubleValue);
		
		System.out.printf("buffer contains%n%s%n", buffer.toString());
		
		buffer.deleteCharAt(10);
		buffer.delete(2, 6);
		
		System.out.printf("buffer after delete%n%s%n", buffer.toString());
		
	}

}
