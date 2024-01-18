package com.infy.binarySearch;

public class MountainArray {

	public static void main(String[] args) {

		int[] ar= {2,5,8,12,16,22,28,35,99,99,50,25,12};
		
		int maxElem = searchMaxElem(ar);
		System.out.println("Max Element Index "+ar[maxElem]+" at "+maxElem);
	}

	public static int searchMaxElem(int[] ar) {

		int start=0;
		int end=ar.length-1;
		int mid=0;
		while(start<end) {
			mid=start+(end-start)/2;
			if(ar[mid]>ar[mid+1]) {
				end=mid;
			}
			else {
				start=mid+1;
			}
		}
		return start;
	}
}
