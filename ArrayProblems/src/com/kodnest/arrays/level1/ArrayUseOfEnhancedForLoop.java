package com.kodnest.arrays.level1;

import java.util.Scanner;

public class ArrayUseOfEnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int [] arr = new int[sc.nextInt()];
		
		System.out.println("Enter the contents to be stored in the array");
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array Contents Are...");
		
		for(int i:arr) {
			System.out.print((i+5)+" ");
		}
	}

}
