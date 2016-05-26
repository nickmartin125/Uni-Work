
package cuboid;

import java.util.Scanner; 
public class Cuboid {

      
    public static void main(String[] args) {
       Scanner keybrd = new Scanner(System.in);
       
       System.out.print("Please enter Height: ");
        int height = keybrd.nextInt();
        System.out.print("Please enter Length: ");
        int length = keybrd.nextInt();
        System.out.print("Please enter Width: ");
        int width = keybrd.nextInt();
        int surface = ((width*length)+(width*height)+(length*height))*2;
        int area = (width*length*height);
        System.out.println("The Surface Area of your cuboid is " +surface+ " cm.");
        System.out.println("The Area of your cuboid is " +area+ " square cm.");
    }
}
