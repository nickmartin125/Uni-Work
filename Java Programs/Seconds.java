
package seconds;

import java.util.Scanner;
public class Seconds {

    public static void main(String[] args) {
        
       int minsPerHour = 60; 
       int secsPerMin = 60;
       
       Scanner keyBrd = new Scanner (System.in);
       System.out.print("Please Enter Amount of seconds:");
       
       int rawSeconds = keyBrd.nextInt();
       int seconds = rawSeconds%secsPerMin;
       int totalmins = rawSeconds/secsPerMin;
       int minutes = totalmins%minsPerHour;
       int hours = totalmins/minsPerHour;
       
       System.out.printf("\n\t %6s \t %6s \t %6s \t %s \t\n\t %6d \t %6d \t %6d \t %6d \n\n ", "Input", "Hours", "Minutes", "Seconds", rawSeconds, hours, minutes, seconds);
       
    }
    
}