package com.infy.linearSearch;

public class Linear1 {

	public static void main(String[] args) {
		int[] arr= {10,8,20,14,50,12};
		int target=120;
		int res = linearSearch(arr, target);
		System.out.println(res);
	}
	
	static int linearSearch(int arr[], int target) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return Integer.MIN_VALUE;
	}
}
