package org.algorithms.examples.sorts;

import java.util.Arrays;

public class InsertionSortWithRecursion {

	public static void main(String[] args) {
		int[] input = { 2, 1, 3, 6, 31, 7, 9, 4, 26, 10, 19 };
		int[] output = sort(input);

		System.out.println("ascending order");
		for (int k : output) {
			System.out.println(k);
		}

	}

	private static int[] sort(int[] arrayIn) {
		if (arrayIn.length == 1) {
			return arrayIn;
		}
		int[] nMinus1 = Arrays.copyOfRange(arrayIn, 0, arrayIn.length - 1);
		int nthElement = arrayIn[arrayIn.length - 1];

		return merge(sort(nMinus1), nthElement);
	}

	private static int[] merge(int[] nMinus1, int nthElement) {

		int[] merged = new int[nMinus1.length + 1];
		int j = 0;
		int i = 0;

		while (i < nMinus1.length && nMinus1[i] <= nthElement) {
			merged[j++] = nMinus1[i++];
		}

		merged[j++] = nthElement;

		while (i < nMinus1.length) {
			merged[j++] = nMinus1[i++];
		}

		return merged;

	}

}
