package org.algorithms.examples.datastructures;

public class MinPQTest {

	public static void main(String[] args) throws Exception {

		MinPriorityQueue queue = new MinPriorityQueue();

		queue.heapInsert(1);
		queue.heapInsert(6);
		queue.heapInsert(2);
		queue.heapInsert(9);
		queue.heapInsert(4);
		queue.heapInsert(3);
		queue.heapInsert(8);
		queue.heapInsert(5);
		queue.heapInsert(7);
		queue.print();
		System.out.println("Min Element in the Priority Queue: " + queue.heapExtractMinimun());
		System.out.println("Min Element in the Priority Queue: " + queue.heapExtractMinimun());
		System.out.println("Min Element in the Priority Queue: " + queue.heapExtractMinimun());
		queue.heapInsert(1);
		System.out.println("Min Element in the Priority Queue: " + queue.heapExtractMinimun());
		System.out.println("Min Element in the Priority Queue: " + queue.heapExtractMinimun());
		System.out.println("Min Element in the Priority Queue: " + queue.heapExtractMinimun());
		System.out.println("Min Element in the Priority Queue: " + queue.heapExtractMinimun());
		System.out.println("Min Element in the Priority Queue: " + queue.heapExtractMinimun());

	}

}
