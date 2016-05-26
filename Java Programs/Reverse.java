
package reverse;

import java.util.Scanner;
public class Reverse {

    
    public static void main(String[] args) {
    Scanner kybrd = new Scanner (System.in);
    int input [] = new int [5];
    System.out.println("Please Enter Five Integers: ");
    for (int i = 0 ; i < 5 ;i++){
        input [i] = kybrd.nextInt();}
    for (int i = 4; i >= 0 ;i--){
        System.out.print(input[i]+",");}
    }
    }
    

