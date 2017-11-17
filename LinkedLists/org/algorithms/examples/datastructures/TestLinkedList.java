package org.algorithms.examples.datastructures;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		l1.insert(1);
		l1.insert(2);
		l1.insert(3);
		l1.insert(4);
		l1.insert(5);
		l1.insert(6);
		l1.insert(7);

		l2.insert(8);
		l2.insert(9);
		l2.insert(10);
		l2.insert(4);
		l2.insert(5);
		l2.insert(6);
		l2.insert(7);

		LinkedList intersection = LinkedList.interSection(l1, l2);
		LinkedList union = LinkedList.union(l1, l2);

		System.out.println("Intersection");
		intersection.print();
		System.out.println("Union");
		union.print();

	}

}
