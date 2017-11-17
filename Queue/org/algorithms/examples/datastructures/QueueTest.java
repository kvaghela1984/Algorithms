package org.algorithms.examples.datastructures;

public class QueueTest {

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(5);
		q.enqueue(4);
		q.enqueue(3);
		q.enqueue(2);
		q.enqueue(1);
		q.enqueue(0);

		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());

		QueueWith2Stacks q2 = new QueueWith2Stacks();

		q2.queue(5);
		q2.queue(4);
		q2.queue(3);
		q2.queue(2);
		q2.queue(1);
		System.out.println(q2.dequeue());
		System.out.println(q2.dequeue());
		System.out.println(q2.dequeue());
		q2.queue(0);
		System.out.println(q2.dequeue());
		System.out.println(q2.dequeue());
		System.out.println(q2.dequeue());
		System.out.println(q2.dequeue());
		// System.out.println(q.dequeue());

	}

}
