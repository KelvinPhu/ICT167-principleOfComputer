package class_practice;
import java.util.*;
import java.util.Scanner;


public class if_else {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		Scanner s = new Scanner(System.in);
//		System.out.println("num1: ");
//		int num1 = s.nextInt();
//		
//		System.out.println("num2: ");
//		int num2 = s.nextInt();
//		
////		System.out.println(num1);
////		System.out.println(num2);
//		
//	
//		boolean cond = (num1 >= 90 && num2 >= 10 && num2 <= 50);
//		
//		while(true) {
//			if(cond) {
//				int total = num1 + num2;
//				System.out.println("num1 + num2 = " +total);
//			}else if(cond != true) {
//				System.out.println("your numbers does not meet the correct condition, please enter again");
//			}
//			break;
//		}
//		
//		double check  = Math.pow(num1, num2);
		
//		String name = "Kelvin and joe";
//		Scanner kb = new Scanner(name);
//		ArrayList<String> world = new ArrayList<String>();
//		
//		while(kb.hasNext()) {
//			world.add(kb.next());
//		}
//		System.out.println(world);
		
		Scanner s = new Scanner(System.in);
		ArrayList<String> schoolList = new ArrayList<>();
		String schoolName = "Murdoch University";
		
		while(s.hasNext()) {
			schoolList.add(s.next());
		}
		System.out.println(schoolList);
		
	}
}
