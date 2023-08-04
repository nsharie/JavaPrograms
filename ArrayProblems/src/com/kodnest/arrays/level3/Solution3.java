package com.kodnest.arrays.level3;

import java.util.Scanner;

public class Solution3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
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
		
		SumOfCorrespondingValues sumValues = new SumOfCorrespondingValues();
		int[] result = sumValues.sumOfCorrespondingValuesMethod(arr1, arr2);
		
		System.out.println("Values of Sum Corresponding Values");
		
		for (int i : result) {
			System.out.print(i+" ");
		}
	}
}
