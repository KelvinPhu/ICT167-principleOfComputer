package class_practice;
public class pointTest {
	public static void main(String[] agrv) {
		point p1 = new point();
		System.out.println(p1);
		p1.setx(10);
		p1.sety(100);
		System.out.println(p1);
		
		point p2 = new point();
		p2.setx(10);
		p2.sety(100);
		System.out.println(p1);
		System.out.println(p1 == p2);
		
		System.out.println(p1 == p2);
		System.out.println(p1.isEqual(p2));
		
		change(p2);
		System.out.println(p2);
	}
	
	public static void change(point pt) {
		double newx = pt.getx() + 100;
		double newy = pt.gety() + 100;
		pt.setx(newx);
		pt.sety(newy);
	}
}
