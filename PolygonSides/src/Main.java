import java.util.Scanner;

public class Main{
	public static void identifyPolygon(int sides) {
		switch (sides) {
		case 3: 
			System.out.println("Traingle");
			break;
		case 4:
			System.out.println("Quadrilateral");
			break;
		case 5:
			System.out.println("Pentagon");
			break;
		case 6:
			System.out.println("Hexagon");
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + sides);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of sides");
		int sides = sc.nextInt();
		identifyPolygon(sides);
		sc.close();
	}
}
