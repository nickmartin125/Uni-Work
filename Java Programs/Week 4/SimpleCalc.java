
package simplecalc;

import java.util.Scanner;
public class SimpleCalc {

    
    public static void main(String[] args) {
        Scanner kybrd = new Scanner (System.in);
        System.out.print("Please Enter Sum to Solve ");
        int input1 = kybrd.nextInt();
        String operator = kybrd.next();
        int input2 = kybrd.nextInt();
        switch(operator){
            case"*":
                System.out.printf("Your Sum is %d %s %d and the answer is "+(input1*input2)+".\n",input1,operator,input2);
                break;
            case"-":    
                System.out.printf("Your Sum is %d %s %d and the answer is "+(input1-input2)+".\n",input1,operator,input2);
                break;
            case"+":
                System.out.printf("Your Sum is %d %s %d and the answer is "+(input1+input2)+".\n",input1,operator,input2);
                break;
            case"/":
                System.out.printf("Your Sum is %d %s %d and the answer is "+(input1/input2)+".\n",input1,operator,input2);
                break;
            default:
                System.out.println("Please enter a Valid Operator");}
        }
    }
    

