package com.kodnest.training.strings.level1;

import java.util.Scanner;

public class StringReversCaseApp {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String");
		String str = sc.nextLine();
		
		System.out.println("String After Reversed...");
		StringReverseCase string = new StringReverseCase();
		String result = string.stringReverse(str);
		System.out.println(result);
	}
}
