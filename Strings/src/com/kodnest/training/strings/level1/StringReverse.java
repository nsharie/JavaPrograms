package com.kodnest.training.strings.level1;

public class StringReverse {
	void stringReverse(String str) {
		char[] ch = str.toCharArray();
		char[] rev = new char[ch.length];
		
		int j=rev.length-1;
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i] == ' ') {
				rev[i]=ch[i];
			}
		}
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ') {
				continue;
			}
			else { 
				if(rev[j] == ' ') {
					j--;
				}
				rev[j]=ch[i];
				j--;
			}
		}
		
		String strNew = new String(rev);
		System.out.println(strNew);
	}
}
