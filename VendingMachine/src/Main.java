import java.util.Scanner;

public class Main {
	
	public static void getProduct(String productCode) {
		switch (productCode) {
		case "P01": 
			System.out.println("COCA-COLA");
			break;
		case "P02":
			System.out.println("THUMS-UP");
			break;
		case "P03":
			System.out.println("AMUL-LASSI");
			break;
		case "P04":
			System.out.println("OLD-MONK");
			break;
		default:
//			throw new IllegalArgumentException("Unexpected value: " + productCode);
			System.out.println("I THINK YOU ARE DRUNK, ENTER CORRECT OPTION....");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Options");
		String productCode = sc.next();
		getProduct(productCode);
		sc.close();
	}

}
