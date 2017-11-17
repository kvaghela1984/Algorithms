package org.algorithms.examples.datastructures;

public class LinkedList {
	Node head;

	private class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public LinkedList() {
		this.head = null;
	}

	public void insert(int data) {
		if (head == null) {
			Node node = new Node(data);
			head = node;
		} else {
			Node node = new Node(data);

			node.next = head;
			head = node;
		}

	}

	void print() {
		Node temp = head;
		while (temp != null) {

			System.out.println("Data = " + temp.data);
			temp = temp.next;

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
		Node prev = null;
		while (temp != null) {
			if (temp.data == i) {
				if (temp == head) {

					head = temp.next;
					temp = temp.next;
				} else if (temp.next == null) {

					prev.next = null;
					temp = temp.next;
				} else {
					prev.next = temp.next;

					temp = temp.next;
				}

			} else {
				prev = temp;
				temp = temp.next;
			}

		}

	}

	public static LinkedList union(LinkedList l1, LinkedList l2) {
		LinkedList unionList = new LinkedList();

		Node n1 = l1.head;
		Node n2 = l2.head;

		while (n1 != null && n2 != null) {
			if (n1.data < n2.data) {
				unionList.insert(n1.data);
				n1 = n1.next;
			} else if (n1.data > n2.data) {
				unionList.insert(n2.data);
				n2 = n2.next;
			} else {
				unionList.insert(n2.data);
				n1 = n1.next;
				n2 = n2.next;
			}
		}

		while (n1 != null) {
			unionList.insert(n1.data);
			n1 = n1.next;
		}

		while (n2 != null) {
			unionList.insert(n2.data);
			n2 = n2.next;
		}

		return unionList;

	}

	public static LinkedList interSection(LinkedList l1, LinkedList l2) {
		LinkedList interSectionList = new LinkedList();

		Node n1 = l1.head;
		Node n2 = l2.head;

		while (n1 != null && n2 != null) {
			if (n1.data < n2.data) {

				n1 = n1.next;
			} else if (n1.data > n2.data) {

				n2 = n2.next;
			} else {
				interSectionList.insert(n2.data);
				n1 = n1.next;
				n2 = n2.next;
			}
		}

		return interSectionList;

	}

}
