package lab5;

import java.util.Random;
import java.util.Scanner;

public class randomNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many number you would to random and store ?");
		int num = sc.nextInt();
		
		Random random = new Random();
		int[] arrayNumber = new int[num];
		int rand = 0;
		
		for (int i = 0; i < num; i++) {
			rand = random.nextInt(999);
			arrayNumber[i] = rand;
			System.out.print(arrayNumber[i]+ " ");
			
			if ((i+1) % 5 == 0) {
				System.out.println();
			}
		}
		
		int largestNumber = arrayNumber[0];
		int smallestNumber = arrayNumber[0];
		int sum = 0;
		
		for (int i = 0; i < arrayNumber.length; i++) {
			if (arrayNumber[i] > largestNumber) {
				largestNumber = arrayNumber[i];
			}else if (arrayNumber[i] < smallestNumber) {
				smallestNumber = arrayNumber[i];
			}
			
			sum += arrayNumber[i];
		}
		
		double average = sum / arrayNumber.length;
		
		System.out.println("largest number: " +largestNumber);
		System.out.println("smallest number: " +smallestNumber);
		System.out.println("Average: " +average);
	}
}
