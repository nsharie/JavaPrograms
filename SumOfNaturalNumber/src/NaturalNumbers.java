import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int sum =0;
		for(int i=1;i<=n;i++) {
			sum +=i;
		}
		
		System.out.println(sum);
		sc.close();
	}

}
