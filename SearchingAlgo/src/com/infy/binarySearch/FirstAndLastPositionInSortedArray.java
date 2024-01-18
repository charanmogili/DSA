package com.infy.binarySearch;

import java.util.Arrays;

public class FirstAndLastPositionInSortedArray {

	public static void main(String[] args) {

		int[] ar= {5,7,7,7,7,8,8,10};
		int target=7;
		boolean startIndex=true;
		int[] res= {-1,-1};
		res[0]=searchForRange(ar,target,startIndex);
		if(res[0]!=-1) {
			startIndex=false;
			res[1]=searchForRange(ar, target, startIndex);
		}
		System.out.println(Arrays.toString(res));
	}

	public static int searchForRange(int[] ar, int target,boolean startIndex) {
		
		int start=0;
		int end=ar.length-1;
		int ans=-1;
		
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(target>ar[mid]) {
				start=mid+1;
			}
			else if(target<ar[mid]) {
				end=mid-1;
			}
			else {
				ans=mid;
				if(startIndex)
					end=mid-1;
				else
					start=mid+1;
			}
		}
		return ans;
	}
}
