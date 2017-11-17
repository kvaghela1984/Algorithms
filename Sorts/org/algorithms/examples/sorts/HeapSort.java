package org.algorithms.examples.sorts;

public class HeapSort {
	private static int heapSize;

	public static void main(String[] args) {

		int[] input = { 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17,
				16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		sort(input);
		System.out.println("Sorted output");
		for (int k : input) {
			System.out.println(k);
		}

	}

	public static void sort(int[] array) {

		buildHeap(array);

		for (int i = heapSize; i > 0; i--) {
			int temp = array[i];
			array[i] = array[0];
			array[0] = temp;
			heapSize--;
			maxHeapify(array, 0);
		}

	}

	public static void buildHeap(int[] array) {
		heapSize = array.length - 1;
		for (int i = array.length / 2; i >= 0; i--) {
			maxHeapify(array, i);
		}
	}

	public static void maxHeapify(int[] array, int index) {

		int leftIndex = 2 * index + 1;
		int rightIndex = 2 * index + 2;
		int greaterIndex;
		int temp;

		if (leftIndex <= heapSize && array[index] < array[leftIndex]) {
			greaterIndex = leftIndex;
		} else {
			greaterIndex = index;
		}

		if (rightIndex <= heapSize && array[greaterIndex] < array[rightIndex]) {
			greaterIndex = rightIndex;
		}

		if (greaterIndex != index) {
			temp = array[index];
			array[index] = array[greaterIndex];
			array[greaterIndex] = temp;
			maxHeapify(array, greaterIndex);
		}

	}

}
