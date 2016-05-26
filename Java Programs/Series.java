package series;

import java.util.Scanner;
public class Series {

    
    public static void main(String[] args) {
       Scanner kybrd = new Scanner (System.in);
       int countNeg = 0;
       int countPos = 0;
       int amount = 0;
        
            for(int i = 0; i < 5; i++){
            
   System.out.print("Please Enter a number: ");
   amount = kybrd.nextInt();
    if (amount < 0){
    countNeg = countNeg + amount;}
    else{
    countPos = countPos + amount;}
   
}
     System.out.printf("Sum of positive Integers: %d\n", countPos);
    System.out.printf("Sum of Negative Integers: %d\n", countNeg);
            

    }
}

