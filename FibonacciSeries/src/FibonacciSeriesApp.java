import java.util.Scanner;

public class FibonacciSeriesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range for the fibonacci series");
		int n = sc.nextInt();
		String res = FibonacciSeries.findFibonacciSeries(n);
		System.out.println(res);
		sc.close();
	}

}
