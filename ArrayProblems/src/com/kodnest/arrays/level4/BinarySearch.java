package com.kodnest.arrays.level4;

public class BinarySearch {
	int BinarySearchMethod(int arr[], int key,int low, int high) {
	
		while(low<=high) {
			int mid = (low+high)/2;

			if(key == arr[mid]) {
				return mid;
			}
			else if(key > arr[mid]) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		
		return -1;
	}
}
