package com.kodnest.practiceproblems.level1;

import java.util.Scanner;

public class Solution1 {
	
	static void calculateTotalWithTax(double purchaseAmount, double taxRate) {
		double tax = purchaseAmount*taxRate;
		double totalAmount = purchaseAmount+tax;
		System.out.println("Total cost including tax: "+totalAmount);
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Purchase Amount: ");
		double purchaseAmount = sc.nextDouble();
		System.out.println("Enter tax rate (in decimal form): ");
		double taxRate = sc.nextDouble();
		
		calculateTotalWithTax(purchaseAmount, taxRate);
	}
}
