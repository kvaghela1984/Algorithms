package org.algorithms.examples.misc;

public class SumClosestToZero {

	public static void main(String[] args) {
		int[] array = {3, 5, -9, -4, 17, 11};
		int number1 = array[0];
		int number2 = array[1];
		int lowestpositivesum = Math.abs(number1 + number2);
		
		for (int i=0;i< array.length;i++){
			for (int j=0; j< array.length;j++){
				if (Math.abs(array[i] + array[j] ) < lowestpositivesum  && j!= i){
					number1 = array[i];
					number2 = array[j];
					lowestpositivesum = Math.abs(array[i] + array[j] );
				}
			}
		}
		System.out.println("numbers are " + number1 + "and" + number2);

	}

}
