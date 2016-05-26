
package initials;

import java.util.Scanner;
public class Initials {
    public static void main(String[] args) {
        Scanner kybrd = new Scanner(System.in);
        char ini = ' ';
        System.out.print("Please Enter Your Full Name: ");
        String input = kybrd.nextLine();
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length;i++)
        {
            if (charArray[i]== ' ')
            {
               ini = charArray[i+1];
                
            }
        }
                System.out.print("Your Initials Are "+ charArray[0] + " " + ini +".\n");
           
        }
    }
    

