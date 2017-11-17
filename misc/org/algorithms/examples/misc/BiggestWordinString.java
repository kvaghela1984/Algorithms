package org.algorithms.examples.misc;

public class BiggestWordinString {

	public static void main(String[] args) {
		String s = "this is test String to test whichttttttt word is biggest. in the string";
		
		String[] split = s.split("\\W+");
		String biggestWord = null;
		int length=0;
		for (int i=0;i<split.length;i++){
			
			
			if(split[i].length()> length){
				length = split[i].length();
				biggestWord = split[i];
			}
			
		}
		
		System.out.println(biggestWord );
	}

}
