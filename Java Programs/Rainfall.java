
package rainfall;

import java.util.Scanner;
public class Rainfall {

  public static void main(String[] args) {
    Scanner kybd = new Scanner(System.in);
    int max = 0;
    int[] rainArray = new int[12];
    String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                       "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    for(int i = 0; i < months.length; i++) {
      System.out.print("Enter rainfall for " + months[i] + ": ");
      rainArray[i] = kybd.nextInt();
    }
    for ( int i = 0; i < months.length; i++ )
    {
    if (rainArray[i] >= max)
    {
    max = rainArray[i];
    }
    }
    do{
     for (int i = 0; i < months.length; i++)
     {
      if (rainArray[i]<max){
          System.out.print("\t");
      }
      else  
      {
        System.out.print(" *\t");
      }
      } 
      max--;
      System.out.print("\n");
     
  }while(max!=0);
    for (int i = 0; i < months.length;i++){
        System.out.printf("%s\t",months[i]);
    }
}
}