package hangman;

import java.util.Scanner;
public class HangMan {
   
    public static void print (char [] array){
    System.out.println("GameBoard:\n");        
    for (int k = 0; k< array.length; k++){
                System.out.print(array[k]);
    }
    }
public static boolean gameComplete (char [] array)
{
    for (int i = 0; i < array.length; i++){
        if (array[i]=='*'){
            return false;
        }
    }return true;
}
    
    public static void main(String[] args) {
    Scanner kybrd = new Scanner(System.in);
    int guess = 0;
    System.out.print("Player 1.\n\n"
             + "Please Enter A Word: ");
    String input = kybrd.nextLine();
    char [] charArray = input.toCharArray();
    
    System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
            + "Player 2.\n\n"
            + "Your Word To Guess:");
    char [] gameBoard = new char [charArray.length];
    for (int i = 0; i < gameBoard.length;i++)
    {
        gameBoard[i]= '*';
    }
    for (int i =0; i < charArray.length; i++)
    {
        System.out.print(" _");
    }
    System.out.println();
    char [] chosenArray = new char [27];
    do{
        guess++;
        int i = 0;  
        System.out.print("\n\nPlease Choose A Letter: ");
        String choice = kybrd.next();
        chosenArray[i]= choice.charAt(0); 
        i++;
    for (int j = 0; j < charArray.length; j++)
    {
        if (charArray[j]==choice.charAt(0) )
        {
            System.out.print("\nLetter guessed: "+choice.charAt(0)+"\n");
           gameBoard[j]= choice.charAt(0);
            print(gameBoard); 
            
        }   
      
    }
   
    }while (!gameComplete(gameBoard));
     System.out.print("\n\nCongratulations you win\n"
             + "You took "+guess+" guesses.\n\n" );
    }
}