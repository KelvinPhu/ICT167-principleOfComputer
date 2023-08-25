package lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class babyTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<baby> babyStore = new ArrayList<baby>();
		
		int choice = 0;
		do {
			menu();
			System.out.println("enter choice: ");
			
			
			choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
			case 1:
				System.out.println("enter name: ");
				String name = sc.nextLine();
				System.out.println("enter age: ");
				int age = sc.nextInt();
				
				inputBabyDetail(name, age, babyStore);
				break;
			case 2:
				outputBabyDetail(babyStore);
				break;
			case 3:
				calculateAverage(babyStore);
				break;
			case 4:
				System.out.println(checkTwoBabiesSame(babyStore));
				break;
			default:
				break;
			}
		} while (choice != 5);
	}
	
	public static void menu() {
		System.out.println("menu\r\n"
				+ "1. input baby detail \r\n"
				+ "2. output baby detail \r\n"
				+ "3. Calculate all babies average \r\n"
				+ "4. Check 2 babies same");
	}
	
	// option 1
	public static void inputBabyDetail(String name, int age, ArrayList<baby> babyStore) {
		baby b = new baby(name, age);
		babyStore.add(b);
		System.out.println("Baby detail have been save");
	}
	
	// option 2
	public static void outputBabyDetail(ArrayList<baby> babyStore) {
		for (int i = 0; i < babyStore.size(); i++) {
			baby b = babyStore.get(i);
			
			System.out.println("baby name: " +b.getName());
			System.out.println("Baby age: " +b.getAge());
			System.out.println("=========================");
		}
	}
	
	// option 3
	public static void calculateAverage(ArrayList<baby> babyStore) {
		int sumAge = 0;
		for (int i = 0; i < babyStore.size(); i++) {
			baby b = babyStore.get(i);
			sumAge += b.getAge();
		}
		double average = sumAge / babyStore.size();
		System.out.println("average: "+average);
	}
	
	// option 4
	public static boolean checkTwoBabiesSame(ArrayList<baby> babyStore) {
		for (int i = 0; i < babyStore.size(); i++) {
			baby b1 = babyStore.get(i);
			
			for (int j = i + 1; j < babyStore.size(); j++) {
				baby b2 = babyStore.get(j);
				
				if (b1.getName().equalsIgnoreCase(b2.getName()) && b1.getAge() == b2.getAge()) {
					return true;
				}
			}
		}
		return false;
		
	}
}
