package restaurant;


import java.util.Scanner;
public class Restaurant {
  public static void main(String[] args) {
    Scanner kybd = new Scanner(System.in);
    int mainDish = -1;
    int sideDish = -1;
    System.out.println("Main dishes are:");
    System.out.println("1. Lasagne");
    System.out.println("2. Stir Fry");
    System.out.print("Please select dish:");
    mainDish = kybd.nextInt();
    switch(mainDish) {
      case 1: // Lasagne
        System.out.println("Side dishes are:");
        System.out.println("1. Garlic bread");
        System.out.println("2. Fries");
        System.out.print("Please select side dish:");
        sideDish = kybd.nextInt();
        switch(sideDish) {
          case 1:
            System.out.println("You have selected Lasagne with garlic bread");
            break;
          case 2:
            System.out.println("You have selected Lasagne with fries");
            break;
          default:
            System.out.println("Invalid item selected");
        }
        break;
      case 2: 
         System.out.println("Side dishes are:");
        System.out.println("1. Noodles");
        System.out.println("2. Crispy Seaweed");
        System.out.print("Please select side dish:");
        sideDish = kybd.nextInt();
        switch(sideDish) {
          case 1:
            System.out.println("You have selected Stir Fry with Noodles");
            break;
          case 2:
            System.out.println("You have selected Stir Fry with Crispy Seaweed");
            break;
          default:
           System.out.println("Invalid item selected");}
     
    }
  }
}