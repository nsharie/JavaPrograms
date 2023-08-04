package com.kodnest.arrays.level3;

import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of Array");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter "+arr.length+" Elements to store in array");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int sum=0;
		
		for (int i : arr) {
			sum+=i;
		}
		
		System.out.println("Sum of Array Element is "+sum);
	}

}
