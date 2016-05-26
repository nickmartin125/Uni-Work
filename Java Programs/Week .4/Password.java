
package password;

import java.util.Scanner;
public class Password {

    
    public static void main(String[] args) {
        Scanner kybrd = new Scanner (System.in);
        String pswd = "P@ssW0rd";
        System.out.printf("Good Morning:\n"
                + "Please Enter Password:");
        
        String input = kybrd.nextLine();
        if (input.equals(pswd)){
            System.out.println("Welcome to SDDS\n");
        }
        else{
            System.out.println("Please Enter Correct Password\n");
        }
    }
    
}
