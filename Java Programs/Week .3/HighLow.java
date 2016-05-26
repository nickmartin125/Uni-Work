package highlow;

import java.util.Scanner;
public class HighLow {

   
    public static void main(String[] args) {
     Scanner kybrd = new Scanner (System.in);
     int card1 = 0;
     int card2 = 0;
     int userInput = 0;
     System.out.println("These are your card Values: ");
     for (int i = 0; i < 3; i++){
        card1 = (int)(Math.random()*13)+1;
        
        // Math.random outputs 13 random numbers +1 moves start point to 1. 
        if (card1 == 1){
            System.out.println("Ace");}
        else if(card1 == 11){
            System.out.println("Jack");}
        else if(card1 == 12){
            System.out.println("Queen");}
        else if(card1 == 13){
            System.out.println("King");}
        else {    
            System.out.println(card1);}
        
        
        System.out.println("Please enter 1 for lower");
        System.out.println("Please enter 2 the same");
        System.out.print("Please enter 3 for higher.....");
        userInput = kybrd.nextInt();
        
         card2 = (int)(Math.random()*13)+1;
        
         if (card2 == 1){
            System.out.println("Ace");}
        else if(card2 == 11){
            System.out.println("Jack");}
        else if(card2 == 12){
            System.out.println("Queen");}
        else if(card2 == 13){
            System.out.println("King");}
        else {    
            System.out.println(card2);}
       if (userInput <= 3){
            if (userInput == 1 && (card1 > card2)){
                System.out.println("\nYou Win!!\n");}
            else if (userInput == 2 && (card1 == card2)){
                System.out.println("\nYou win!!\n");}
            else if (userInput == 3 && (card1 < card2)){
                System.out.println("\nYou Win!!\n");}
            else {
                 System.out.println("\nYou Lose!!\n");}
       }
       else{
            System.out.println("Please Enter 1,2 or 3.");}
     }           
    }   
}
        
 
