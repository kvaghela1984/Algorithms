package org.algorithms.examples.sorts;

public class MergeSort {

	public static void main(String[] args) {
		int[] input = { 2, 1, 3, 6, 3, 7, 9, 4, 6, 1, 9 };
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

		int[] left = new int[arrayIn.length / 2];
		int[] right = new int[arrayIn.length - (arrayIn.length / 2)];
		int j = 0;
		for (int i = 0; i < arrayIn.length / 2; i++) {
			left[j] = arrayIn[i];
			j++;
		}
		j = 0;
		for (int i = arrayIn.length / 2; i < arrayIn.length; i++) {
			right[j] = arrayIn[i];
			j++;
		}

		return merge(sort(left), sort(right));

	}

	private static int[] merge(int[] left, int[] right) {
		int[] merged = new int[left.length + right.length];
		int k = 0;
		int i = 0;
		int j = 0;
		while (i < left.length || j < right.length) {
			if (i >= left.length) {
				merged[k] = right[j];
				k++;
				j++;
			} else if (j >= right.length) {
				merged[k] = left[i];
				k++;
				i++;
			} else if (left[i] < right[j]) {
				merged[k] = left[i];
				k++;
				i++;
			} else {
				merged[k] = right[j];
				k++;
				j++;
			}
		}
		return merged;

	}

}
