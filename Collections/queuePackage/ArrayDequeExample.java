package queuePackage;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
	public static void main(String args[]) {
		// Creating Deque and adding elements
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Good Morning");
		deque.add("Good Afternoon");
		deque.add("Good Evening");
		// Traversing elements
		for (String str : deque) {
			System.out.println(str);
		}
		deque.pollFirst();
		System.out.println(deque);
	}
}
