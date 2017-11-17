package org.algorithms.examples.misc;

import java.awt.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

public class GreyCodeneighbourTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "test";
		
		StringBuilder s1 = new StringBuilder("temp");
		
		// Grey code neighbours
		int i = 7;
		int j = i ^ ((i & -i) << 1);
		int k = i ^ 1;
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toBinaryString(-i));
		System.out.println(Integer.toBinaryString(i & -i));
		System.out.println(Integer.toBinaryString((i & -i) << 1));
		System.out.println(Integer.toBinaryString(j));
		//System.out.println(Integer.toHexString(i));
		//s1.reverse();
		System.out.println( j);
		System.out.println( k);
		
		//Array methods
		int[] x = {1,2,3,4,5};
		Arrays.asList();
		System.out.println(Arrays.binarySearch(x, 4));
		System.out.println(Arrays.copyOf(x, 3));
		System.out.println(Arrays.copyOfRange(x, 2, 3));
		Arrays.sort(x);
		
		System.out.println(Arrays.toString(x));
		
		Collections collections;
		//BinaryTree
		
	}

}
