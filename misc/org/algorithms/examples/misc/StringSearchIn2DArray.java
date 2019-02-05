package org.algorithms.examples.misc;


public class StringSearchIn2DArray {

	public static void main(String[] args) {

		char[][] array = new char[][] { 
				{ 'D', 'A', 'E', 'J', 'U', 'I', 'K', 'I', 'F' },
				{ 'E', 'F', 'J', 'K', 'N', 'W', 'H', 'L', 'G' }, 
				{ 'F', 'G', 'M', 'R', 'F', 'L', 'X', 'J', 'O' },
				{ 'H', 'U', 'O', 'I', 'E', 'D', 'N', 'D', 'W' }, 
				{ 'I', 'A', 'Q', 'K', 'M', 'P', 'D', 'Y', 'Z' },
				{ 'J', 'O', 'A', 'P', 'K', 'J', 'W', 'J', 'L' }, 
				{ 'K', 'E', 'R', 'Z', 'T', 'E', 'L', 'D', 'Y' }

		};
		
		System.out.println(wordSearch(array,"YLJYDNX"));

	}
	
	private static boolean wordSearch(char[][] array, String word) {
		
		boolean[][] visited = new boolean[array.length][array[0].length];
		for(int i=0;i< array.length;i++) {
			for(int j=0;j< array[i].length;j++) {
				if(array[i][j] == word.charAt(0)) {
					visited[i][j] = true;
					if(wordSearchAtgivenLocation(array, word, i, j, visited)) {
						return true;
					}
					visited[i][j] = false;
				}
				
			}
			
		}
		return false;
	}
	
	private static boolean wordSearchAtgivenLocation(char[][] array, String word, int row, int col, boolean[][] visited) {
		if(word.length()==1) {
			return true;
		}
		String subString = word.substring(1);
		int i,j;
		
		i= row;
		j=col - 1;
		if(j >= 0 && j < array[i].length) {
			if(array[i][j] == subString.charAt(0) && visited[i][j] == false) {
				visited[i][j] = true;
				if(wordSearchAtgivenLocation(array, subString, i, j, visited)) {
					return true;
				}
				visited[i][j] = false;
			}
		}
		
		i= row;
		j=col + 1;
		if(j >= 0 && j < array[i].length) {
			if(array[i][j] == subString.charAt(0) && visited[i][j] == false) {
				visited[i][j] = true;
				if(wordSearchAtgivenLocation(array, subString, i, j, visited)) {
					return true;
				}
				visited[i][j] = false;
			}
		}
		
		i= row - 1;
		j=col;
		if(i >= 0 && i < array.length) {
			if(array[i][j] == subString.charAt(0) && visited[i][j] == false) {
				visited[i][j] = true;
				if(wordSearchAtgivenLocation(array, subString, i, j, visited)) {
					return true;
				}
				visited[i][j] = false;
			}
		}
		
		i= row + 1;
		j=col;
		if(i >= 0 && i < array.length) {
			if(array[i][j] == subString.charAt(0) && visited[i][j] == false) {
				visited[i][j] = true;
				if(wordSearchAtgivenLocation(array, subString, i, j, visited)) {
					return true;
				}
				visited[i][j] = false;
			}
		}
		return false;
		
	}

}
