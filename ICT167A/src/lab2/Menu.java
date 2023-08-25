package lab2;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		do {
			System.out.println("Menu \r\n"
					+ "1. Detail output \r\n"
					+ "2. Input 3 numbers, find the largest and smallest \r\n"
					+ "3. Input 2 numbers, display all number between \r\n"
					+ "4. Input 3 number, check if 3 numbers form the triangle \r\n"
					+ "5. Input a number, check if number is prime number \r\n"
					+ "6. Input 10 numbers, display average, highest and lowest \r\n"
					+ "7. Input a String, swaqs first and lst character");
			System.out.println("Enter choice: ");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
			case 1:
				printDetail();
				break;
			case 2:
				double x, y, z;
				System.out.println("Enter x: ");
				x = sc.nextDouble();
				System.out.println("Enter y: ");
				y = sc.nextDouble();
				System.out.println("Enter z: ");
				z = sc.nextDouble();
				
				findLargestAndSmallest(x, y, z);
				break;
			case 3:
				int m, n;
				System.out.println("Enter m: ");
				m = sc.nextInt();
				System.out.println("Enter n");
				n = sc.nextInt();
				
				displayAllNumberBetween(m, n);
				break;
			case 4:
				int a, b, c;
				System.out.println("Enter a: ");
				a = sc.nextInt();
				System.out.println("Enter b");
				b = sc.nextInt();
				System.out.println("Enter c");
				c = sc.nextInt();
				
				checkFormTriangle(a, b, c);
				break;
			case 5:
				System.out.println("enter a number: ");
				int num = sc.nextInt();
				
				checkPrimeNumber(num);
				break;
			case 6:
				checkHighestLowestAverage(sc);
				break;
			case 7:
				swaqsFirstAndLast(sc);
				break;
				default:
				break;
			}
		} while (choice != 0);
	}
	
	// option 1
	public static void printDetail() {
		System.out.println("Name: Kelvin \r\n"
				+ "Age: 20 \r\n"
				+ "School: Murdoch University");
	}
	
	// Option 2
	public static void findLargestAndSmallest(double x, double y, double z) {
		double largest = Math.floor(Math.max(x, Math.max(y, z)));
		double smallest = Math.floor(Math.min(x, Math.min(y, z)));
		
		System.out.println("Largest Number: " +largest);
		System.out.println("Smallest Number: " +smallest);
	}
	
	// option 3
	public static void displayAllNumberBetween(int m, int n) {
		int count = 0;
		int sumOdd = 0;
		
		for (int i = m+1; i < n; i++) {
			System.out.print(i+ " ");
			count++;
			
			if (i % 2 != 0) {
				sumOdd += i;
			}
			
			if (count % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("Summ of all odd number is: " +sumOdd);
	}
	
	// option 4
	public static void checkFormTriangle(int a, int b, int c) {
		if (isTriangle(a, b, c)) {
			System.out.println("The 3 numbers form Triangle");
		}else {
			System.out.println("the 3 numbers is not form triangle");
		}
	}

	private static boolean isTriangle(int a, int b, int c) {
		return (a+b)>c && (b+c)>a && (a+c)>b;
	}
	
	// option 5
	public static void checkPrimeNumber(int num) {
		if (isPrimeNumber(num)) {
			System.out.println("The number is a prime number");
		} else {
			System.out.println("The number is not a prime number");
		}
	}

	private static boolean isPrimeNumber(int num) {
		if (num <= 1) {
			return false;
		}
		
		for (int i = 2; i*i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	// option 6
	public static void checkHighestLowestAverage(Scanner sc) {
		int[] arrayNum = new int[10];
		
		int highestNumber = Integer.MIN_VALUE;
		int lowestNumber = Integer.MAX_VALUE;
		int sum = 0;
		
		System.out.println("Enter 10 number: ");
		for (int i = 0; i < arrayNum.length; i++) {
			arrayNum[i] = sc.nextInt();
			
			if (arrayNum[i] > highestNumber) {
				highestNumber = arrayNum[i];
			}
			
			if (arrayNum[i] < lowestNumber) {
				lowestNumber = arrayNum[i];
			}
			
			sum += arrayNum[i];
		}
		double Average = (double)sum / arrayNum.length;
		
		System.out.println("Highest number is: " +highestNumber);
		System.out.println("Lowest number is: " +lowestNumber);
		System.out.println("Average number: " +Average);
	}
	
	// option 7
	public static void swaqsFirstAndLast(Scanner sc) {
		System.out.println("enter a String (Max 50 characters): ");
		String str = sc.nextLine();
		
		if (str.length() > 50) {
			System.out.println("Your String too long, please enter again");
			return;
		}
		
		char firstChar = str.charAt(0);
		char lastChar = str.charAt(str.length() - 1);
		
		StringBuilder sb = new StringBuilder(str);
		sb.setCharAt(0, lastChar);
		sb.setCharAt(str.length() - 1, firstChar);
		
		System.out.println("Originale String: " +str);
		System.out.println("After swaqs String: " +sb.toString());
	}
}