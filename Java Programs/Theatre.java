package theatre;

import java.util.Scanner;
public class Theatre {

    
    public static void main(String[] args) {
        Scanner kybrd = new Scanner (System.in);
        double adult = 10.50;
        double child = 7.30;
        double consession = 8.40;
        double discount = 0;
       
        System.out.print("Please Enter Amount of Adults: ");
        int adultInput = kybrd.nextInt();
        System.out.print("Please Enter Amount of Consession: ");
        int conssInput = kybrd.nextInt();
        System.out.print("Please Enter Total Amount of Tickets Required: ");
        int totalInput = kybrd.nextInt();
        int childInput = totalInput-conssInput-adultInput;
       double childCost =child*childInput;
        double adultCost = adult*adultInput;
        double consessionCost = conssInput*consession;
        double cost = childCost+adultCost+consessionCost;
        double subTotal = cost - discount;       
        double vat = subTotal*.2;
        double totalBill = subTotal+vat;
        if (childInput >=11 && childInput <=19){
            adultInput = adultInput-1;
            adultCost = adult*adultInput;}
        else if (childInput >=20 && childInput <=29 ){
            adultInput = adultInput-2;
            adultCost = adult*adultInput;}        
            if (subTotal >=100){
                discount = subTotal - (subTotal*.9);
               subTotal = subTotal - discount;
            } 
        
         System.out.printf("\n\n"
                 + "Receipt.\n"
                 + "Type\t\tAmount\t\tCost\n"
                 + "Adult\t\t%d\t\t£%.2f\n"
                 + "Consession\t%d\t\t£%.2f\n"
                 + "Child\t\t%d\t\t£%.2f\n\n\n"
                 + "Discount\t\t\t£%.2f\n"
                 + "Subtotal\t\t\t£%.2f\n"
                 + "V.A.T\t\t\t\t£%.2f\n"
                 + "Total\t\t\t\t£%.2f\n\n" ,adultInput,adultCost,conssInput,consessionCost,childInput,childCost,discount,subTotal,vat,totalBill);
        
        }
    }


