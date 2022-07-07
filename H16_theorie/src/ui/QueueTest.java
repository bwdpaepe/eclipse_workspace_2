package ui;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Double> queue = new ArrayDeque<>();
		
		queue.offer(3.2);
		printQueue(queue);
		queue.offer(9.8);
		printQueue(queue);
		queue.offer(5.4);
		printQueue(queue);
		
		System.out.print("polling from queue: ");
		
		while(queue.size() > 0) {
			System.out.printf("%.1f ", queue.peek());
			queue.poll();
		}
		
		

	}
	
	private static void printQueue(Queue<Double> queue) {
		if(queue.isEmpty()) {
			System.out.print("queue is empty\n\n");
		}
		else {
			System.out.print("queue contains: ");
			System.out.print("(bottom)  ");
			for(Double d: queue) {
				System.out.printf("%s ", d);
			}
			System.out.println();
			System.out.println();
			
		}
	}

}
