package com.kodnest.arrays.level5;

public class DescendingBubbleSort {//0    1   2   3
	void bubbleSort(int arr[]) {  //[20, 40, 30, 10]
		for(int i=0;i<=arr.length-2;i++) { //i=0; i<=2(4-2) 
			for(int j=0;j<=arr.length-2-i;j++) {  // 0<-1, 1<-2, 2<-3, 3<-4 4<-5
				if(arr[j]<arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
