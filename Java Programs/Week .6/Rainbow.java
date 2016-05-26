package rainbow;

import java.util.Scanner;
public class Rainbow 
{

    public static void main(String[] args) 
    {
    Scanner kybrd = new Scanner (System.in);
    int choice;
    String[] rainbow =
    {"Red","Orange","Yellow","Green","Blue","Indigo","Voilet"};
    
     do{
        System.out.print("Please enter colour number: "); 
        choice = kybrd.nextInt();
        if (choice >=0 && choice <8)
        {
        System.out.println("Your Chosen colour is: " + rainbow[choice-1]);
        }       
        }
     while(choice != -1);
        System.out.print("You Ended The Program.\n\n"); 
    }
   
}
