package org.algorithms.examples.misc;

public class AllSubRanges {

	public static void main(String[] args) {
		int i = 1;
		int j = 7;

		for (int start = i; start <= j; start++) {
			for (int end = start; end <= j; end++) {
				for (int k = start; k <= end; k++) {
					System.out.print(k + " ");
				}
				System.out.println();
			}
		}

	}

}
