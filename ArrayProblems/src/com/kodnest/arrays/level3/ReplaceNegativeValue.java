package com.kodnest.arrays.level3;

public class ReplaceNegativeValue {
	int[] checkNegative(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				arr[i] = 0;
			}
		}
		return arr;
	}
}
