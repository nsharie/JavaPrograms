import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int sum =1;
		for(int i=1;i<=n;i++) {
//			sum = sum*i;
			sum *=i;
		}
		System.out.println("Factorial of the Number is "+sum);
		sc.close();
	}

}
