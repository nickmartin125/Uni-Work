package charactergen;

import java.util.Scanner;
public class CharacterGen 
{
    
    
    public static void main(String[] args) 
    {
        Scanner kybrd = new Scanner (System.in);
         int[] playerValues = new int[5];
         boolean player = false;
         int[] newPlayerValues = new int [5];
        int j = 0;
        for(int i=0; i<playerValues.length; i++)
        {
            int rand = (int )(Math.random() * 15 + 4);
            playerValues[i] = rand;
        }
        int [][] aryBaseValues ={ 
       {15,0,0,12,10},//Warrior
       {0,15,10,10,0},//Wizard
       {10,9,0,15,0},//Thief
       {10,10,15,0,0}};//Necromancer
        
        String [] attributes = {"Strength","Intelligence","Wisdom   ","Dexterity","Contitution"};
        
        System.out.print("Please enter your name: ");
                String name = kybrd.nextLine();
        System.out.print("Please enter Chosen Class: ");
                String chosen = kybrd.nextLine();
            
                switch(chosen)
                {
                    case "Warrior": 
                        j= 0;
                        break;
                    case "Wizard":
                        j=1;
                        break;
                    case "Thief":
                        j=2;
                        break;
                    case "Necromancer":
                        j=3;
                        break;
                }
       System.out.printf("%s 's Attributes.\n",chosen);
            for (int k = 0; k < aryBaseValues[j].length; k++){
                System.out.printf( "%s\t\t%d\n",attributes[k],aryBaseValues[j][k]);
    }
        System.out.printf("%s's Attributes.\n",name);
            for(int i=0; i<playerValues.length; i++){ 
                System.out.printf("%s \t\t%d\n",attributes[i],playerValues[i]);}
          for( int i =0; i<playerValues.length; i++){
              if (playerValues[i] < aryBaseValues[j][i]){
                  System.out.printf("%s value too low, please choose a class to swap from:", attributes[i]);
                  String swap = kybrd.nextLine();
                  System.out.printf("Please enter number of points required (1 point moved uses 2 points from other attribute):");
                  int pointSwap = kybrd.nextInt();
                  kybrd.nextLine();
                    switch (swap){
                        case "Strength":
                            playerValues[i] = playerValues[i]+pointSwap;
                            playerValues[0] = playerValues[0]-(2*pointSwap);
                            if (playerValues[0]<3){
                                System.out.print("Please Choose another trait.");
                                playerValues[0]= playerValues[0] + (2*pointSwap);
                                playerValues[i] = playerValues[i]-pointSwap;
                            }
                            break;
                        case "Intelligence":
                            playerValues[i] = playerValues[i]+pointSwap;
                            playerValues[1] = playerValues[1]-(2*pointSwap);
                            if (playerValues[1]<3){
                                System.out.print("Please Choose another trait.");
                                playerValues[1]= + playerValues[1]+(2*pointSwap);
                                playerValues[i] = playerValues[i]-pointSwap;
                            }
                            break;
                        case "Wisdom":
                             playerValues[i] = playerValues[i]+pointSwap;
                            playerValues[2] = playerValues[2]-(2*pointSwap);
                            if (playerValues[2]<3){
                                System.out.print("Please Choose another trait.");
                                playerValues[2]= playerValues[2] + (2*pointSwap);
                                playerValues[i] = playerValues[i]-pointSwap;
                            }
                            break;
                        case "Dexterity":
                             playerValues[i] = playerValues[i]+pointSwap;
                            playerValues[3] = playerValues[3]-(2*pointSwap);
                            if (playerValues[3]<3){
                                System.out.print("Please Choose another trait.");
                                playerValues[3]=playerValues[3] + (2*pointSwap);
                                playerValues[i] = playerValues[i]-pointSwap;
                            }
                            break;
                        case "Constitution":
                             playerValues[i] = playerValues[i]+pointSwap;
                            playerValues[4] = playerValues[4]-(2*pointSwap);
                            if (playerValues[4]<3){
                                System.out.print("Please Choose another trait.");
                                playerValues[4]= playerValues[4] + (2*pointSwap);
                                playerValues[i] = playerValues[i]- pointSwap;
                            }
                            break;}
              }
          }     
          System.out.print("\nFinal Result:\n\n");
                   for(int l=0; l<playerValues.length; l++){
                System.out.printf( "%s\t\t%d\n",attributes[l],playerValues[l]);}    
                   for  (int l = 0; l<playerValues.length; l++){
                       if (playerValues[l]>=aryBaseValues[j][l]){
                          player = true;
                       }
                   }
                       if (player){
                    System.out.printf("Congratulations %s you are a %s\n",name,chosen);
                       }
                       else {
                           System.out.print("You cannot become your chosen class please try again!");
                       }
                   }
          }
    
   


