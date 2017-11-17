package org.algorithms.examples.sorts;

public class InsertionSort {

	public static void main(String[] args) {
		int[] input = { 31, 41, 59, 26, 41, 58 };
		int[] output = sort(input);

		System.out.println("ascending order");
		for (int k : output) {
			System.out.println(k);
		}

		output = reverseSort(input);

		System.out.println("descending order");
		for (int k : output) {
			System.out.println(k);
		}

	}

	private static int[] reverseSort(int[] arrayIn) {

		if (arrayIn.length == 1) {
			return arrayIn;
		}

		for (int j = 1; j < arrayIn.length; j++) { // start from 2nd element
													// till last element of an
													// array
			int i = j - 1;
			int temp = arrayIn[j]; // store item being evaluated in temp
			while (i >= 0 && arrayIn[i] < temp) { // compare item being
													// evaluated with all the
													// items in left

				arrayIn[i + 1] = arrayIn[i]; // shift elements to right as new
												// item is less than existing
												// item
				i--;
			}

			arrayIn[i + 1] = temp; // position of new item is fixed
		}
		return arrayIn;

	}

	private static int[] sort(int[] arrayIn) {

		if (arrayIn.length == 1) {
			return arrayIn;
		}

		for (int j = 1; j < arrayIn.length; j++) { // start from 2nd element
													// till last element of an
													// array
			int i = j - 1;
			int temp = arrayIn[j]; // store item being evaluated in temp
			while (i >= 0 && arrayIn[i] > temp) { // compare item being
													// evaluated with all the
													// items in left

				arrayIn[i + 1] = arrayIn[i]; // shift elements to right as new
												// item is less than existing
												// item
				i--;
			}

			arrayIn[i + 1] = temp; // position of new item is fixed
		}
		return arrayIn;

	}

}
