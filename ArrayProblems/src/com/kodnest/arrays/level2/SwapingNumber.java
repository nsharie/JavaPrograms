package com.kodnest.arrays.level2;

import java.util.Scanner;

public class SwapingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers for swapping");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int temp;
		
		System.out.println("The Numbers before Swapping");
		System.out.println("x: "+ x);
		System.out.println("y: "+ y);
		
		temp=x;
		x=y;
		y=temp;

//		using addtion operator		
//		x=x+y;
//		y=x-y;
//		x=x-y;

//		using xor gate
//		x=x^y;
//		y=x^y;
//		x=x^y;
//		
		
		System.out.println("The Number after Swapping");
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}

}
