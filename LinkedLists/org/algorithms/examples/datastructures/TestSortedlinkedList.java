package org.algorithms.examples.datastructures;

public class TestSortedlinkedList {

	public static void main(String[] args) {
		SortedLinkedList lst = new SortedLinkedList();

		lst.insert(5);
		lst.insert(1);
		lst.insert(7);
		lst.insert(0);
		lst.insert(9);
		lst.insert(2);
		lst.insert(14);

		lst.print();

	}

}
