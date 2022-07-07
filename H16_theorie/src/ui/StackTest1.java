package ui;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class StackTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Number> stack = new ArrayDeque<>();
		Long lN = 12L;
		Integer iN = 34567;
		Float fN = 1.0F;
		Double dN = 1234.5678;
		
		stack.push(lN);
		printStack(stack);
		stack.push(iN);
		printStack(stack);
		stack.push(fN);
		printStack(stack);
		stack.push(dN);
		printStack(stack);
		
		try {
			Number removedObject = null;
			while(true) {
				removedObject = stack.pop();
				System.out.printf("%s popped%n", removedObject);
				printStack(stack);
			}
		}
		catch(NoSuchElementException e) {
			e.printStackTrace();
		}
		

	}
	
	private static void printStack(Deque<Number> stack) {
		if(stack.isEmpty()) {
			System.out.print("stack is empty\n\n");
		}
		else {
			System.out.print("stack contains: ");
			for(Number number: stack) {
				System.out.printf("%s ", number);
			}
			System.out.print("(top) \n\n");
		}
	}

}
