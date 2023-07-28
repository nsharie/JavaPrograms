import java.util.Scanner;

public class DiscountCheck {
	
	public static void checkDiscount(double purchaseAmount) {
		if(purchaseAmount>100) {
			System.out.println("Discount Applicable for Amount "+purchaseAmount+"$");
		}
		
		else {
			System.out.println("Discount Not Applicable Amount "+purchaseAmount+"$");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Purchase Amount ");
		double purchaseAmount = sc.nextDouble();
		
		checkDiscount(purchaseAmount);
		sc.close();
	}

}
