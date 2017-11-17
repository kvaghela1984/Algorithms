package org.algorithms.examples.misc;

public class MatrixMultiplication {

	public static void main(String[] args) {

		double[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
		double[][] b = { { 1, 2 }, { 4, 5 }, { 7, 8 } };

		double[][] f = multiply(a, b);

		for (int i = 0; i < f.length; i++) {
			for (double k : f[i]) {
				System.out.print(k + " ");
			}
			System.out.println();
		}

	}

	public static double[][] multiply(double[][] a, double[][] b) {
		int m1 = a.length; // 2
		int n1 = a[0].length; // 3
		int m2 = b.length; // 3
		int n2 = b[0].length; // 2
		if (n1 != m2)
			throw new RuntimeException("Illegal matrix dimensions.");
		double[][] c = new double[m1][n2];
		for (int i = 0; i < m1; i++) // 2 times
			for (int j = 0; j < n2; j++) // 2 times
				for (int k = 0; k < n1; k++) // 3 times
					c[i][j] += a[i][k] * b[k][j];
		return c;
	}

}
