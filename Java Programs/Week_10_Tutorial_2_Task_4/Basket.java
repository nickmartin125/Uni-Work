
package basketmod;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;



public class Basket {
   
    ArrayList <Product> product = new ArrayList<>();
    
     public static boolean isEmpty (ArrayList <Product> array){
        if (array.isEmpty()){
            System.out.println("Basket is Empty.");
            return true;}
        else{
            return false;
        }
     }
      public static boolean queueisEmpty (ArrayList <ArrayList> array){
        if (array.isEmpty()){
            System.out.println("There is No Queue.");
            return true;}
        else{
            return false;
        }
     }
      public static Product presentProduct (ArrayList <Product> array){
        Product present = new Product ();
        int lastIndex = 0;
        lastIndex = array.lastIndexOf(array);
        present = array.get(lastIndex);
        return present;
        }
      
    public static void addProduct (ArrayList <Product> basket1,ArrayList <Product> basket2,ArrayList <ArrayList> queue){
        Product a = new Product();
        a.setName("Beans 200g");
        a.setPrice(0.65);
        a.setCode(12345678);
        basket1.add(a);
        Product b = new Product();
        b.setName("Cornflakes 500g");
        b.setPrice(2.35);
        b.setCode(23456789);
        basket2.add(b);
        Product c = new Product();
        c.setName("Semi-skimmed Milk 1l");
        c.setPrice(1.15);
        c.setCode(98765432);
        basket1.add(c);
        Product d = new Product();
        d.setName("Bacon 400g");
        d.setPrice(2.00);
        d.setCode(25344162);
        basket2.add(d);
        Product e = new Product();
        e.setName("Eggs 1/2Dz");
        e.setPrice(1.65);
        e.setCode(455263444);
        basket1.add(e);
        Product f = new Product();
        f.setName("Tinned Tomatoes");
        f.setPrice(0.56);
        f.setCode(662319867);
        basket2.add(f);
        Product g = new Product();
        g.setName("Hash Browns");
        g.setPrice(2.00);
        g.setCode(25300162);
        basket1.add(g);
        queue.add(basket1);
        queue.add(basket2);
    }
    
    
    public static boolean removeProduct (ArrayList <Product> array){
        Scanner kybrd = new Scanner (System.in);
        Product tempProduct = new Product();
        System.out.print("\nPlease Enter Product to Remove: ");
        String choice = kybrd.nextLine();
        for (int i = 0 ; i < array.size();i++)
        {
           tempProduct = array.get(i);
           if (tempProduct.getName().contains(choice))
           {
                System.out.print("\n\nWould you like to remove "+tempProduct.getName()+"?\n"
                        + "Yes/No?\n");
                        String agree = kybrd.nextLine();
                            if (agree.equalsIgnoreCase("yes"))
                            {
                                array.remove(i);
                                return true;
                            }       
           }
        }     return false;
             
    }       
    
     public static void output(ArrayList <Product> array, ArrayList <Product> Array)
    {
        while (!isEmpty(array))
        {
        System.out.println("\nProduct\t\t\t\tPrice\tCode");
        System.out.println("============");

        for (Product tempProduct : array) {
            System.out.printf("%-18s\t\t£%.2f\t%d\n", tempProduct.getName(), tempProduct.getPrice(), tempProduct.getCode());
        }
        break;
        } 
    }
}
   

