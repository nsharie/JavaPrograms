package com.kodnest.arrays.level5;

import java.util.Scanner;

public class SelectionSortApp {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Length");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter "+arr.length+" Elements to be stored in Array");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array Elements before sorting");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
		SelectionSort sort = new SelectionSort();
		sort.selectionSort(arr);
		System.out.println();
		
		System.out.println("Array Elements After sorting");
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
