package lab4;
import java.util.ArrayList;
import java.util.Scanner;

//question 3
public class TestFraction2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Fraction> fraction = new ArrayList<Fraction>();

		while (true) {
			System.out.println("enter fraction: ");
			String frac = sc.nextLine();
			
			if (frac.equals(0)) {
				break;
			}
			
			String[] fracPart = frac.split("/");
			int numerator = Integer.parseInt(fracPart[0]);
			int denominator = Integer.parseInt(fracPart[1]);
			
			fraction.add(new Fraction(numerator, denominator));
		}
		
		Fraction totalSum = new Fraction(0, 1);
        for (Fraction fraction2 : fraction) {
			totalSum = totalSum.add(fraction2);
		}

        System.out.println("Total Sum: " + totalSum);
		sc.close();
	}
}
