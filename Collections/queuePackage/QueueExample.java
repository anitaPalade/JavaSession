package queuePackage;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String args[]) {
		Queue<Integer> queue = new LinkedList<>();
		// Adding elements {0,1,2,3,4} to queue
		for (int i = 0; i < 5; i++) {
			queue.add(i);
		}
		// Display contents of the queue
		System.out.println("Elements of queue  are:" + queue);

		// To remove the head of the queue
		int removeHead = queue.remove();
		System.out.println("Removed element :" + removeHead);
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);

		// To view the head of the queue
		int head = queue.peek();
		System.out.println("Head of the queue: " + head);
		int element = queue.element();
		System.out.println(element);
		System.out.println(queue);

		// To view the size of the queue returns the number of elements in the queue
		int size = queue.size();
		System.out.println("Size of the queue: " + size);
	}
}
