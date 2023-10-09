import java.lang.Math;

public class Circle extends Shape{
	
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	void calculateArea() {
		System.out.println("Area of Circle: "+(double)(Math.PI*radius));
	}
}
