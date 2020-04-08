package queuePackage;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
	public static void main(String args[]) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

		priorityQueue.add(62);
		priorityQueue.add(13);
		priorityQueue.add(4);
		priorityQueue.add(50);
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);
		PriorityQueue<String> priorityQueue1 = new PriorityQueue<>();
		priorityQueue1.add("b");
		priorityQueue1.add("a");
		priorityQueue1.add("e");
		priorityQueue1.add("c");
		priorityQueue1.add("d");
		priorityQueue1.add("efg");
		System.out.println(priorityQueue1);

		// Returns an iterator over the elements in this queue.
		Iterator<Integer> itertaor = priorityQueue.iterator();
		while (itertaor.hasNext()) {
			System.out.println(itertaor.next());
		}

		// Returns the head of the queue but does not removes it
		int head = priorityQueue.peek();
		System.out.println("head is :" + head);
		System.out.println(priorityQueue);

		// Returns the head of the queue and removes it
		int pollHead = priorityQueue.poll();
		System.out.println(pollHead);
		System.out.println(priorityQueue);

		// Returns if the specified object is present in the queue
		System.out.println(priorityQueue.contains(33));

		// Insert a specific element into the priority queue.
		priorityQueue.offer(77);
		System.out.println(priorityQueue);

		// Clears the queue
		priorityQueue.clear();
		System.out.println(priorityQueue);

	}
}
