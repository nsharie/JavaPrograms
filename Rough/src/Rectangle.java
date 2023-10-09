
public class Rectangle extends Shape{
	
	double length;
	double breadth;
	
	public Rectangle(double length, double breadth) {
		this.breadth = breadth;
		this.length = length;
	}
	
	@Override
	void calculateArea() {
		System.out.println("Area of Rectangle :" + (double)(length*breadth));
	}
}
