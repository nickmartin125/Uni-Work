package multiinits;

import java.util.Scanner;
public class MultiInits {
    public static void main(String[] args) {
        Scanner kybrd = new Scanner(System.in);
        char ini = ' ';
        System.out.print("Please Enter Your Full Name: ");
        String input = kybrd.nextLine();
        char[] charArray = input.toCharArray();
        System.out.print("Your Initials Are "+ charArray[0]);
        for (int i = 0; i < charArray.length;i++)
        {
            if (charArray[i]== ' ')
            {
               ini = charArray[i+1];
                System.out.print("." + ini );}
                else if (charArray[i]=='-'){
                    ini = charArray[i+1];
                    System.out.print("-" + ini);
                }
            }
        }
                 
           
        }
    
    

