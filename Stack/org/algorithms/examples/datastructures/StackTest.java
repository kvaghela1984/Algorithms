package org.algorithms.examples.datastructures;

public class StackTest {

	public static void main(String[] args) {
		Stack s = new Stack();
		// StackWith2Queues s = new StackWith2Queues();
		s.push(5);
		s.push(4);
		s.push(24);
		s.push(2);
		s.push(1);
		s.push(6);
		// s.print();
		Stack.sortStack(s);
		s.print();
		// System.out.println(s.pop());

	}

}
