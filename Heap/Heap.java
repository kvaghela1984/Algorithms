
public class Heap {
	private static int heapSize;

	public static void main(String[] args) {

		int[] input = { 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17,
				16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		heapSize = input.length - 1;

		for (int i = input.length / 2; i >= 0; i--) {
			maxHeapify(input, i);
		}

		System.out.println("Max Heap");
		for (int k : input) {
			System.out.println(k);
		}

		for (int i = 1; i <= input.length - 1; i++) {
			minHeapify(input, i);
		}

		System.out.println("Min Heap");
		for (int k : input) {
			System.out.println(k);
		}

	}

	public static void maxHeapify(int[] array, int index) {

		int leftIndex = 2 * index + 1;
		int rightIndex = 2 * index + 2;
		int greaterIndex;
		int temp;

		if (leftIndex <= heapSize && array[index] < array[leftIndex]) {
			greaterIndex = leftIndex;
		} else {
			greaterIndex = index;
		}

		if (rightIndex <= heapSize && array[greaterIndex] < array[rightIndex]) {
			greaterIndex = rightIndex;
		}

		if (greaterIndex != index) {
			temp = array[index];
			array[index] = array[greaterIndex];
			array[greaterIndex] = temp;
			maxHeapify(array, greaterIndex);
		}

	}

	public static void minHeapify(int[] array, int index) {
		int temp;
		int parentIndex = (index - 1) / 2;

		if (array[index] < array[parentIndex]) {
			temp = array[index];
			array[index] = array[parentIndex];
			array[parentIndex] = temp;
			minHeapify(array, parentIndex);
		}

	}

}
