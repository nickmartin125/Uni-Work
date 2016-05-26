
package address;

import java.util.Scanner;
public class Address {

    
    public static void main(String[] args) {
    Scanner keyboard = new Scanner (System.in);
    String titles = ("Mr and Mrs");
    System.out.print("Please Enter Surname: ");
    String surname = keyboard.next();
    keyboard.nextLine();
    System.out.print("Please Enter House Number: ");
    int house = keyboard.nextInt();
    keyboard.nextLine();
    System.out.print("Please Enter Road: ");
    String road = keyboard.nextLine();
    System.out.print("Please Enter Town: ");
    String town = keyboard.next();
    keyboard.nextLine();
    System.out.printf("\n\t %s %s,\n\t %d, %s, \n\t %s. \n\n ", titles, surname, house, road, town);
   
    

    }
    
}
