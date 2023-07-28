package com.kodnest.patterns.level6;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=5;i++) {
			char ch = 'A';
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}

}
