import java.util.Scanner;

public class Main {
	public static void calculateSumOfSeries(int n) {
		float res=0.0f;
		for(int i=1;i<=n;i++) {
			res = res + (float)1/i;
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		calculateSumOfSeries(n);
		sc.close();

	}

}
