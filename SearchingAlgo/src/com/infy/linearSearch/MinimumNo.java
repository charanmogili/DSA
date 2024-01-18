package com.infy.linearSearch;

public class MinimumNo {

	public static void main(String[] args) {
		int [] ar= {90,23,12,6,2,67,-50};
		int max=Integer.MAX_VALUE;
		System.out.println(minimumSearch(ar,max));
	}

	public static int minimumSearch(int[] ar, int max) {
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<max) {
				max=ar[i];
			}
		}
		return max;
	}
}
