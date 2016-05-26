
package oddoreven;

import java.util.Scanner;
public class OddorEven {

    public static void main(String[] args) {
      Scanner kybrd = new Scanner(System.in);
      System.out.print("Please Enter Number: ");
      int entry = kybrd.nextInt();
      kybrd.nextLine();
     if (entry == 0){
          System.out.print("\nPlease Enter a Positive Number\n\n");}
     else if (entry % 2 == 0){
         System.out.printf("\n%d is an even number\n\n",entry);}
     else{
        System.out.printf("\n%d is an odd number\n\n",entry);}
      }
      
}
    

