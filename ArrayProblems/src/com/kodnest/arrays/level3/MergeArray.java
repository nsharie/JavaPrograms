package com.kodnest.arrays.level3;

public class MergeArray {
	int [] mergeArrayMethod(int arr1[],int arr2[]) {
		int res[] = new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			res[i]=arr1[i];
		}
		int j=0;
		for(int i=arr1.length;i<res.length;i++) {
			res[i] = arr2[j];
			j++;
		}
		return res;
	}
}
