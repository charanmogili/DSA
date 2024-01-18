package com.infy.linearSearch;

public class EvenSearch {

	public static void main(String[] args) {
		int ar[]= {18,124,9,1764,98,1};
		int count =0;
		int findNumber = findNumber(ar,count);
		System.out.println(findNumber);
	}
	
	static int findNumber(int ar[],int count) {
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0) {
				count++;
			}
		}
		return count;
	}
}
