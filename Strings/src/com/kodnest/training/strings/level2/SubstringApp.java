package com.kodnest.training.strings.level2;

import java.util.Scanner;

public class SubstringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		
		Substrings string = new Substrings();
		string.substring(str);
	}

}
