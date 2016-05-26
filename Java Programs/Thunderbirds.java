
package thunderbirds;

import java.util.Scanner;
public class Thunderbirds {

    
    public static void main(String[] args) {
        Scanner kybrd = new Scanner (System.in);
        System.out.print("Please enter your favorite Thunderbird Craft: ");
        int input = kybrd.nextInt();
        switch(input){
            case '1':
                System.out.println("Thunderbird 1 Pilot is Scott Tracey.");
                break;
            case '2':
                System.out.println("Thunderbird 2 Pilot is Virgil Tracey.");
                break;
            case '3':
                System.out.println("Thunderbird 3 Pilot is Alan Tracey.");
                break;
            case '4':
                System.out.println("Thunderbird 4 Pilot is Gordon Tracey.");
                break;
            default:
                System.out.println("Do you even Thunderbirds Bro?");
            
        }
                
    }
    
}
