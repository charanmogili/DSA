package com.infy.binarySearch;

public class binarySearch1 {

	public static void main(String[] args) {
		
		int ar[]= {-20,-5,-1,0,5,9,15,17,20};
		int key=20;
        int result = binarySearch(ar,key);
		if(result==-1) {
			System.out.println("key not found");
		}
		else 
			System.out.println("key found "+result+" index");
	}
	
	public static int binarySearch(int[] ar,int key) {
		   
		int start=0;
		int end=ar.length-1;
		
		while(start<=end) {
			int mid=start+(end-start)/2;
			 if(key>ar[mid]) {
				start=mid+1;
			}
			else if(key<ar[mid]) {
				end=mid-1;
			}
			else
				return mid;
		}
		return -1;
	}
}
