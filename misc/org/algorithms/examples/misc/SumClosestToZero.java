package org.algorithms.examples.misc;

public class SumClosestToZero {

	public static void main(String[] args) {
		int[] array = { -9, -4, 3, 4, 11 , 17 };
		int number1 = array[0];
		int number2 = array[1];
		int lowestpositivesum = Math.abs(number1 + number2);

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (Math.abs(array[i] + array[j]) < lowestpositivesum) {
					number1 = array[i];
					number2 = array[j];
					lowestpositivesum = Math.abs(array[i] + array[j]);
				}
			}
		}
		System.out.println("numbers are " + number1 + "and" + number2);
		
		SumClosestToZero obj = new SumClosestToZero();
		
		System.out.println(obj.binarySearch(array, 0, array.length - 1, 16));

	}
	
	private int binarySearch(int[] array, int start, int end, int x) {
		int midIndex = (start + end) / 2;
		
		
		if(start >= end) {
			return array[midIndex];
		}
		
		if(array[midIndex] == x) {
			return array[midIndex];
		} else if(array[midIndex] > x) {
			int temp = binarySearch(array, start , midIndex - 1, x);
			return Math.abs(x - temp) < Math.abs(x - array[midIndex])? temp: array[midIndex];
		} else {
			int temp = binarySearch(array, midIndex + 1, end , x);
			return Math.abs(x - temp) < Math.abs(x - array[midIndex])? temp: array[midIndex];
		}
		
		
	}

}
