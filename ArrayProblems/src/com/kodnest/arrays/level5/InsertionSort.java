package com.kodnest.arrays.level5;

public class InsertionSort {
	void insertionSort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int items = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>items) {
				System.out.println(arr[j]);
				arr[j+1]=arr[j];
				System.out.println(arr[j+1]);
				j--;
			}
			arr[j+1]=items;
		}
	}
}
