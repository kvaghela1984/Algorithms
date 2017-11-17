package org.algorithms.examples.datastructures;

import java.util.ArrayList;

public class MaxPriorityQueue {
	private int heapSize;
	private ArrayList<Integer> array;

	public MaxPriorityQueue() {
		array = new ArrayList<Integer>();
		heapSize = array.size();
	}

	public int heapMaximum() throws Exception {
		if (heapSize == 0) {
			throw new Exception("empty queue");
		}
		return array.get(0);
	}

	public int heapExtractMaximum() throws Exception {
		if (heapSize == 0) {
			throw new Exception("empty queue");
		}

		int max = array.get(0);

		array.set(0, array.get(heapSize - 1));
		array.remove(heapSize - 1);
		heapSize--;
		maxHeapify(array, 0);
		return max;

	}

	public void heapInsert(int i) {
		array.add(i);
		heapSize++;
		bubbleUp(heapSize - 1);

	}

	public void bubbleUp(int index) {

		int parentIndex = (index - 1) / 2;
		int temp;

		if (parentIndex < 0) {
			parentIndex = 0;
		}

		if (array.get(parentIndex) < array.get(index)) {
			temp = array.get(index);
			array.set(index, array.get(parentIndex));
			array.set(parentIndex, temp);
			bubbleUp(parentIndex);
		}

	}

	public void maxHeapify(ArrayList<Integer> array, int index) {

		int leftIndex = 2 * index + 1;
		int rightIndex = 2 * index + 2;
		int greaterIndex;
		int temp;

		if (leftIndex < heapSize && array.get(index) < array.get(leftIndex)) {
			greaterIndex = leftIndex;
		} else {
			greaterIndex = index;
		}

		if (rightIndex < heapSize && array.get(greaterIndex) < array.get(rightIndex)) {
			greaterIndex = rightIndex;
		}

		if (greaterIndex != index) {
			temp = array.get(index);
			array.set(index, array.get(greaterIndex));
			array.set(greaterIndex, temp);
			maxHeapify(array, greaterIndex);
		}

	}

}
