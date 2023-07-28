import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		boolean isPrime = false;
		
//		if(n==1) {
//			System.out.println("it's not a prime Number");
//		}
//		
//		boolean result = false;
//		for(int i=2;i<n;i++) {
//			if(n%i==0) {
//				result = true;
//			}
//		}
//		
//		if(result!=true) {
//			System.out.println("it's prime");
//		}
//		
//		else {
//			System.out.println("it's not a prime");
//		}
		
		if(n<2) {
			System.out.println("not prime");
		}
		
		else {
			for(int i=2;i*i<=n;i++) {
				if(n%i==0) {
					isPrime = true;
					break;
				}
			}
		}
		if(isPrime) {
			System.out.println("not prime");
		}
		else {
			System.out.println("its prime");
		}
		sc.close();
	}

}
