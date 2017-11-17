package org.algorithms.examples.datastructures;

public class QueueWith2Stacks {

	private Stack inbox;
	private Stack outbox;

	public QueueWith2Stacks() {
		inbox = new Stack();
		outbox = new Stack();
	}

	public void queue(int item) {
		inbox.push(item);
	}

	public int dequeue() {
		if (outbox.isEmpty()) {
			while (!inbox.isEmpty()) {
				outbox.push(inbox.pop());
			}
		}
		return outbox.pop();
	}

}
