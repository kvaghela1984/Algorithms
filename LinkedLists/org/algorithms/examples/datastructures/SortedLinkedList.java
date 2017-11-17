package org.algorithms.examples.datastructures;

public class SortedLinkedList {
	private Node head;

	private class Node {
		int data;// Node data
		Node next;

		// Node constructor
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public SortedLinkedList() {
		head = null;
	}

	public void insert(int i) {
		Node n = new Node(i);
		if (head == null) {
			head = n;
		} else {

			if (i < head.data) {
				n.next = head;
				head = n;

			} else {
				Node temp = head;
				Node prev = null;
				while (temp != null && i > temp.data) {
					prev = temp;
					temp = temp.next;

				}

				if (prev != null) {
					prev.next = n;
				}

				if (temp == null) {
					n.next = null;
				} else {
					n.next = temp;
				}

			}

		}

	}

	public void print() {
		Node temp = head;
		while (temp != null) {

			System.out.println("Data = " + temp.data);

			temp = temp.next;

		}
	}

}
