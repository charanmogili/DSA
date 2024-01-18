package com.infy.binarySearch;

public class SmallestGreaterCharacter {

	public static void main(String[] args) {
		
		char ar[]= {'c','e','j','l','o'};
		char key='j';
        char result = findingCeilNo(ar,key);
		System.out.println(result);
		
	}
	
	
	
	public static char findingCeilNo(char[] ar,char key) {
		   
		int start=0;
		int end=ar.length-1;
		
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(key<ar[mid]) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return ar[start % ar.length];
	}
}
