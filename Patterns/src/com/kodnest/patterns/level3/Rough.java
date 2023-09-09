package com.kodnest.patterns.level3;

public class Rough {
	public static void main(String[] args) {
		int n=3;
		int value = 1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.printf("%02d", value++);
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n+1-i;j++) {
				System.out.printf("%02d",value++);
			}
			System.out.println();
		}
	}
}
