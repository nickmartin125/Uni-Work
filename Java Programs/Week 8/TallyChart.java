package tallychart;

import java.util.Scanner;
public class TallyChart {

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
		for (int i = array.length-1; i >= 0; i--)
		{
                        System.out.print(strArray[i] + "\t\t\t");
			System.out.print(array[i] + "\n");
		}
		System.out.println();
	}
public static void choices(String [] strArray)
	{
		for (int i = 0; i < strArray.length; i++)
		{
                        System.out.print(strArray[i] + ", ");
			
		}
		System.out.println();
	}

    public static void main(String[] args) {
       Scanner kybrd = new Scanner (System.in); 
       String choice = "Stop"; 
       int [] total = new int [5];
       String [] name   =  {"Jacky", "Morgan", "Jake", "Sam", "Elliot"};
       for(int i =0; i < 10;i++){
           System.out.println(" Please Enter Contests name that you would like to vote for: ");
           int j = 0;
               choices(name);
           System.out.print("name: ");
           choice = kybrd.next();
           switch (choice){
                case "Jacky":
                    j = 0;
                    total [j] = total [j]+1 ;
                    break;
                case "Morgan":
                    j = 1;
                    total [j] = total [j]+1 ;
                    break;
                case "Jake":
                    j = 2;
                    total [j] = total [j]+1 ;
                    break;
                case "Sam":
                    j = 3;
                    total [j] = total [j]+1 ;
                    break;
                case "Elliot":
                    j = 4;
                    total [j] = total [j]+1;
                    break;
                default:
                    System.out.print("Please Enter Correct name/format\n"
                            + "(Capital Letter/Spelled Correctly)");
           } 
       
           System.out.print("\n\n\n");
       }
      
           sort(total,name);
           output(total,name);
           }
           }

