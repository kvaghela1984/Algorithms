package org.algorithms.example.patterns;

public class PatternMatcher {

	public static void main(String[] args) {
		String s = "AAAAACAAAAACAAAAACAAAAAAAABA";
		String p = "AAAAAB";

		System.out.println(search(s, p));

	}

	public static int search(String str, String pattern) {
		int[] lps = lowestSuccessorPredecessor(pattern);
		int i = 0;
		int len = 0;

		while (i < str.length() && len < pattern.length()) {
			if (str.charAt(i) == pattern.charAt(len)) {
				len++;
				i++;
			} else if (len != 0) {
				len = lps[len - 1];
			} else {
				i++;
			}
		}

		if (len == pattern.length()) {
			return i - len;
		} else {
			return -1;
		}

	}

	public static int[] lowestSuccessorPredecessor(String pattern) {
		int len = 0;
		int i = 1;
		int[] lps = new int[pattern.length()];
		lps[0] = 0;

		while (i < pattern.length()) {
			if (pattern.charAt(i) == pattern.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			} else // (pat[i] != pat[len])
			{
				// This is tricky. Consider the example.
				// AAACAAAA and i = 7. The idea is similar
				// to search step.
				if (len != 0) {
					len = lps[len - 1];

					// Also, note that we do not increment
					// i here
				} else // if (len == 0)
				{
					lps[i] = len;
					i++;
				}
			}
		}
		return lps;
	}

}
