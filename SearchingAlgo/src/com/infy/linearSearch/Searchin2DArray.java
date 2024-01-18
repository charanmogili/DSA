package com.infy.linearSearch;

import java.util.Arrays;

public class Searchin2DArray {

	public static void main(String[] args) {
		int [][] ar= {
				{23,4,1},
				{18,12,3,9},
				{78,99,34,56},
				{18,12}
		};
		int target=78;
		int[] res=search(ar, target);
		System.out.println(Arrays.toString(res));
		
		int min=Integer.MIN_VALUE;
		int max=Integer.MAX_VALUE;
		System.out.println(min);
		System.out.println(max);

	}

	static int[] search(int[][] ar, int target) {
		
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				if(ar[i][j]==target)
					return new int[] {i,j};
			}
		}
		return new int[] {-1,-1};
	}
}
