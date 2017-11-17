package org.algorithms.examples.datastructures;

public class StackWith2Queues {

	private Queue q1;
	private Queue q2;

	public StackWith2Queues() {
		q1 = new Queue();
		q2 = new Queue();
	}

	public void push(int i) {
		q1.enqueue(i);
	}

	public int pop() {
		while (q1.size() > 1) {
			q2.enqueue(q1.dequeue());
		}

		Queue temp = q1;
		q1 = q2;
		q2 = temp;
		return q2.dequeue();

	}

}
