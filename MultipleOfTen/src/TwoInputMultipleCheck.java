import java.util.Scanner;

public class TwoInputMultipleCheck {	
	public static void checkMultiple(int n, int multiple) {
		if(n%multiple==0) {
			System.out.println("The Number "+n+" is multiple of "+multiple);
		}
		else {
			System.out.println("The Number "+n+" is not a multiple of "+multiple);
		}
	}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Number and its Multiple to check");
			int n = sc.nextInt();
			int multiple = sc.nextInt();
			checkMultiple(n, multiple);
			sc.close();
		}
}
