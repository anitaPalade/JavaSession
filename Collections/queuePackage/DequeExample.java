package queuePackage;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
	public static void main(String args[]) {
		// The Deque is related to the double-ended queue that supports addition or
		// removal of elements from either end of the data structure
		Deque<String> deque = new LinkedList<>();
		
		// adds an element at the tail of the deque
		deque.add("This");
		deque.add("is");
		deque.add("wonderful");
		System.out.println(deque);

		// adds an element at the head of the queue
		deque.addFirst("Hello");
		System.out.println(deque);

		// adds an element at the tail of the queue
		deque.addLast("isnt't it");
		System.out.println(deque);

		// adds an element at the head of the queue
		deque.push("java");
		System.out.println(deque);

		// adds an element at the tail of the queue
		deque.offer(null);
		System.out.println(deque);

		// adds an element at the head of the queue
		deque.offerFirst("Practice");
		System.out.println(deque);

		// adds an element at the tail of the queue
		deque.offerLast("Perficient");
		System.out.println(deque);

		String head1 = deque.peek();
		System.out.println(head1);

		String head2 = deque.peekFirst();
		System.out.println(head2);
		System.out.println(deque);

		String head3 = deque.peekLast();
		System.out.println(head3);

		String removeHead1 = deque.poll();
		System.out.println(removeHead1);
		System.out.println(deque);

		String removeHead2 = deque.pollFirst();
		System.out.println(removeHead2);
		System.out.println(deque);

		String removeHead3 = deque.pollLast();
		System.out.println(removeHead3);
		System.out.println(deque);

		// returns head and removes it from deque
		String popElement = deque.pop();
		System.out.println(popElement);
		System.out.println(deque);

		deque.removeFirst();
		deque.removeLast();
		System.out.println(deque);
	}
}
