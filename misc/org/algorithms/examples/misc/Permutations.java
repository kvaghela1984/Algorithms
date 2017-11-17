package org.algorithms.examples.misc;

public class Permutations {
	public static void main(String[] args) {
		String str = "1234567890";
		int n = str.length();
		Permutations permutation = new Permutations();
		permutation.permute(str, 0, n - 1);
	}

	/**
	 * permutation function
	 * 
	 * @param str
	 *            string to calculate permutation for
	 * @param begin
	 *            starting index
	 * @param end
	 *            end index
	 */
	private void permute(String str, int begin, int end) {
		if (begin == end)
			System.out.println(str);
		else {
			for (int i = begin; i <= end; i++) {
				// System.out.println("before swapping:" + str);
				str = swap(str, begin, i);
				permute(str, begin + 1, end);
				str = swap(str, begin, i);
				// System.out.println("after swapping:" + str);
			}
		}
	}

	/**
	 * Swap Characters at position
	 * 
	 * @param a
	 *            string value
	 * @param pos1
	 *            position 1
	 * @param pos2
	 *            position 2
	 * @return swapped string
	 */
	public String swap(String a, int pos1, int pos2) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[pos1];
		charArray[pos1] = charArray[pos2];
		charArray[pos2] = temp;
		return String.valueOf(charArray);
	}

}