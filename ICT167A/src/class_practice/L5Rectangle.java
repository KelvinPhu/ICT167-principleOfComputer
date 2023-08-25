package class_practice;

public class L5Rectangle {
	private double length;
	private double width;

	
	public L5Rectangle(double rLength, double rWidth) {
		if(rLength > 0 && rWidth > 0) {
			length = rLength;
			width = rWidth;
		}else {
			length = width - 1;
		}
	}
	
	public void setLength(double rLength) {
		if(rLength > 0) {
			length = rLength;
		}
	}
	
	public void setWidth(double rWidth) {
		if(rWidth > 0) {
			width = rWidth;
		}
	}
	
	public double getArea() {
		return length * width;
	}
	
	public String toString() {
		return "rectangle: " + length + "x" + width;
	}
	
	public static void main(String[] args) {
		L5Rectangle r1 = new L5Rectangle(20, 10);
		System.out.println(r1);
		r1.setLength(20);
		r1.setWidth(10);
		System.out.println(r1);
		L5Rectangle r2 = new L5Rectangle(5, 3);
//		r2.setLength(5);
//		r2.setWidth(2);
		System.out.println(r2);
	}
}
