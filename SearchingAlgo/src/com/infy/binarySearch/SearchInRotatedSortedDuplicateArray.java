package com.infy.binarySearch;

public class SearchInRotatedSortedDuplicateArray {

	public static void main(String[] args) {

		int[] nums= {2,9,10,2,2,2};
		int target=10;
		
		int index = search(nums, target);
		System.out.println(index);
	}
	
	public static int search(int[] nums,int target) {
		int pivot = searchPivotElemInDuplicateArray(nums);
		
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
	
	public static int searchPivotElemInDuplicateArray(int[] ar) {

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
			
			if(ar[mid]==ar[start] && ar[mid]==ar[end]) {
				if(ar[start]>ar[start+1]) {
					return start;
				}
				start++;
				
				if(ar[end]<ar[end-1]) {
					return end-1;
				}
				end--;
			}
			else if(ar[start]<ar[mid] || (ar[start]==ar[mid] && ar[mid]>ar[end])) {
				start=mid+1;
			}else {
				end=mid-1;
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
