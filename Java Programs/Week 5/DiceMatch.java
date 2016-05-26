
package dicematch;

public class DiceMatch {

    
    public static void main(String[] args) {
      int i = 0;  
      for(i= 0; ;i++){ 
         int dice1 = (int)(Math.random()* 6)+1;
         int dice2 = (int)(Math.random() * 6)+1;
         if (dice1 != dice2){
          
              System.out.printf("Game %d : %d - %d\n",i ,dice1, dice2 );
          }
      
          else{
                System.out.printf("Game %d : %d - %d\n",i ,dice1, dice2 );
                break;
                  }
      }
    }
    
}
