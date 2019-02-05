package org.algorithms.examples.search;

public class NearestElementBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NearestElementBinarySearch obj = new NearestElementBinarySearch();

		int[] array = { -9, -4, 3, 4, 11, 17 , 20 };
		System.out.println(obj.binarySearch(array, 0, array.length - 1, 19));

	}

	private int binarySearch(int[] array, int start, int end, int x) {
		int midIndex = (start + end) / 2;

		if (start >= end) {
			return array[midIndex];
		}

		if (array[midIndex] == x) {
			return array[midIndex];
		} else if (array[midIndex] > x) {
			int temp = binarySearch(array, start, midIndex - 1, x);
			return Math.abs(x - temp) < Math.abs(x - array[midIndex]) ? temp : array[midIndex];
		} else {
			int temp = binarySearch(array, midIndex + 1, end, x);
			return Math.abs(x - temp) < Math.abs(x - array[midIndex]) ? temp : array[midIndex];
		}

	}
}
