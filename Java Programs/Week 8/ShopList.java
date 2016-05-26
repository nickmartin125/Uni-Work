
package shoplist;

import java.util.Scanner;
public class ShopList {

   public static void sort(int[] array, String [] strArray)
{
   for (int pass = 1; pass < array.length; pass++)
   {
      int firstElement = pass - 1;
      int smallPos = findSmallest(array, firstElement);
      if (smallPos != firstElement)
      {
          int temp = array[smallPos];
          String strtemp = strArray[smallPos];
          array[smallPos] = array[firstElement];
          strArray[smallPos] = strArray[firstElement];
          array[firstElement] = temp;
          strArray[firstElement] = strtemp;
      } 
    }
}
   
public static int findSmallest(int[] array, int first)
{
	int smallestPos = first;
	for (int i = first+1; i < array.length; i++)
	{
		if (array[i] < array[smallestPos])
		{
			smallestPos = i;
		}
	}
	return smallestPos;
}
public static void output(int [] array, String [] strArray)
	{
		for (int i = 0; i < array.length; i++)
		{
                        System.out.print(strArray[i] + "\t\t\t£");
			System.out.print(array[i] + "\n");
		}
		System.out.println();
	}


    public static void main(String[] args) {
       Scanner kybrd = new Scanner (System.in);
       int [] cost = new int [5];
       String [] item   = new String [5];
       System.out.println(" Please Enter 5 Items with cost: ");
       for (int i = 0 ; i < cost.length;i++){
           System.out.print("Item: ");
           item [i] = kybrd.nextLine();
           System.out.print("Cost: £");
           cost [i] = kybrd.nextInt();
           kybrd.nextLine();
       }
           sort(cost,item);
           output(cost,item);
    }
    
}
