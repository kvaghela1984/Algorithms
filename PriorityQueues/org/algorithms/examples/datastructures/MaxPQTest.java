package org.algorithms.examples.datastructures;

public class MaxPQTest {

	public static void main(String[] args) throws Exception {

		MaxPriorityQueue queue = new MaxPriorityQueue();

		queue.heapInsert(1);
		queue.heapInsert(6);
		queue.heapInsert(2);
		queue.heapInsert(9);
		queue.heapInsert(4);
		queue.heapInsert(3);
		queue.heapInsert(8);

		System.out.println("Max Element in the Priority Queue: " + queue.heapExtractMaximum());
		System.out.println("Max Element in the Priority Queue: " + queue.heapExtractMaximum());
		System.out.println("Max Element in the Priority Queue: " + queue.heapExtractMaximum());
		queue.heapInsert(20);
		System.out.println("Max Element in the Priority Queue: " + queue.heapExtractMaximum());
		System.out.println("Max Element in the Priority Queue: " + queue.heapExtractMaximum());
		System.out.println("Max Element in the Priority Queue: " + queue.heapExtractMaximum());
		System.out.println("Max Element in the Priority Queue: " + queue.heapExtractMaximum());
		System.out.println("Max Element in the Priority Queue: " + queue.heapExtractMaximum());

	}

}
