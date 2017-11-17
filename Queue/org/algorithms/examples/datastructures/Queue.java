package org.algorithms.examples.datastructures;

public class Queue {

	/**
	 * An object of type Node holds one of the items in the linked list that
	 * represents the stack.
	 */
	private class Node {
		int item;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public void enqueue(int N) {
		Node newTail; // A Node to hold the new item.
		newTail = new Node();
		size++;
		newTail.item = N;

		if (isEmpty()) {
			head = newTail;
			tail = newTail;
			newTail.next = null;
		} else {
			newTail.next = null;
			tail.next = newTail;
			tail = newTail;
		}

	}

	public int dequeue() {
		if (head == null)
			throw new IllegalStateException("Can’t dequeue from an empty queue.");
		int firstItem = head.item;
		head = head.next;
		size--;
		return firstItem;
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public int size() {
		return size;
	}
}
