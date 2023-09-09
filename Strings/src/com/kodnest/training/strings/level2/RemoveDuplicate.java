package com.kodnest.training.strings.level2;

public class RemoveDuplicate {
	String removeDuplicate(String str) {
//		char ch[] = str.toCharArray();
//		String res = "";
//		
//		for(int i=0;i<ch.length;i++) {
//			for(int j=i+1;j<ch.length;j++) {
//				if(ch[i] == ch[j]) {
//					ch[j]='`';
//				}
//			}
//			
//			if(ch[i]!='`') {
//				res = res+ch[i];
//			}
//		}
//		return res;

//	Another Approach
		
//		String result = "";
//		for(int i=0;i<str.length();i++) {
//			if(!result.contains(String.valueOf(str.charAt(i)))) {
//				result+=str.charAt(i);
//			}
//		}
		
		String result = "";
		for(int i=0;i<str.length();i++) {
			if(result.indexOf(str.charAt(i))==-1) {
				result+=str.charAt(i);
			}
		}
		return result;
	}
}
