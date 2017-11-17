package org.algorithms.examples.misc;

public class FindFirstUniqueChar {
	
	
	
	public static void main(String[] args) {
	
		String string = "teetetn";
		System.out.println(findFirstUniqueChar(string));	
	}
	
	public static char findFirstUniqueChar(String string){
		int i;
		int j;
		int count;
		for( i = 0;i <= string.length()-1; i++){
			char runnerChar = string.charAt(i);
			count = 0;
			for(j = 0;j <= string.length()-1;j++){
				if(runnerChar == string.charAt(j) && (i!= j)){
					count++;
					break;
				}
				
			}
			if (count == 0){
				return runnerChar;
			}
			
		}
		
		return 0;
		
	}

}
