package lab4;


//question 1
//public class Fraction {
//	public int numerator, denominator;
//	
//	// constructor
//	public Fraction(int numerator, int denominator) {
//		this.numerator = numerator;
//		this.denominator = denominator;
//		
//	}
//	
//	// getter & setter
//	public int getNumerator() {
//		return numerator;
//	}
//
//	public void setNumerator(int numerator) {
//		this.numerator = numerator;
//	}
//
//	public int getDenominator() {
//		return denominator;
//	}
//
//	public void setDenominator(int denominator) {
//		this.denominator = denominator;
//	}
//
//	// method add
//	public Fraction add(Fraction other) {
//		int newNumerator = (this.numerator * other.denominator) + (other.numerator * this.denominator);
//		int newDenominator = this.denominator * other.denominator;
//		
//		return new Fraction(newNumerator, newDenominator);
//		
//	}
//	
//	
//	// output fraction
//	public void outputFraction() {
//		System.out.println(numerator + "/" + denominator);
//	}
//}

//question 2
public class Fraction {
	public int numerator, denominator;
	
	// constructor
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		
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

	// method add
	public Fraction add(Fraction other) {
		int newNumerator = (this.numerator * other.denominator) + (other.numerator * this.denominator);
		int newDenominator = this.denominator * other.denominator;
		
		return new Fraction(newNumerator, newDenominator);
		
	}
	
	// output fraction
		public void outputFraction() {
			System.out.println(numerator + "/" + denominator);
		}
	
	// simplify
	private void simplify() {
		// math.abs - hàm tính giá trị tuyệt đối, trà về dương bất kề số nhập vào là âm hay dương
		int commonDivisor = gcd(Math.abs(numerator), Math.abs(denominator));
		numerator /= commonDivisor;
		denominator /= commonDivisor;
		
		if (denominator < 0) {
			this.numerator = numerator;
			this.denominator = denominator;
		}
	}

	private int gcd(int n1, int n2) {
		int c;
		while(n1 != 0 && n2 != 0) {
			c = n2;
			n2 = n2 % n1;
			n1 = c;
		}
		return n1 + n2;
	}
}

//question 3

