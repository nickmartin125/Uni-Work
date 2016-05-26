
package breakeven;

public class Breakeven {

   
    public static void main(String[] args) {
        double productionCost = 20;
        double sale = 40;
        double fixedCosts = 50000;
        
        System.out.println("Cost to produce each Item £" + productionCost);
        System.out.println("Sale Price for each Item £" + sale);
        System.out.println("Fixed Costs £" + fixedCosts);
        System.out.println("Profit Per Item £" + (sale-productionCost));
        System.out.println("Breakeven:" + (fixedCosts/(sale-productionCost))+" Items.");
        
    }
    
}
