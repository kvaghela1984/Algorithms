package org.algorithms.examples.misc;

public class Fibbonacci {

	public static void main(String[] args) {
		int n = 10;
		fibbonaci(n);
	}
	
	public static void fibbonaci(int n){
		int prev = 0;
		int curr = 1;
		int next = prev + curr;
		for (int i = 1; i <= n; i ++){
			next = prev + curr;
			System.out.print(curr + " ");
			prev = curr;
			curr = next;
			
			
			
		}
	}

}
