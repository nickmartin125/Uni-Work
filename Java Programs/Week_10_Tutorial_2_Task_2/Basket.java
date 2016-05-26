
package basketmod;
import java.util.Scanner;
import java.util.ArrayList;


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
     
      public static Product presentProduct (ArrayList <Product> array){
        Product present = new Product ();
        int lastIndex = 0;
        lastIndex = array.lastIndexOf(array);
        present = array.get(lastIndex);
        return present;
        }
      
    public static void addProduct (ArrayList <Product> array){
        Product a = new Product();
        a.setName("Beans 200g");
        a.setPrice(0.65);
        a.setCode(12345678);
        array.add(a);
        Product b = new Product();
        b.setName("Cornflakes 500g");
        b.setPrice(2.35);
        b.setCode(23456789);
        array.add(b);
        Product c = new Product();
        c.setName("Semi-skimmed Milk 1l");
        c.setPrice(1.15);
        c.setCode(98765432);
        array.add(c);
    }
    
    public static boolean removeProduct (ArrayList <Product> array){
        Scanner kybrd = new Scanner (System.in);
        Product tempProduct = new Product();
        System.out.print("\nPlease Enter Product to Remove: ");
        String choice = kybrd.nextLine();
        for (int i = 0 ; i < array.size();i++){
           tempProduct = array.get(i);
           if (tempProduct.getName().contains(choice)){
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
     
                


    
     public static void output(ArrayList <Product> array)
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
   

