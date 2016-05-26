
package costofliving;

import java.util.Scanner;
public class CostOfLiving {

    
    public static void main(String[] args) {
       Scanner keyBrd = new Scanner(System.in);
       String divider = ("========================");
       System.out.print("Please Enter your Monthly Rent Cost £");
       double rent = keyBrd.nextDouble();
       keyBrd.nextLine();
       System.out.print("Please Enter your Monthly Gas Cost £");
       double gas = keyBrd.nextDouble();
       keyBrd.nextLine();
       System.out.print("Please Enter your Monthly Electricity Cost £");
       double Elec = keyBrd.nextDouble();
       keyBrd.nextLine();
       System.out.print("Please Enter your Monthly Water Cost £");
       double water = keyBrd.nextDouble();
       keyBrd.nextLine();
       System.out.print("Please Enter your Monthly Council Tax Cost £");
       double council = keyBrd.nextDouble();
       keyBrd.nextLine();
       double total = rent + gas + Elec + water + council;
       System.out.println("\nYour Monthly Expenses are:");
       System.out.printf("\n%-14s £%8.2f\n", "Rent:", rent );
       System.out.printf("%-14s £%8.2f\n", "Gas:", gas );
       System.out.printf("%-14s £%8.2f\n", "Electricity:", Elec );
       System.out.printf("%-14s £%8.2f\n", "Water:", water );
       System.out.printf("%-14s £%8.2f\n", "Council Tax:", council );
       System.out.println(divider);
       System.out.printf("%-14s £%8.2f\n", "Total:", total );
       System.out.println(divider);
    }
    
}
