import java.util.Scanner;

public class ArmstrongNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to check the Armstrong Number");
		int n = sc.nextInt();
		
		ArmstrongNumber number = new ArmstrongNumber();
		int res = number.checkArmstrongNumber(n);
		
		if(n==res) {
			System.out.println("Armstrong Form of Entered Number "+n+" Is "+res);
			System.out.println("Entered Number "+n+" IS Armstrong Number");
		}
		else {
			System.out.println("Armstrong Form of Entered Number "+n+" Is "+res);
			System.out.println("Entered Number "+n+" IS Armstrong Number");
		}
	}

}
