package com.kodnest.training.strings.level3;

import java.util.Scanner;

public class FrequencyStringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		
		FrequencyString string = new FrequencyString();
		string.frequencyOfString(str);
	}

}
