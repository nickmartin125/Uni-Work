package prs;

import java.util.Scanner;
public class Prs {

    
    public static void main(String[] args) {
        Scanner kybrd = new Scanner (System.in);
        int comppoints = 0;
        int userpoints = 0;
       while (comppoints < 3 && userpoints < 3){
           int comp = (int)(Math.random() * 3 + 1);
           System.out.print("Please Enter Your choice:");
           String input = kybrd.next();
           switch (input){
               case "Rock":
                   if (comp == 1){
                       System.out.println("Computer chose Rock - Draw!");}
                       else if (comp == 2){
                       System.out.println("Computer chose Paper - you Lose!");
                                comppoints++;}
                       else if (comp == 3){
                       System.out.println("Computer chose Scissors - you Win!");
                               userpoints++;
                   };
                 break;
               case "Paper":
                    if (comp == 1){ 
                       System.out.println("Computer chose Rock - you Win!");
                              userpoints++;  }
                       else if (comp == 2){
                       System.out.println("Computer chose Paper - Draw!");}
                       else if (comp == 3){
                       System.out.println("Computer chose Scissors - you lose!");
                                comppoints++;
                   };
                   break;
               case "Scissors":
                    if (comp == 1){
                       System.out.println("Computer chose Rock - you Lose!");
                                comppoints++;}
                       else if (comp == 2){
                       System.out.println("Computer chose Paper - you Win!");
                       userpoints++;}
                       else if (comp == 3){
                       System.out.println("Computer chose Scissors - Draw!");
                   };
                   break;}
       }
        System.out.printf("Computer scored: %d\n"
                         + "User Scored: %d\n",comppoints,userpoints) ;         
          
       
           }
       }



