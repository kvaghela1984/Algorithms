package org.algorithms.examples.misc;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
	public static void main(String[] args) {
		String str = "1234";
		int n = str.length();
		Permutations permutation = new Permutations();
		for(String s: permutation.permute(str, 0, n - 1)) {
			System.out.println(s);
		}
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
	private List<String> permute(String str, int begin, int end) {
		ArrayList<String> list = new ArrayList<>();
		permute(str, begin, end, list);
		return list;
	
	}
	
	private void permute(String str, int begin, int end, List<String> list) {
		if (begin == end) {
			//System.out.println(str);
			list.add(str);
		}
		else {
			for (int i = begin; i <= end; i++) {
				str = swap(str, begin, i);
				permute(str, begin + 1, end, list);
				str = swap(str, begin, i);
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