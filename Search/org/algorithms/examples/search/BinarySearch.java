package org.algorithms.examples.search;

public class BinarySearch {

	public static void main(String[] args) {
		int[] input = { 31, 41, 51, 58, 71, 98 };

		System.out.println(search(input, 0, input.length - 1, 51));

	}

	public static int search(int[] arrayIn, int fromIndex, int toIndex, int key) {
		if (fromIndex >= toIndex) {
			if (arrayIn[fromIndex] == key) {
				return fromIndex;
			} else {
				return -1;
			}
		}

		int midIndex = (fromIndex + toIndex) / 2;
		int midElement = arrayIn[midIndex];

		if (key > midElement) {
			return search(arrayIn, midIndex + 1, toIndex, key);
		} else if (key < midElement) {
			return search(arrayIn, fromIndex, midIndex - 1, key);
		} else {
			return midIndex;
		}

	}

}
