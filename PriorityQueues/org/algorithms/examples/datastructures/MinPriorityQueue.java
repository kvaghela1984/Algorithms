package org.algorithms.examples.datastructures;

import java.util.ArrayList;

public class MinPriorityQueue {
	private int heapSize;
	private ArrayList<Integer> array;

	public MinPriorityQueue() {
		array = new ArrayList<Integer>();
		heapSize = array.size();
	}

	public int heapMinimum() throws Exception {
		if (heapSize == 0) {
			throw new Exception("empty queue");
		}
		return array.get(0);
	}

	public int heapExtractMinimun() throws Exception {
		if (heapSize == 0) {
			throw new Exception("empty queue");
		}

		int min = array.get(0);

		array.set(0, array.get(heapSize - 1));
		array.remove(heapSize - 1);
		heapSize--;
		bubbleDown(0);
		return min;

	}

	public void bubbleDown(int index) {

		int leftIndex = 2 * index + 1;
		int rightIndex = 2 * index + 2;
		int smallerIndex;
		int temp;

		if (leftIndex < heapSize && array.get(index) > array.get(leftIndex)) {
			smallerIndex = leftIndex;
		} else {
			smallerIndex = index;
		}

		if (rightIndex < heapSize && array.get(smallerIndex) > array.get(rightIndex)) {
			smallerIndex = rightIndex;
		}

		if (smallerIndex != index) {
			temp = array.get(index);
			array.set(index, array.get(smallerIndex));
			array.set(smallerIndex, temp);
			bubbleDown(smallerIndex);
		}

	}

	public void heapInsert(int i) {
		array.add(i);
		heapSize++;
		minHeapify(array, heapSize - 1);
	}

	public void minHeapify(ArrayList<Integer> array, int index) {

		int temp;
		int parentIndex = (index - 1) / 2;

		if (parentIndex < 0) {
			parentIndex = 0;
		}

		if (array.get(index) < array.get(parentIndex)) {
			temp = array.get(index);
			array.set(index, array.get(parentIndex));
			array.set(parentIndex, temp);
			minHeapify(array, parentIndex);
		}

	}

	public void print() {
		for (int i = 0; i < heapSize; i++) {
			System.out.println(array.get(i));
		}
	}

}
