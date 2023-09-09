package com.kodnest.training.strings.level1;

import java.util.Scanner;

public class StringReverseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		
		StringReverse string = new StringReverse();
		string.stringReverse(str);
	}

}
