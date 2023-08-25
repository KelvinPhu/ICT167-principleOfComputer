package class_practice;

public class L4Circle {
	public double radius;
	public static final double PI = 3.1416;
	
	public void setRadius (double rValue) {
		if(rValue > 0) {
			radius = rValue;
		}
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return PI * radius * radius;
	}
	
	public static double getArea(double rValue) {
		return PI * rValue * rValue;
	}
	
	public String toString() {
		return "Circle with radius = " + radius;
	}
	
	
}