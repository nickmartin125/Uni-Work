
package gamechart;

import java.util.Scanner;
import java.util.ArrayList;


public class GameChart 
{
    public static String gameEntry(ArrayList<Game> arraylist)
    {
        Scanner kybrd = new Scanner (System.in);
            Game newGame = new Game();
            System.out.printf("Please Enter Game Title: ");
            String name =kybrd.nextLine();
            System.out.printf("\nEnter Publisher: ");
            String Pub = kybrd.nextLine();
            System.out.printf("\nEnter Sales: ");
            int Sales = kybrd.nextInt();   
             
            return arraylist.add(newGame(name, Pub, Sales));
    }
     
    public static void salesUpdate (ArrayList<Game> arraylist)
    {
        Scanner kybrd = new Scanner (System.in);
        Game GameToEdit = null;
        
        System.out.print("Please Enter Game Title: ");
        String input = kybrd.next();
        
        for(int i = 0; i < arraylist.size(); i++)
        {
            if(arraylist.get(i).getName() == input)
            {
                GameToEdit = arraylist.get(i);
                break;
            }
        }
        
        if(GameToEdit != null)
        {
            System.out.print("Please Enter new sales figures: ");
            GameToEdit.setSales(kybrd.nextInt());
        }            
                
    }
    public static void listPrint(ArrayList<Game> arraylist){
        for(int i = 1; i < 5; i++){
            arraylist.get(i).getName();
            arraylist.get(i).getPub();
            arraylist.get(i).getSales();
            }
    }
    public static void removeGame (ArrayList<Game> arraylist){
        Scanner kybrd = new Scanner (System.in);
        System.out.print("Please Choose Title to Remove: ");
        int choice = kybrd.nextInt();
    }
    
    public static void main(String[] args)
    {
        int choice = 0;
        do{
            ArrayList<Game> myList = new ArrayList();
            Scanner kybrd = new Scanner(System.in);
            System.out.printf("Games Chart System.\n\n\n"
                + "1. Enter New Game Details.\n"
                + "2. Update Game Sale Figures.\n"
                + "3. Remove Game.\n"
                + "4. Print Chart.\n"
                + "5. Quit.\n\n\n"
                    + "Choice:");
        choice = kybrd.nextInt();
        switch (choice)
        {
            case 1:
                gameEntry(myList);
                break;
            case 2:
                salesUpdate(myList);
                break;
            case 3:
                removeGame(myList);
                break;
            case 4:
                listPrint(myList);
                break;
            case 5:
                break;
            default:
                System.out.print("Please Choose between 1-5");
        }
        
           
           
            
            
        
        
    }while (choice != 5);
}
}