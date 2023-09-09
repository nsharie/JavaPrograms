package com.kodnest.training.strings.level2;

public class Substrings {
	String substring(String str) {
		
		for(int i=0;i<str.length();i++) {
			String temp="";
			for(int j=i;j<str.length();j++) {
				temp = temp+str.charAt(j);
				System.out.print(temp+" ");
			}
			System.out.println();
		}
		return null;
	}
}
