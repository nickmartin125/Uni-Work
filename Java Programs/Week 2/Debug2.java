package debug2;
import java.util.Scanner;
public class Debug2{
    
    public static void main(String[] args) {
        Scanner kybd = new Scanner(System.in);
        int counter = 0;
        System.out.printf("Enter number of students expected in tutorial %d: ", ++counter);
        int numberOfStudentsExp_1 = kybd.nextInt();
        System.out.printf("Enter number of students attending tutorial %d: ", counter);
        int numberOfStudentsAtt_1 = kybd.nextInt();
        System.out.printf("Enter number of students expected in tutorial %d: ", ++counter);
        int numberOfStudentsExp_2 = kybd.nextInt();
        System.out.printf("Enter number of students attending tutorial %d: ", counter);
        int numberOfStudentsAtt_2 = kybd.nextInt();
        System.out.printf("Enter number of students expected in tutorial %d: ", ++counter);
        int numberOfStudentsExp_3 = kybd.nextInt();
        System.out.printf("Enter number of students attending tutorial %d: ", counter);
        int numberOfStudentsAtt_3 = kybd.nextInt();   
        int totalExpected = numberOfStudentsExp_1 + numberOfStudentsExp_2 + numberOfStudentsExp_3;
        int totalAttendance = numberOfStudentsAtt_1 + numberOfStudentsAtt_2 + numberOfStudentsAtt_3;
        double averageAttendance =(double)totalAttendance / counter;
        System.out.printf("Total number of students expected at the %d tutorial's was %d.\n", counter, totalExpected);
        System.out.printf("Total number of students attending the %d tutorial's was %d.\n", counter, totalAttendance);
        System.out.printf("Average number of students attending the a tutorial was %.2f.\n", averageAttendance);    
    } 
}
