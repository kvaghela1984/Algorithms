package org.algorithms.examples.search;

public class LinearSearch {

	public static void main(String[] args) {
		int[] input = { 31, 41, 59, 26, 41, 58 };

		System.out.println(search(input, 58));

	}

	public static int search(int[] arrayIn, int key) {
		int i = 0;
		while (i < arrayIn.length && arrayIn[i] != key) {
			i++;
		}
		if (i >= arrayIn.length) {
			return -1;
		} else {
			return i;
		}

	}

}
