
package sumposneg;

import java.util.Scanner;
public class SumPosNeg {

    
    public static void main(String[] args) {
        Scanner kybrd = new Scanner (System.in);
        int posCount = 0;
        int negCount = 0;
        
        
        System.out.print("Please Enter 10 Positive or Negative Integers:");
        
        for (int i = 0; i < 10; i++){
            int input = kybrd.nextInt();
            kybrd.nextLine();
            if (input>0){
                posCount = posCount+ input;}
            else{
                negCount = negCount+ input;}}
            System.out.println("Sum of positive numbers: "+ posCount);
            System.out.println("Sum of negative numbers: "+ negCount);
            
                
            }
        }
                
    
    

