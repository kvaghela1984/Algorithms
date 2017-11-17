package org.algorithms.examples.misc;

import java.util.Arrays;
import java.util.TreeSet;

public class FindNextSmallestNumberUsingNumberset {
	static TreeSet<Integer> numbers = new TreeSet();

	public static void main(String[] args) {
		// String string = "15945614299834759984596876123456789";
		String string = "3054321";
		System.out.println("Input  is:" + string);
		System.out.println("Result is:" + findNextBiggestNumber(string));

	}

	public static String findNextBiggestNumber(String input) {

		int[] array = new int[input.length()];

		for (int i = 0; i < input.length(); i++) {
			array[i] = Integer.valueOf(String.valueOf(input.charAt(i)));
		}
		int pivot = array.length - 2;

		if (pivot < 0) {
			return "-1";
		}
		while (array[pivot] >= array[pivot + 1]) {
			pivot--;
			if (pivot < 0) {
				return "-1";
			}
		}

		if (pivot < 0) {
			return "-1";
		}

		System.out.println("pivot:" + array[pivot]);
		// We found a position which needs to be swapped with other digit. left
		// part of the array will remain same.

		// below code will find the smallest number which is bigger than the
		// number present in pivot location and place it next to pivot.

		for (int j = pivot + 1; j < array.length; j++) {
			// System.out.println(array[j]);
			if (array[pivot + 1] > array[j] && array[j] > array[pivot]) {
				int temp = array[pivot + 1];
				array[pivot + 1] = array[j];
				array[j] = temp;
			}
		}

		System.out.println("Step 1:" + Arrays.toString(array));

		int temp = array[pivot + 1];
		array[pivot + 1] = array[pivot];
		array[pivot] = temp;

		System.out.println("Step 2:" + Arrays.toString(array));
		for (int i = pivot + 1; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		System.out.println("Step 3:" + Arrays.toString(array));
		String result = "";
		for (int i : array) {
			result = result.concat(String.valueOf(i));
		}
		return result;
	}

	public static TreeSet<Integer> permutationString(String s) {
		int n = s.length();

		char[] a = new char[n];
		for (int i = 0; i < n; i++)
			a[i] = s.charAt(i);
		return permutationArray(a, n);
	}

	private static TreeSet<Integer> permutationArray(char[] a, int n) {
		// TreeSet<Integer> numbers = new TreeSet();
		if (n == 1) {

			numbers.add(Integer.valueOf(new String(a)));

		}
		for (int i = 0; i < n; i++) {
			swap(a, i, n - 1);
			permutationArray(a, n - 1);
			swap(a, i, n - 1);
		}

		return numbers;
	}

	// swap the characters at indices i and j
	private static void swap(char[] a, int i, int j) {
		char c = a[i];
		a[i] = a[j];
		a[j] = c;
	}

}
