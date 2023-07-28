import java.util.Scanner;

public class AbsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Negative Number");
		int number = sc.nextInt();
		
		System.out.println("Absolute of the number is "+Math.abs(number));
		sc.close();
	}

}
