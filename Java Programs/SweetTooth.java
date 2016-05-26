
package sweettooth;


public class SweetTooth {

    
    public static void main(String[] args) {
      int totalSweets = 40;
      int students = 14;
      int remainder = 0;
      
      System.out.println("The teacher has " + totalSweets +" sweets.");
      System.out.println("She shared them equally between " + students + " students." );
      System.out.println("Each student will receive " + totalSweets/students + " sweets.");
      System.out.println("The teacher will be left with " + totalSweets%students + " for herself.");
    }
    
}
