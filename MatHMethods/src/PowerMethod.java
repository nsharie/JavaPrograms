import java.util.Scanner;

public class PowerMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int number = sc.nextInt();
		
		int power = (int)Math.pow(number, 2);
		
		System.out.println("The square of the number "+number+" is "+power);
		sc.close();
	}
}
