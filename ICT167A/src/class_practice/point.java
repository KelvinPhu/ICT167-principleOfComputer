package class_practice;

public class point {
	private double x;
	private double y;
	
	public boolean isEqual(point anotherPoint) {
		if(x == anotherPoint.x && y == anotherPoint.y) {
			return true;
		}else {
			return false;
		}
	}
	
	public double getx() {
		return x;
	}
	
	public double gety() {
		return y;
	}
	
	public void setx(double xValue) {
		x = xValue;
	}
	
	public void sety(double yValue) {
		x = yValue;
	}
	
	public String toString() {
		return "("+ x + "," + y +")";
	}
}