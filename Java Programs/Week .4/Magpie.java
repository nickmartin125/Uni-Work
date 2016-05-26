
package magpie;

import java.util.Scanner;
public class Magpie {

    
    public static void main(String[] args) {
      int i=0;
      Scanner kybrd=new Scanner (System.in);
      for (i = 0; i <=6; i++){
      System.out.print("Please Enter a number between 1 and 7:");
      int input = kybrd.nextInt();
      if (input <=7){
          if (input == 1){
              System.out.println("One for Sorrow");
          }
          else if (input == 2){
              System.out.println("Two for Joy");
          }
          else if (input == 3){
              System.out.println("Three for a Girl");
          }
          else if (input == 4){
              System.out.println("Four for a Boy");
          }
          else if (input == 5){
              System.out.println("Five for Silver");
          }
          else if (input == 6){
              System.out.println("Six for Gold");
          }
          else{
              System.out.println("Seven for a Secret never to be told");
          }
      }
          else{
          System.out.println("Please Enter a number between 1 and 7");}
                  
                  }    
      }
   
}
