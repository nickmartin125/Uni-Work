
package swap;

import java.util.Scanner;
public class Swap {
    //swap moves up one array and down the other.
    public static void swap (int [] sourceArray, int [] swappedArray)
    {
       // for (int i = 0; i<sourceArray.length;i++)
        //{
          //  for (int j = 1; j>=0; j--)
            //{
              swappedArray[0] = sourceArray[1];
              swappedArray[1] = sourceArray[0];
            //}
        //}
    }
    public static void print (int [] sourceArray, int [] swappedArray){
        System.out.print("You Entered: ");
        for (int i = 0; i<sourceArray.length; i++)
        {
            System.out.print(sourceArray[i]+" ");
        }
        System.out.print("\nSwapped Entries: ");
        for (int i = 0; i<swappedArray.length; i++)
        {
            System.out.print(swappedArray[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        Scanner Kybrd = new Scanner (System.in);
        int [] input = new int [2];
        int [] swap = new int [2];
        System.out.print("Please Enter two integers: ");
        for(int i = 0;i < input.length;i++)
        {
            input[i]=Kybrd.nextInt();
        }
    swap(input,swap);
    print(input,swap);
    
    }
    
}
