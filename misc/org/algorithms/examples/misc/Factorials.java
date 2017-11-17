package org.algorithms.examples.misc;

public class Factorials {

	public static void main(String[] args) {
		int n = 9;
		System.out.println(factorial(n));

	}

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}

	}

}
