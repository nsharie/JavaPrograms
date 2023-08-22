package com.kodnest.arrays.level5;

import java.util.Scanner;

public class InsertionSortApp {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Length");
		int[] arr = new int[sc.nextInt()];
		System.out.println("Enter "+arr.length+" Elements to the Array");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		InsertionSort sort = new InsertionSort();
		sort.insertionSort(arr);
		
		System.out.println("Array After Sorting...");
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
