package com.infy.binarySearch;

public class FloorNo {

	public static void main(String[] args) {
		
		int ar[]= {-20,-5,-1,0,5,9,15,17,20};
		int key=-60;
        int result = findingFloorNo(ar,key);
		if(result==-1) {
			System.out.println("key not found");
		}
		else 
			System.out.println("key "+ar[result]+ " found "+result+" index");
	}
	
	public static int findingFloorNo(int[] ar,int key) {
		   
		int start=0;
		int end=ar.length-1;
		
		if(key<ar[start])
			return -1;
			
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
		return end;
	}
}
