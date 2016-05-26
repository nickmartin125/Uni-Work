
package theband;

import java.util.Scanner;

public class TheBand {

   
    public static void main(String[] args) {
      Scanner kybrd = new Scanner (System.in);
      Person John = new Person();
        Person Paul = new Person();
        Person George = new Person();
        Person Ringo = new Person(); 

        John.setName("John", "Lennon");
        John.setDOB(8, 10, 1940);
        Paul.setName("Paul", "McCartney");
        Paul.setDOB(18, 07, 1942);
        George.setName("George", "Harrison");
        John.setDOB(25, 2, 1943);
        Paul.setName("Ringo", "Starr");
        Paul.setDOB(07, 07, 1940);
        System.out.println(John.getName() + " was Born: " + 
                           John.getDOB());
        System.out.println(Paul.getName() + " was Born: " + 
                           Paul.getDOB());
        System.out.println(George.getName() + " was Born: " + 
                           George.getDOB());
        System.out.println(Ringo.getName() + " was Born: " + 
                           Ringo.getDOB());
        

    }
    
}
