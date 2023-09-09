package com.kodnest.training.strings.level1;

public class StringReverseCase {
	String stringReverse(String str) {
		
		str = str.toLowerCase();
		
		char arr[] = str.toCharArray();
		char revArr[] = new char[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == ' ') {
				revArr[i] = arr[i];
			}
		}
		
		int j=revArr.length-1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=' ') {
				if(revArr[j]==' ') {
					j--;
				}
				revArr[j] = arr[i];
				j--;
			}
		}
		
		str = new String(revArr);
		return str;
	}
}
