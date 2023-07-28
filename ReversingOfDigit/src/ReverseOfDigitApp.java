import java.util.Scanner;

public class ReverseOfDigitApp {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check the reverse of it");
		
		int n = sc.nextInt();
		ReverseOfDigit reverse = new ReverseOfDigit();
		int result = reverse.checkReverseOfDigit(n);
		
		if(result == n) {
			System.out.println("THE NUMBER "+n+" REVERSIBLE FORM IS "+result);
			System.out.println("THE NUMBER IS PALINDROME");
		}
		else {
			System.out.println("THE NUMBER "+n+" REVERSIBLE FORM IS "+result);
			System.out.println("THE NUMBER IS NOT PALINDROME");
		}
//		sc.close();
	}
}
