package org.algorithms.examples.misc;

public class LongestPalindrome {

	public static void main(String[] args) {
		String s = "ABBAABCDCBABCSA";
		String longestPalindrome = "";
		int length=0;
		
		for(int i=0;i<s.length();i++){
			for(int j=i+1;j<s.length();j++){
				StringBuilder temp = new StringBuilder(s.substring(i, j));
				String string = temp.toString();
								
				if(temp.reverse().toString().equals(string) && string.length()!=1){
					System.out.println(string);
					if (string.length()> length){
						longestPalindrome = string;
						length = string.length();
					}
				}
			}
		}
		
		System.out.println("longest palindrom string is:" + longestPalindrome);
		
	}

}
