
package weeklyshop;

import java.util.Scanner;
public class WeeklyShop {

   
    public static void main(String[] args) {
     Scanner keybrd = new Scanner(System.in);
     System.out.print("Please enter amount and cost of peaches: ");
     int peachesA = keybrd.nextInt();
     double peaches = keybrd.nextDouble();
     keybrd.nextLine();
     System.out.print("Please enter amount and cost of beans: ");
     int beansA = keybrd.nextInt();
     double beans = keybrd.nextDouble();
     keybrd.nextLine();
     System.out.print("Please enter amount and cost of chicken: ");
     int chickenA = keybrd.nextInt();
     double chicken = keybrd.nextDouble();
     keybrd.nextLine();
     System.out.print("Please enter amount and cost of socks: ");
     int socksA = keybrd.nextInt();
     double socks = keybrd.nextDouble();
     keybrd.nextLine();
     System.out.print("Please enter amount and cost of water: ");
     int waterA = keybrd.nextInt();
     double water = keybrd.nextDouble();
     int totalItems = (peachesA+beansA+chickenA+socksA+waterA);
     double totalCost = ((peaches*peachesA)+(beans*beansA)+(chicken*chickenA)+(socks*socksA)+(waterA*water));
     System.out.println("Total number of items purchased " + totalItems);
     System.out.println("Total cost of items purchased " + totalCost);
    }
    
}

