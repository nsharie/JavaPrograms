package com.kodnest.arrays.level5;

public class SelectionSort {
	void selectionSort(int arr[]) {
		int min;
		int pos;
		int temp;
		
		for(int i=0;i<=arr.length-2;i++) {
			min = arr[i];
			pos = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<min) {
					min=arr[j];
					pos=j;
				}
			}
			temp=arr[i];
			arr[i] = arr[pos];
			arr[pos]=temp;
		}
	}
}
