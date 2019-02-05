package org.algorithms.examples.search;

public class BinarySearchwithoutRecursion {

	public static void main(String[] args) {
		int[] input = { 31, 41, 51, 58, 71, 98 };

		System.out.println(search(input, 58));

	}

	public static int search(int[] arrayIn, int key) {
		int fromIndex = 0;
		int toIndex = arrayIn.length - 1;

		while (fromIndex <= toIndex) {
			int midIndex = (fromIndex + toIndex) / 2;
			int midElement = arrayIn[midIndex];
			if (key == midElement) {
				return midIndex;
			}
			if (key > midElement) {
				fromIndex = midIndex + 1;
			} else {
				toIndex = midIndex - 1;
			}
		}
		return -1;

	}
}
