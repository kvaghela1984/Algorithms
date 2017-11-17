package org.algorithms.examples.sorts;

public class QuickSort {

	public static void main(String[] args) {
		int[] input = { 7, 5, 1, 9, 6, 2, 10, 4, 3, 8 };

		quicksort(input, 0, input.length - 1);

		for (int k : input) {
			System.out.println(k);
		}
	}

	static int quicksortStep(int[] A, int lo, int hi) {
		int pivot = A[lo]; // Get the pivot value.
		// The numbers hi and lo mark the endpoints of a range
		// of numbers that have not yet been tested. Decrease hi
		// and increase lo until they become equal, moving numbers
		// bigger than pivot so that they lie above hi and moving
		// numbers less than the pivot so that they lie below lo.
		// When we begin, A[lo] is an available space, since it used
		// to hold the pivot.
		while (hi > lo) {
			while (hi > lo && A[hi] > pivot) {
				// Move hi down past numbers greater than pivot.
				// These numbers do not have to be moved.
				hi--;
			}
			if (hi == lo)
				break;

			// The number A[hi] is less than pivot. Move it into
			// the available space at A[lo], leaving an available
			// space at A[hi].
			A[lo] = A[hi];
			lo++;
			while (hi > lo && A[lo] < pivot) {
				// Move lo up past numbers less than pivot.
				// These numbers do not have to be moved.
				lo++;
			}
			if (hi == lo)
				break;
			// The number A[lo] is greater than pivot. Move it into
			// the available space at A[hi], leaving an available
			// space at A[lo].
			A[hi] = A[lo];
			hi--;
		} // end while
			// At this point, lo has become equal to hi, and there is
			// an available space at that position. This position lies
			// between numbers less than pivot and numbers greater than
			// pivot. Put pivot in this space and return its location.
		A[lo] = pivot;
		return lo;
	} // end QuicksortStep

	/**
	 * Apply quicksort to put the array elements between position lo and
	 * position hi into increasing order.
	 */
	static void quicksort(int[] A, int lo, int hi) {
		if (hi <= lo) {
			// The list has length one or zero. Nothing needs
			// to be done, so just return from the subroutine.
			return;
		} else {
			// Apply quicksortStep and get the new pivot position.
			// Then apply quicksort to sort the items that
			// precede the pivot and the items that follow it.
			int pivotPosition = quicksortStep(A, lo, hi);
			quicksort(A, lo, pivotPosition - 1);
			quicksort(A, pivotPosition + 1, hi);
		}
	}

}
