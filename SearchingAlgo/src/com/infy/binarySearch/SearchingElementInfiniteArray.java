package com.infy.binarySearch;

public class SearchingElementInfiniteArray {

	public static void main(String[] args) {

		int[] ar= {2,5,7,9,12,15,18,26,50,75,98,108,110,115,116};
		int target=75;
		
		int result=search(ar,target);
		System.out.println(result);
		
	}

	public static int search(int[] ar, int target) {

		int start=0;
		int end=1;
		
		while(target > ar[end]) {
			int temp=end+1;
			
			end=end+(end-start+1)*2;
			start=temp;
		}
		return binarySearch(ar,target,start,end);
	}

	public static int binarySearch(int[] ar, int target, int start, int end) {
		
		while(start<=end) {
			int mid=start+(end-start)/2;
			 if(target>ar[mid]) {
				start=mid+1;
			}
			else if(target<ar[mid]) {
				end=mid-1;
			}
			else
				return mid;
		}
		return -1;
	}
}
