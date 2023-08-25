package lab1;
import java.util.Scanner;

public class Trunc {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double total = 0;
        boolean flag = true;
        
        System.out.println("Use an out of range entry <-100 or >100 to quit.");
        
        while(flag){
            System.out.println("Enter a number on a line:");
            
            double d = input.nextDouble();
            
            if (outOfRange(d)){
                flag = false;
            } else {
                dispTrunc("The number value is: ", d);
                total += d;
                dispTrunc("The total is: ", total);
                
                System.out.println();
                System.out.println("Next.");
            }
        }
        
        System.out.println("You quit.");
    }
    
    static boolean outOfRange(double d) {
        if(d < -100 || d > 100) {
            return true;
        }
        return false;
    }

    static void dispTrunc(String msg, double num) {
        boolean neg = (num < 0);
        double posNum = num;
        if(neg) {
            posNum = -num;
        }
        
        int whole = (int)posNum;
        int truncated = truncate(posNum);
        
        String sign="";
        if(neg) {
            sign = "-";
        }
        
        System.out.println(msg + sign + whole + " (" + truncated + ")");
    }
    
    static int truncate(double num) {
        // Multiply the number by 10 to the power of the number of decimal places required
        // and then round it to the nearest integer.
        double rounded = Math.round(num * 10) / 10.0;
        return (int)rounded;
    }
}
