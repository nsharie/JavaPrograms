import java.util.Scanner;

public class GCDApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers to find GCD");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int res = GCD.findGCD(m,n);
		System.out.println("The GCD of "+m+" And "+n+" Is "+res);
		sc.close();
	}
}
