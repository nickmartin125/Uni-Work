
package timeflies;

import java.util.Scanner; 
public class TimeFlies {

      
    public static void main(String[] args) {
       Scanner keybrd = new Scanner(System.in);
       System.out.print("Please enter your age: ");
        int userAge = keybrd.nextInt();
        System.out.println("Age before last birthday was "+(userAge-1)+",");
        System.out.println("Your current age is " + userAge +",");
        System.out.println("You will be "+ (userAge+1)+" after your next birthday.");
    }
}