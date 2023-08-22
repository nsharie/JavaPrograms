package com.kodnest.arrays.level4;

import java.util.Scanner;

public class BinarySearchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Length");
		int arr[] = new int[sc.nextInt()];
		
		System.out.println("Enter "+arr.length+" Elements to store in Array");
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter Key to be found in Array");
		int key = sc.nextInt();
		int low = 0;
		int high = arr.length-1;
		
		//Binary Search Method Calling
		
		BinarySearch search = new BinarySearch();
		int res = search.BinarySearchMethod(arr, key, low, high);
		
		if(res!=0) {
			System.out.println("Key Not Found ");
		}
		else {
			System.out.println("Key Found "+res);
		}
		
	}

}
