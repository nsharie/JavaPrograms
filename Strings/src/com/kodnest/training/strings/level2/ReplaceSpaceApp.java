package com.kodnest.training.strings.level2;

import java.util.Scanner;

public class ReplaceSpaceApp {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		
		ReplaceSpace replace = new ReplaceSpace();
		str = replace.replaceSpace(str);
		
		System.out.println("Updated String...");
		System.out.println(str);
	}
}
