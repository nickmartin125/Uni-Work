
package grid;

import java.util.Scanner;
public class Grid {


    public static void main(String[] args) {
       Scanner kybrd = new Scanner (System.in);
       System.out.print("Please enter Grid width: ");
       int row = kybrd.nextInt();
       kybrd.nextLine();
       System.out.print("Please enter Grid Depth: ");
       int column = kybrd.nextInt();
       kybrd.nextLine();
      for ( int i = 0; i < column; i++ )
          {     
               System.out.println();
               for ( int j = 0; j < row; j++)
               
                      System.out.print("*");
                }
          }
}
    
    

