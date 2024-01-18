package com.infy.linearSearch;

import java.util.Arrays;

public class StringSearch {

	public static void main(String[] args) {
		String name="mounika";
		char target='o';

		System.out.println(search(name, target));
		System.out.println(Arrays.toString(name.toCharArray()));
	}
	
	static boolean search(String name,char target) {
		
		if(name==null) {
			return false;
		}
		
		for(int i=0;i<name.length();i++) {
			if(target==name.charAt(i)) {
				return true;
			}
		}
		return false;
	}
	
    static boolean search2(String name,char target) {
		
		if(name==null) {
			return false;
		}
		
	for (char elem : name.toCharArray()) {
		if(elem==target) {
			return true;
		}
	}
		return false;
	}
}
