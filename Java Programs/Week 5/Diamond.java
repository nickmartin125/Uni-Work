
package diamond;

import java.util.Scanner;
public class Diamond {

    
    public static void main(String[] args) {
        Scanner kybrd = new Scanner (System.in);
        System.out.print("Please Enter Width of your Diamond (upto 120): ") ;
        int input = kybrd.nextInt();
        if (input <=120){
        for (int i = 1; i < input; i += 2) {
      for (int j = 0; j < input/2 - i / 2; j++)
        System.out.print(" ");
    
            for (int j = 0; j < i; j++)
                System.out.print("*");

      System.out.print("\n");
    }

    for (int i = input-1; i > 0; i -= 2) {
      for (int j = 0; j < input/2 - i / 2; j++)
        System.out.print(" ");

            for (int j = 0; j < i; j++)
                System.out.print("*");

      System.out.print("\n");
    }
        }
        else{
            System.out.print("Please enter a number less that 120\n");}
        }
  }

           
        
        
   
      

