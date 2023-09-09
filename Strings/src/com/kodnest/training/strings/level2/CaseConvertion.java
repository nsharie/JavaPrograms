package com.kodnest.training.strings.level2;

public class CaseConvertion {
	String caseConverter(String str) {
		char ch[] = str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if(Character.isLowerCase(ch[i])) {
				ch[i]=Character.toUpperCase(ch[i]);
			}
			else if(Character.isUpperCase(ch[i])){
				ch[i]=Character.toLowerCase(ch[i]);
			}
		}
		String res =new String(ch);
		return res;
	}
}
