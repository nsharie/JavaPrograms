package com.kodnest.arrays.level2;

import java.util.Scanner;

public class PrintArray {
	void printArray(int arr[]) {
		System.out.println("Forward Direction");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println("");
		System.out.println("Backward Direction");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length of Array");
		int arr[] = new int[sc.nextInt()];
		
		System.out.println("Enter "+arr.length+" Elements to store in Array");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array Contents Are....");
		PrintArray a1 = new PrintArray();
		a1.printArray(arr);
	}

}
