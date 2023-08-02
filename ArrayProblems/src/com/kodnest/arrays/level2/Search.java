package com.kodnest.arrays.level2;

import java.util.Scanner;

public class Search {
	public boolean isPresent(int target) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Length");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter "+arr.length+" Elements to store in array");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return true;
			}
		}
		return false;
	}
}
