import java.util.Scanner;

public class StringDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch[] = new char[10];
		System.out.println("Enter the characters");
		for(int i=0;i<ch.length;i++) {
			ch[i] = sc.next().charAt(0);
		}
		
		System.out.println("Array Contents Are...");
		for (char c : ch) {
			System.out.print(c+" ");
		}
		System.out.println();
		
		char ch1[] = new char[ch.length];
		for(int i=0;i<ch1.length;i++) {
			ch1[i] = ch[i];
		}
		System.out.println("Second Array...");
		for (char c : ch1) {
			System.out.print(c+" ");
		}
		System.out.println();
		char ch2[] = new char[ch1.length];
		int j=ch1.length-1;
		for(int i=0;i<ch2.length;i++) {
			ch2[i] = ch1[j];
			j--;
		}
		System.out.println("Third Array");
		for (char c : ch2) {
			System.out.print(c+" ");
		}
	}
}
