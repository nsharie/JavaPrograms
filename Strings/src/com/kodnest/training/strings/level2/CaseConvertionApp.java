package com.kodnest.training.strings.level2;

import java.util.Scanner;

class CaseConvertionApp {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		
		CaseConvertion convert = new CaseConvertion();
		str = convert.caseConverter(str);
		
		System.out.println("Updated String is...");
		System.out.println(str);
	}
}
