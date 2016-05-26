
package funcalc;

import java.util.Scanner;
public class FunCalc {
public static void add(double num1,double num2, double sum)
   {
       sum = (num1+num2);
       System.out.printf("%.0f + %.0f = %.0f\n",num1,num2,sum);
   }
   public static void subtract(double num1,double num2, double sum)
   {
       sum = (num1-num2);
       System.out.printf("%.0f - %.0f = %.0f\n",num1,num2,sum);
   }
   public static void multiply(double num1,double num2, double sum)
   {
       sum = (num1*num2);
       System.out.printf("%.0f * %.0f = %.0f\n",num1,num2,sum);
   }
   public static void divide(double num1,double num2, double sum)
   {
       sum = (num1/num2);
       System.out.printf("%.0f / %.0f = %.2f\n",num1,num2,sum);
   }
   public static void remainder(double num1,double num2, double sum)
   {
       sum = (num1%num2);
       System.out.printf("%.0f remainder %.0f = %.0f\n" ,num1,num2,sum);
   }
    
    public static void main(String[] args) {
      Scanner kybrd = new Scanner (System.in);
      System.out.print("Please enter 1st interger: ");
      double num1 = kybrd.nextDouble();
      System.out.print("Please enter 2nd interger: ");
      double num2 = kybrd.nextDouble();
      double sum = 0;
      System.out.printf("1. Add\n"
              + "2. Subtract\n"
              + "3. Multiply\n"
              + "4. Divide\n"
              + "5. Remainder\n\n\n");
      System.out.print("Please Choose Operand: ");
      int choice = kybrd.nextInt();
         
        switch(choice)
        {
            case 1:
                add(num1, num2, sum);
                break;
            case 2:
                subtract(num1, num2, sum);
                break;
            case 3:
                multiply(num1, num2, sum);
                break;
            case 4:
                divide(num1, num2, sum);
                break;
            case 5:
                remainder(num1, num2, sum);
                break;
        }   
        
}          
}
