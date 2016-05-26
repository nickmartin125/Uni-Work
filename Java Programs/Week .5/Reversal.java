package reversal;

import java.util.Scanner;
public class Reversal 
{ 
    public static void main(String[] args) 
    {
      Scanner kybrd = new Scanner (System.in);
      long change = 0l;
      long input = 0l;
      long reversed = 0l;
      
      do
      {
        System.out.print("Number Reversal.\n\n"
          + "To Exit enter -1\n"
          +"Please Enter number between 10 and 9,999,999,999: ");
        input = kybrd.nextInt();
        for (int j = 0; j<11 ; j++)
        {
            if (input >= 10 && input <= 9999999999l)
            {                    
                reversed = input % 10;
                input = input / 10;
                System.out.printf("%d",reversed);
            }
        }

        System.out.println(input);
      }while (input != -1);
    }
}

      
        
    