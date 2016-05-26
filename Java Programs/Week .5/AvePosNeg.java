package aveposneg;

import java.util.Scanner;
public class AvePosNeg {

    
    public static void main(String[] args) {
       int countZero = 0; 
       int sumPos = 0;
       int sumNeg = 0;
       float countPos = 0;
       float countNeg = 0;
       float aveNeg = 0;
       float avePos = 0;    
       Scanner kybrd = new Scanner(System.in);
       System.out.println("Please Enter Positive or Negative Integers: ");
       for (int i = 0;i < 10 ; i++){
           int input = kybrd.nextInt();
                if (input < 0)
                {
                    sumNeg = sumNeg + input;
                    countNeg++;
                }
                else if (input > 0){
                        sumPos = sumPos + input;
                        countPos++;
                    }
                    else{
                        countZero++;
                    }
       }
       aveNeg = sumNeg/countNeg;
       avePos = sumPos/countPos;
      try{}
    catch (ArithmeticException e) { // 
      System.out.println("Division by zero.");
    }
      
                System.out.printf("The total sum of Positive numbers was: %d\n"
                        + "The average was: %.2f\n"
                        + "The total sum of Negative Numbers: %d\n"
                        + "The average was: %.2f\n"
                        + "There were %d Zero Entries.\n",sumPos,avePos,sumNeg,aveNeg,countZero);
                }
       }
    
    


