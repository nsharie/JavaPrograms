package com.kodnest.training.strings.level3;

public class Anagrams {
	void checkAnagrams(String str1, String str2) {
		StringBuilder string1 = new StringBuilder(str1);
		StringBuilder string2 = new StringBuilder(str2);

		for(int i=0;i<string1.length();i++) {
			for(int j=0;j<string2.length();j++) {
				if(string1.charAt(i)==string2.charAt(j)) {
					string2.deleteCharAt(j);
				}
			}
			if(string2.length()==0 && i<string1.length()-1)
			{
				System.out.println("Not anagram");
				return;
			}
		}
		if(string2.length()==0) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
	}
}
