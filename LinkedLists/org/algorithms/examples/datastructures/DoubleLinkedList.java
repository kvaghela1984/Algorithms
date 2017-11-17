package org.algorithms.examples.datastructures;

public class DoubleLinkedList {
	Node head;// Linked list head reference
	Node tail;

	// Linked list constructor
	public DoubleLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void addLast(int data) {
		if (head == null) {
			Node node = new Node(data);
			head = node;
			tail = node;
		} else {
			Node node = new Node(data);

			node.prev = tail;
			tail.next = node;
			tail = node;
		}

	}

	public void addFirst(int data) {
		if (head == null) {
			Node node = new Node(data);
			head = node;
			tail = node;
		} else {
			Node node = new Node(data);

			node.next = head;
			head.prev = node;
			head = node;
		}

	}

	public int removeLast() throws Exception {
		if (tail == null) {
			throw new Exception("empty list");
		}

		Node lastNode = tail;

		tail = tail.prev;
		if (tail != null) {
			tail.next = null;
		} else {
			head = null;
		}

		return lastNode.data;

	}

	public int removeFirst() throws Exception {
		if (head == null) {
			throw new Exception("empty list");
		}

		Node firstNode = head;

		head = head.next;

		if (head != null) {
			head.prev = null;
		} else {
			tail = null;
		}

		return firstNode.data;

	}

	void printForward() {
		Node temp = head;
		while (temp != null) {

			System.out.println("Data = " + temp.data);
			temp = temp.next;

		}
	}

	void printBackward() {
		Node temp = tail;
		while (temp != null) {

			System.out.println("Data = " + temp.data);
			temp = temp.prev;

		}
	}

	public boolean isPresent(int i) {
		Node temp = head;
		while (temp != null && temp.data != i) {
			temp = temp.next;
		}

		return (temp == null) ? false : true;
	}

	public void remove(int i) {
		Node temp = head;
		while (temp != null) {
			if (temp.data == i) {
				if (temp.prev == null) {
					head = temp.next;
					head.prev = null;
					temp = temp.next;
				} else if (temp.next == null) {
					tail = temp.prev;
					tail.next = null;
					temp = temp.next;
				} else {
					temp.prev.next = temp.next;
					temp.next.prev = temp.prev;
					temp = temp.next;
				}

			} else {
				temp = temp.next;
			}

		}

	}

}
