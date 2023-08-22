package com.kodnest.practiceproblems.level1;

import java.util.Scanner;

public class Solution2 {
	static boolean isValidInput(boolean inputValid, boolean inputMeetConditions) {
		if(inputValid && inputMeetConditions) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Is input is valid(true/false): ");
		boolean isValid = sc.nextBoolean();
		System.out.println("Does input meet a certain condition(true/false): ");
		boolean inputMeetConditions = sc.nextBoolean();
		boolean result = isValidInput(isValid, inputMeetConditions);
		
		if(result) {
			System.out.println("Input is Valid");
		}
		else {
			System.out.println("Input is not Valid");
		}
	}
}
