package com.kodnest.arrays.level3;

public class SumOfCorrespondingValues {
	int [] sumOfCorrespondingValuesMethod(int arr1[],int arr2[]) {
		int res[] = new int[arr1.length];
		for(int i=0;i<arr1.length;i++) {
			res[i] = (arr1[i]+arr2[i]);
		}
		return res;
		
	}
}
