package com.kodnest.arrays.level3;

import java.util.Scanner;

public class Solution4 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of Array");
		int arr[] = new int[sc.nextInt()];
		
		System.out.println("Enter "+ arr.length+" elements to store in Array");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		ReplaceNegativeValue res = new ReplaceNegativeValue();
		int res1[] = res.checkNegative(arr);
		
		System.out.println("Updated Array....");
		
		for (int i : res1) {
			System.out.print(i+" ");
		}
	}
}
