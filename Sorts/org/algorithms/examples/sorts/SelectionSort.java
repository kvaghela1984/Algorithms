package org.algorithms.examples.sorts;

public class SelectionSort {

	public static void main(String[] args) {
		int[] input = { 31, 41, 59, 26, 42, 58 };
		int[] output = sort(input);

		System.out.println("ascending order");
		for (int k : output) {
			System.out.println(k);
		}

	}

	private static int[] sort(int[] arrayIn) {
		// in selection sort we move lowest element to left by comparing it with
		// remaining elements and swapping if required. this is in contrast to
		// bubble sort where we compare adjacent elements and bubble up maximum
		// element at end.
		if (arrayIn.length == 1) {
			return arrayIn;
		}

		for (int i = 0; i < arrayIn.length; i++) {
			int min = arrayIn[i];

			for (int j = i + 1; j < arrayIn.length; j++) {
				if (arrayIn[j] < min) {
					min = arrayIn[j];
					arrayIn[j] = arrayIn[i];
					arrayIn[i] = min;
				}

			}

		}
		return arrayIn;

	}

}
