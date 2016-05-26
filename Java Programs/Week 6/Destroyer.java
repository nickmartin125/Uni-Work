package destroyer;
import java.util.Scanner;
public class Destroyer {
     public static boolean isBoardFinished (String [][] sourceArray)
    {        
         for (int i = 0; i<sourceArray.length;i++)
        {
            for (int j = 0; j <sourceArray.length;j++)
            {
                if (sourceArray [i][j]== " "||sourceArray [i][j]=="D")
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void shipHit (int row , int col, String [][] sourceArray1, String [][] sourceArray2)
    {
                if (sourceArray1 [col-1][row-1] == "D")
               {
                   System.out.print("Its A Hit!!\n");
                   sourceArray1[col-1][row-1] = "H";
                   sourceArray2[col-1][row-1] = "H";
               }
                else if (sourceArray1 [col-1][row-1]=="*"){
                    System.out.print("Please Enter a different position.\n\n");
                }
               else
               {
                   System.out.print("Miss!\n");
                   sourceArray1[col-1][row-1] = "*";
                   sourceArray2[col-1][row-1] = "*";                     
               }
    }
      
    public static void printArray (String [][] sourceArray)
    {
        System.out.print("\n  1  2  3  4  5");
        for (int i = 0; i < sourceArray.length; i++)
        {
            System.out.print("\n"+(i+1));
            for (int j = 0; j < sourceArray.length; j++)
            {
                System.out.print("["+ sourceArray [j][i]+"]");
            }    
        }
        System.out.print("\n\n\n");
    }
   
    public static void main(String[] args) {
        Scanner kybrd = new Scanner (System.in);
        
        String [][] ships = 
        {
            {"M","M","M","D","M"},
            {"M","M","M","D","M"},
            {"M","M","M","M","M"},
            {"D","D","D","M","M"},
            {"M","M","M","M","D"}
        };
         String [][] gameBoard = 
        {
            {" "," "," "," "," "},
            {" "," "," "," "," "},
            {" "," "," "," "," "},
            {" "," "," "," "," "},
            {" "," "," "," "," "}
        };
        printArray(gameBoard);
        do{
        System.out.print("Please Enter Column Number: ");
        int column = kybrd.nextInt();
        System.out.print("Please Enter Row Number: ");
        int row = kybrd.nextInt();
        
        shipHit(row, column, ships, gameBoard);
        printArray(gameBoard);
        }
        while (!isBoardFinished (ships));
        System.out.print("You won!!");
    }
    }
    

