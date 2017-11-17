package org.algorithms.examples.misc;

public class RoundRotationCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string1 = "abc";
		String string2 = "cab";
		
		for (int i=0;i<string1.length();i++){
			String temp = string1.substring(i, string1.length()) + string1.substring(0, i);
			System.out.println(temp);
			if (temp.equals(string2)){
				System.out.println("Strings are round rotations");
				break;
			}
		}
		
		//System.out.println("Strings are not round rotation");

	}

}
