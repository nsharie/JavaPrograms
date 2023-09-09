package com.kodnest.patterns.level3;

public class Solution5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f = 0;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.printf("%02d",j);
			}
			System.out.println();
		}
	}
}
