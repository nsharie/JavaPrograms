package com.kodnest.arrays.level2;

import java.util.Scanner;
import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Length");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter "+arr.length+" Elements to store in Array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Original Array");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
		int copyArr[] =  Arrays.copyOf(arr, arr.length);
		System.out.println();
		
		System.out.println("Copy Array");
		for (int i : copyArr) {
			System.out.print(i+" ");
		}
		
	}
}
