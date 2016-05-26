
package characterprint;

import java.util.Scanner;
public class CharacterPrint {
    public static void multiply (int source, String sourcea)
    {
        
        for (int i =0; i < source; i++){
        System.out.print(sourcea + (","));
        
        }
    }
    
    public static void main(String[] args) {
       Scanner kybrd = new Scanner (System.in);
       System.out.print("Please Enter A Letter: ");
       String input = kybrd.nextLine();
       System.out.print("Please Enter the amount to repeat: ");
       int amount = kybrd.nextInt();
       multiply(amount,input);
       System.out.println();
    }
    
}
