
package basketmod;


import static basketmod.Basket.queueisEmpty;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Checkout {
   
    public static void receipt (ArrayList <Product> basket1 ,ArrayList <Product> basket2){
        try {
        
        PrintWriter outFile = new PrintWriter("receipt.txt");
        double sum = 0; 
            try {
               Product temp = new Product();
                    outFile.println("Receipt\r\n"
                        + "==========\r\n"
                        + "\r\nProduct\r\t\r\t\r\t\r\tPrice\r\tCode\r\n"
                        + "============================");
             for (Product array1 : basket1) {
                 temp = array1;
                 outFile.printf("%-18s\t\t£%.2f\t%d\r\n", temp.getName(), temp.getPrice(), temp.getCode());
                 sum = temp.getPrice()+ sum;
             }
                outFile.printf("============================\r\n"
                        + "Total:\r\t\r\t\r\t\r\t£%.2f", sum);
               
            }
            catch (InputMismatchException ime) {
              
               System.out.println("Mismatch exception caught...");
            }
         
         outFile.close();
        
     }
     catch (IOException ioe) {
         System.out.println("ERROR: " + ioe.getMessage());
     }
    }
public static void login (ArrayList <ArrayList> queue){
    try{
        Scanner kybrd = new Scanner(System.in);
        PrintWriter master = new PrintWriter("master.txt");
        double sum = 0;
        double totalSum = 0;
        System.out.print("Please Enter Login Details: ");
        String user = kybrd.nextLine();
        ArrayList tempArray = new ArrayList <>();
        switch(user){
            case "Nick":
                PrintWriter op1 = new PrintWriter("checkout1_operative_Nick.txt");
                Product temp = new Product();
                   
                    
                    for(int i = 0; i <queue.size(); i++)
                    { 
                        op1.println("Receipt "+(i+1)+"\r\n"
                        + "==========\r\n"
                        + "\r\nProduct\r\t\r\t\r\t\r\tPrice\r\tCode\r\n"
                        + "============================");
                            tempArray = queue.get(i);
                            do{
                            for (int j= 0; j<tempArray.size();j++)
                            {
                                temp = (Product) tempArray.get(j);
                                op1.printf("%-18s\t\t£%.2f\t%d\r\n",temp.getName(),temp.getPrice(),temp.getCode());
                                master.printf("%-18s\t\t£%.2f\t%d\r\n",temp.getName(),temp.getPrice(),temp.getCode());
                                sum = temp.getPrice()+ sum;
                                totalSum = temp.getPrice()+totalSum;
                            }
                            op1.printf("============================\r\n"
                                    + "Total:\r\t\r\t\r\t\r\t\r£%.2f\r\n\r\n", sum);
                            sum = 0;
                            }while(queueisEmpty(queue));
                    } 
                    op1.printf("============================\r\n"
                                + "============================\r\n"
                                + "Grand Total:\r\t\r\t\r\t\r£%.2f\r\n\r\n", totalSum);
                   
                    op1.close();
                break;
      case "Ellen":
                PrintWriter op2 = new PrintWriter("checkout2_operative_Ellen.txt");
                Product temp2 = new Product();
                    for(int i = 0; i <queue.size(); i++)
                    { 
                        op2.println("Receipt "+(i+1)+"\r\n"
                        + "==========\r\n"
                        + "\r\nProduct\r\t\r\t\r\t\r\tPrice\r\tCode\r\n"
                        + "============================");
                            tempArray = queue.get(i);
                            do{
                            for (int j= 0; j<tempArray.size();j++)
                            {
                                temp2 = (Product) tempArray.get(j);
                                op2.printf("%-18s\t\t£%.2f\t%d\r\n",temp2.getName(),temp2.getPrice(),temp2.getCode());
                                master.printf("%-18s\t\t£%.2f\t%d\r\n",temp2.getName(),temp2.getPrice(),temp2.getCode());
                                sum = temp2.getPrice()+ sum;
                                totalSum = temp2.getPrice()+totalSum;
                            }
                            op2.printf("============================\r\n"
                                + "Total:\r\t\r\t\r\t\r\t\r£%.2f\r\n\r\n", sum);
                            sum = 0;
                            }while(queueisEmpty(queue));
                    } 
                    op2.printf("============================\r\n"
                            + "============================\r\n"
                                + "Grand Total:\r\t\r\t\r\t\r£%.2f\r\n\r\n", totalSum);
                   
                    op2.close();
        
    }
        master.printf("============================\r\n"
                            + "============================\r\n"
                                + "Grand Total:\r\t\r\t\r\t\r£%.2f\r\n\r\n", totalSum);
        master.close();
    }
    catch (IOException|InputMismatchException ime){
        
    }  
    }
   
}
