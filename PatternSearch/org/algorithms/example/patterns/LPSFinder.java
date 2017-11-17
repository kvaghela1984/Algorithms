package org.algorithms.example.patterns;

public class LPSFinder {

	public static void main(String[] args) {
		String s = "ABCDEABCCD";
		int len = 0;
		int i = 1;
		int[] lps = new int[s.length()];
		lps[0] = 0;

		while (i < s.length()) {
			if (s.charAt(i) == s.charAt(len)) {
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

		for (int x : lps) {
			System.out.print(x + " ");
		}

	}

}
