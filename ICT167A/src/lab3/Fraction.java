package lab3;
import java.util.Scanner;

// question 1
//class Fraction {
//	public int numerator, denominator;
//
//	public Fraction(int numerator, int denominator) {
//		this.numerator = numerator;
//		this.denominator = denominator;
//		
//		if(denominator == 0) {
//			System.out.println("cannot store denominator as 0, please input again");
//			System.exit(1);
//		}
//	}
//	
//	public void outputFraction() {
//		System.out.println(numerator + "/" + denominator);
//	}
//	
//	
//}

// question 2
class Fraction {
	public int numerator, denominator;
	
	// question 3 đổi public thành private khi khai báo là xong
	// private int numerator, denominator;

	// constructor
	public Fraction(int numerator, int denominator) {
		if(denominator == 0) {
			throw new IllegalArgumentException("cannot store denominator as 0, please input again");

		}
		
		this.numerator = numerator;
		this.denominator = denominator;
		
		if (denominator < 0) {
			numerator = -numerator;
			denominator = -denominator;
		}
	}
	
	// getter & setter
	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	// output fraction
	public void outputFraction() {
		System.out.println(numerator + "/" + denominator);
	}
	
	
}
