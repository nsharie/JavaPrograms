package com.kodnest.arrays.level2;

import java.util.Scanner;

public class SwappingArrayIndexValues {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length of Array");
		int arr[] = new int[sc.nextInt()];
		
		System.out.println("Enter "+arr.length+" Elements to store in Array");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array Contents Before Swaping Are....");
		for (int i : arr) {
			if(i>0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		System.out.println("Enter 2 Indexes for swaping the values");
		
		int index1=sc.nextInt();
		int index2=sc.nextInt();
		int temp;
		
		temp = arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
		
		System.out.println("Array Contents After Swaping Are....");
		for (int i : arr) {
			if(i>0) {
				System.out.print(i+" ");
			}
		}
	}
}
