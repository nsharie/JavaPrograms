package com.kodnest.training.strings.level2;

import java.util.Scanner;

public class RemoveDuplicateApp {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		
		RemoveDuplicate string = new RemoveDuplicate();
		str = string.removeDuplicate(str);
		
		System.out.println("Updated String...");
		System.out.println(str);
	}

}
