package lab3;
import java.util.Scanner;

// question 1
//class TestFraction {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		while (true) {
//			System.out.println("enter numerator: ");
//			int numerator = sc.nextInt();
//			
//			if (numerator < 0) {
//				break;
//			}
//			
//			System.out.println("enter denominator: ");
//			int denominator = sc.nextInt();
//			
//			if (denominator < 0) {
//				System.out.println("cannot store denominator as 0, please input again");
//				continue;
//			}
//			
//			Fraction fraction = new Fraction(numerator, denominator);
//			fraction.outputFraction();
//		}
//		sc.close();
//	}
//}

// question 2
class TestFraction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("enter numerator: ");
			int numerator = sc.nextInt();
			
			if (numerator < 0) {
				break;
			}
			
			System.out.println("enter denominator: ");
			int denominator = sc.nextInt();
			
			Fraction fraction = new Fraction(numerator, denominator);
			fraction.outputFraction();
		}
		sc.close();
	}
}
