package class_practice;
//import java.util.scanner;

public class L4CircleTest {
	public static void main (String[] args) {
		L4Circle c1 = new L4Circle();
		c1.setRadius(10);
		System.out.println(c1.getArea());
		System.out.println(c1);
		
//		example of calling static method
		
		double area = L4Circle.getArea(20);
		System.out.println(area);
		System.out.println(L4Circle.getArea(100));
	}
}
