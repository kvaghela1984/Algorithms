package org.algorithms.examples.misc;

public class ReverseString {

	public static void main(String[] args) {
		String s = "This is kamlesh vaghela here";
		StringBuilder sb = new StringBuilder();

		System.out.println(sb.append(s).reverse());
		String reverse = getReverse(s);

		System.out.println(reverse);
	}

	private static String getReverse(String s) {
		if (s.length() == 1) {
			return s;
		} else {
			return getReverse(s.substring(1)) + s.substring(0, 1);
		}
	}

}
