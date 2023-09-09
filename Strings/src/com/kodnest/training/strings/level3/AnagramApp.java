package com.kodnest.training.strings.level3;

import java.util.Scanner;

public class AnagramApp {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two strings");
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		Anagrams check = new Anagrams();
		check.checkAnagrams(str1, str2);
	}
}
