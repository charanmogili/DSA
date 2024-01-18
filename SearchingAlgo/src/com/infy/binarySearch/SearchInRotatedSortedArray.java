package com.infy.binarySearch;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {

		int[] nums= {4,5,6,7,9,0,2};
		int target=2;
		
		int index = search(nums, target);
		System.out.println(index);
	}
	
	public static int search(int[] nums,int target) {
		int pivot = searchPivotElem(nums);
		
		if(pivot==-1) {
			int start=0;
			int end=nums.length-1;
			return binarySearch(nums, target, start, end);
		}
		
		if(nums[pivot]==target) {
			return pivot;
		}
		
		if(target>=nums[0]) {
			int start=0;
			int end=pivot-1;
			return binarySearch(nums, target, start, end);
		}
		return binarySearch(nums, target, pivot+1, nums.length-1);
	}
	
	public static int searchPivotElem(int[] ar) {

		int start=0;
		int end=ar.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(mid<end && ar[mid]>ar[mid+1]) {
				return mid;
			}
			if(mid>start &&  ar[mid]<ar[mid-1]) {
				return mid-1;
			}
			
			if(ar[mid]<=ar[start]) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return -1;
	}

	public static int binarySearch(int[] ar,int key,int start,int end) {
		   
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
