import java.util.Scanner;

public class SumOfDigitsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to find the sum of digits");
		int n = sc.nextInt();
		int res = SumOfDigits.sumOfDigits(n);
		System.out.println(res);
		sc.close();
	}

}
