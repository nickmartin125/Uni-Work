package pair;

import java.util.Scanner;
public class Pair 
{
    public static void printArray (String[][] sourceArray)
    {
        for (int i = 0; i<sourceArray.length;i++)
        {
            for (int j = 0; j <sourceArray.length;j++)
            {
                System.out.print(sourceArray[i][j]);
            }
            
            System.out.println();
        }
    }
    
    public static boolean isBoardFinished (String [][] sourceArray)
    {        
         for (int i = 0; i<sourceArray.length;i++)
        {
            for (int j = 0; j <sourceArray.length;j++)
            {
                if (sourceArray [i][j]== "*")
                {
                    return false;
                }
            }
        }
         
         return true;
    }
    
    
    public static void main(String[] args)
    {
        Scanner kybrd = new Scanner (System.in);
        String [][] cards =
        {
            {"J","K","J","Q"},
            {"K","A","A","K"},
            {"Q","Q","K","J"},
            {"A","K","J","Q"}
        };
        String [][] grid = 
        {
            {"*","*","*","*"},
            {"*","*","*","*"},
            {"*","*","*","*"},
            {"*","*","*","*"}
        };
        
        
            
            int row = 0;
            int column  = 0;
            int row1 = 0;
            int column1 = 0;
            int [] match = new int [2];
           
                System.out.printf("Pairs Card Game\n\n"
                        + "Enter co-ordinates between 1-4 row first then column.\n\n");
              do{  
                System.out.print("Please Enter Co-ordinates for 1st card: ");
                row = kybrd.nextInt(); 
                column = kybrd.nextInt(); 
                System.out.print("Please Enter Co-ordinates for 2nd card: ");
                row1 = kybrd.nextInt(); 
                column1 = kybrd.nextInt(); 
           
               
            if (cards[row-1][column-1]=="K")
            {
                grid[row-1][column-1] = "K";
                 match [0] = 1;
            }
            else if (cards[row-1][column-1]=="Q")
            {
                grid[row-1][column-1] = "Q";
                match [0] = 2;
            }
            else if (cards[row-1][column-1]=="J")
            {
                grid[row-1][column-1] = "J";
                match [0]= 3;
            }
            else if (cards[row-1][column-1]=="A")
            {
                grid[row-1][column-1] = "A";
                match [0] = 4;
            }  if (cards[row1-1][column1-1]=="K")
            {
                grid[row1-1][column1-1] = "K";
                 match [1] = 1;
            }
            else if (cards[row1-1][column1-1]=="Q")
            {
                grid[row1-1][column1-1] = "Q";
                match [1] = 2;
            }
            else if (cards[row1-1][column1-1]=="J")
            {
                grid[row1-1][column1-1] = "J";
                match [1]= 3;
            }
            else if (cards[row1-1][column1-1]=="A")
            {
                grid[row1-1][column1-1] = "A";
                match [1] = 4;
            }  
            
            printArray(grid);
            if (match[0]== match[1])
            {
                grid[row-1][column-1] = "X";
                grid[row1-1][column1-1] = "X";
                System.out.println("Match!");
            }
            else
            {
                grid[row-1][column-1] = "*";
                grid[row1-1][column1-1] = "*";
                System.out.println("Sorry try again :(");
            }
            printArray(grid);
    }while(!isBoardFinished(grid));
}
}
       
        
