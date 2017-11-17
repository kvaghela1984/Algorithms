package org.algorithms.examples.datastructures;

public class TestDoubleLinkedList {

	public static void main(String[] args) {
		DoubleLinkedList list = new DoubleLinkedList();

		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		list.addLast(4);
		list.addLast(5);
		list.addLast(7);

		System.out.println(list.isPresent(1));
		System.out.println(list.isPresent(6));
		System.out.println("forward printing");
		list.printForward();
		list.remove(7);
		System.out.println("forward printing");
		list.printForward();
		System.out.println("backward printing");
		list.printBackward();

		try {
			list.removeFirst();

			list.removeLast();

			list.removeLast();

			list.removeLast();

			// list.removeLast();

			System.out.println("forward printing");
			list.printForward();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
