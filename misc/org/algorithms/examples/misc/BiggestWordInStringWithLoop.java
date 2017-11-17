package org.algorithms.examples.misc;

public class BiggestWordInStringWithLoop {

	public static void main(String[] args) {
		String s = "this is test String to test which word is biggest. in the string";
		int len = s.length();
		int runner = 1;
		int startPos = 0;
		String longestWord = null;
		int maxWordLength = 0;
		String currentWord = null;

		while (runner < s.length()) {
			while (runner < len && s.charAt(runner) != ' ') {
				runner++;
			}

			currentWord = s.substring(startPos, runner);

			if (currentWord.length() > maxWordLength) {
				longestWord = currentWord;
				maxWordLength = currentWord.length();
			}

			startPos = runner++;

		}

		System.out.println(longestWord);

	}

}
