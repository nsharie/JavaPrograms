import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Shape name");
		String shape = sc.nextLine();
		
		
		if(shape.equalsIgnoreCase("rectangle")) {
			System.out.println("Enter the length and breadth");
			double length = sc.nextDouble();
			double breadth = sc.nextDouble();
			
			Rectangle r = new Rectangle(length, breadth);
			
			r.calculateArea();
		}
		
		else if(shape.equalsIgnoreCase("traingle")) {
			System.out.println("Enter the length and height");
			double length = sc.nextDouble();
			double height = sc.nextDouble();
			
			Traingle t = new Traingle(length, height);
			t.calculateArea();
		}
		
		else if(shape.equalsIgnoreCase("circle")){
			System.out.println("Enter the radius");
			double radius = sc.nextDouble();
	
			Circle c = new Circle(radius);
			c.calculateArea();
		}
		
		else {
			System.out.println("Enter crt shape name");
		}
	}
}
