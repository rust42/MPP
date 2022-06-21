package Lab10.prob6;

import java.util.Random;

//Show the methods are not threadsafe.
//Then modify so that they are threadsafe.
public class Queue {
	class Node {
		Object value;
		Node next;
	}
	private Node head;
	private Node tail;
 	synchronized public void add(Object newValue) {
		Node n = new Node();
		if(head == null) head = n;
		else tail.next = n;
		tail = n;
		tail.value = newValue;
	}
	synchronized public Object remove() {
		if(head == null) return null;
		Node n = head;
		head = n.next;
		return n.value;
	}

	public static void main(String[] args) {
		Queue queue = new Queue();

		for (int i = 0; i < 10; i++) {
			createAndStartThread(queue);
			System.out.println("Number " + i);
		}
	}

	public static void createAndStartThread(Queue queue) {

		Runnable r = () -> {
			for (int i = 0; i < 1000; i++) {
				queue.add(Math.random());
			}
		};
		new Thread(r).start();
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {}
	}
}
