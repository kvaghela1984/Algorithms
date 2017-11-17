package org.algorithms.examples.datastructures;

public class Node {
	int data;// Node data
	Node next, prev, random;// Next and random reference

	// Node constructor
	public Node(int data) {
		this.data = data;
		this.next = this.random = this.prev = null;
	}
}
