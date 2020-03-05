package queuePackage;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {
	public static void main(String args[]) {
		BlockingQueue<String> queue = new ArrayBlockingQueue<>(2);

		System.out.println(queue.add("one"));
		System.out.println(queue.add("two"));
		System.out.println(queue);
		try {
			System.out.println(queue.add("three"));
			System.out.println(queue);
		} catch (IllegalStateException e) {
			System.out.println("Tried to add more items in the queue");
		}
	}
}
