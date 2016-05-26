package restaurantratings1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class RestaurantRatings1{
    public static float average (int [] rating, int count,float num){
        int sum = 0;
        for (int i =0; i < rating.length;i++){
            sum = (sum + rating[i]);
        }
        return num = (float)count/sum;
    };
    public static void printRatings(int [] rating, int count,float num){
        System.out.printf("\n\nStars\t\t\tRatings.\n"
                + "  5\t\t\t%d\n"
                + "  4\t\t\t%d\n"
                + "  3\t\t\t%d\n"
                + "  2\t\t\t%d\n"
                + "  1\t\t\t%d\n\n"
                + "Average \t\t%.2f\n\n",rating[4],rating[3],rating[2],rating[1],rating[0],average(rating, count, num));
    }
    
    public static void main (String [] args)
    {
        Scanner kybrd = new Scanner (System.in);
        int input =0;
        int count =0;
        float average = 0;
        int [] rating = new int [5];
 do{
    try{
    
        System.out.print("Please Enter a rating for Chateau Du Martin:\n"
                + "(Between 1-5, 1 being poor, 5 being excellent)\n"
                + "Rating:  ");
        input = kybrd.nextInt();
        switch(input)
        {
            case 1:
                rating[0]++;
                count=count+1;
                break;
            case 2:
                rating[1]++;
                 count=count+2;
                break;
            case 3:
                rating[2]++;
                 count=count+3;
                break;
            case 4:
                rating[3]++;
                count=count+4;
                break;
            case 5:
                rating[4]++;
                count=count+5;
                break; 
            case -1:
                break;
            default:
                System.out.print("Please Enter a number between 1-5\n\n");
        }
        }
    catch(InputMismatchException ime)
    {
    System.out.println("Invalid Entry, Please try again.\n\n");
    break;
    }
    
   }
        while(input!=-1); 
        printRatings(rating,count,average);
    }
}
    

    