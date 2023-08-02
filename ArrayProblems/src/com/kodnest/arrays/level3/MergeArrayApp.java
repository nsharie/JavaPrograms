package com.kodnest.arrays.level3;

import java.util.Scanner;

public class MergeArrayApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length of First Array");
		int arr1[]=new int[sc.nextInt()];
		System.out.println("Enter Length of Second Array");
		int arr2[]=new int[sc.nextInt()];
		
		System.out.println("Enter "+arr1.length+" Elements to Store in Array1");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter "+arr2.length+" Elements to Store in Array2");
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
		
		int arr3[]=new int[(arr1.length+arr2.length)];
		
		for(int i=0;i<arr1.length;i++) {
			arr3[i] = arr1[i];
		}
		int k=0;
		for(int j=arr1.length;j<arr3.length;j++) {
			arr3[j] = arr2[k];
			k++;
		}
		System.out.println("Third Array Elements Are...");
		for (int i : arr3) {
			System.out.print(i+" ");
		}
	}
}
