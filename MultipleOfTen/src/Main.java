import java.util.Scanner;

public class Main {
	public static void checkMultipleOfTen(int n) {
		if(n%10==0) {
			System.out.println("The Number "+n+" is multiple of '10' ");
		}
		else {
			System.out.println("The Number "+n+" is not a multiple of '10' ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		checkMultipleOfTen(n);
		sc.close();
	}
}
