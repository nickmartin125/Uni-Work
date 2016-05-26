
package basketmod;

import static basketmod.Basket.addProduct;
import static basketmod.Basket.output;
import static basketmod.Basket.removeProduct;
import java.util.ArrayList;


public class BasketMod {

    
    public static void main(String[] args) {
        ArrayList <Product> products = new ArrayList <>();
      
      addProduct(products);
      output(products);
      removeProduct(products);
      output(products);
      
    }
    
}
