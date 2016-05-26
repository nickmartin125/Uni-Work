package telephonebill;

import java.util.Scanner;
public class TelephoneBill {

    
    public static void main(String[] args) {
    double costPerMin= 0.15;
    Scanner kybrd = new Scanner (System.in);
    System.out.print("Please Enter amount of minutes: ");
    int minutes = kybrd.nextInt();
    kybrd.nextLine();
    double cost = (costPerMin*minutes);
    double vat = (cost/100*20);
    double totalCost = (vat+cost);
    System.out.printf("Number Of minutes Used: %d \nBasic Call Charge: £%.2f \nVAT due: £%.2f \nTotal Bill: £%.2f\n\n",minutes, cost, vat, totalCost);
    }
    
}

