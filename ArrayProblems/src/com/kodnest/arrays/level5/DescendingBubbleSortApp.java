package com.kodnest.arrays.level5;

import java.util.Scanner;

public class DescendingBubbleSortApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Length");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter "+arr.length+" Elements to be stored in Array");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array Elements after sorting in Descending Order");
		DescendingBubbleSort sort = new DescendingBubbleSort();
		sort.bubbleSort(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
