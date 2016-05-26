
package basketmod;

import static basketmod.Basket.addProduct;
import static basketmod.Basket.output;
import static basketmod.Basket.presentProduct;
import static basketmod.Basket.removeProduct;
import static basketmod.Checkout.login;
import static basketmod.Checkout.receipt;
import java.util.ArrayList;


public class BasketMod {

    
    public static void main(String[] args) {
        ArrayList <ArrayList> queue = new ArrayList <>();
        ArrayList <Product> Basket1 = new ArrayList <>();
        ArrayList <Product> Basket2 = new ArrayList <>();
        
      addProduct(Basket1, Basket2, queue);
      //presentProduct(Basket1);
      //output(products);
      //removeProduct(products);
      receipt(Basket1, Basket2);
      login(queue);
      addProduct(Basket1, Basket2, queue);
      login(queue);
    }
    }

    
    
    

