
public class Traingle extends Shape {
	
	double length;
	double height;
	
	public Traingle(double length, double height) {
		this.height = height;
		this.length = length;
	}
	
	@Override
	void calculateArea() {
		System.out.println("Area of Traingle: "+(double)(height*length)/2);
	}
}
