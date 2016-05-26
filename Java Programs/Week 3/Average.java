
package average;

import java.util.Scanner;
public class Average {

    
    public static void main(String[] args) {
       Scanner kybrd = new Scanner (System.in);
       System.out.print("Enter First Integer: ");
       int num1 = kybrd.nextInt();
       System.out.print("Enter Second Integer: ");
       int num2 = kybrd.nextInt();
       System.out.print("Enter Third Integer: ");
       int num3 = kybrd.nextInt();
       System.out.print("Enter Fourth Integer: ");
       int num4 = kybrd.nextInt();
       double ave =(double)(num1 + num2 + num3 + num4) / 4;
       System.out.println("Average is: " + ave);
    }
    
}
