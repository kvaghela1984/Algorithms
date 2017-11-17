package org.algorithms.examples.misc;

public class BinaryAddition {

	public static void main(String[] args) {

		int[] input1 = { 1, 0, 1, 0, 1, 1, 0, 1 };
		int[] input2 = { 1, 1, 1, 1, 1, 0, 0, 1 };
		int[] output = add(input1, input2);
		System.out.println("result");

		for (int k : output) {
			System.out.print(k);
		}

	}

	public static int[] add(int[] input1, int[] input2) {
		int i = input1.length >= input2.length ? input1.length : input2.length;
		int[] output = new int[i + 1];
		int carry = 0;
		int sum = 0;
		int index1 = input1.length - 1;
		int index2 = input2.length - 1;

		while (i > 0) {
			sum = 0;
			sum = sum ^ carry;

			if (index1 >= 0) {
				sum = sum ^ input1[index1];
				carry = carry + input1[index1];
			}

			if (index2 >= 0) {
				sum = sum ^ input2[index2];
				carry = carry + input2[index2];
			}

			if (carry > 1) {
				carry = 1;
			} else {
				carry = 0;
			}

			output[i] = sum;
			i--;
			index1--;
			index2--;
		}

		System.out.println(i);
		output[i] = carry;
		return output;

	}

}
