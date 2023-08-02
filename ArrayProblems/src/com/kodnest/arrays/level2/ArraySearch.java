package com.kodnest.arrays.level2;

import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter target value");
		int target = sc.nextInt();
		Search s1 = new Search();
		boolean res = s1.isPresent(target);
		if(res) {
			System.out.println("Target Found");
		}
		else {
			System.out.println("Not Found");
		}
	}

}
