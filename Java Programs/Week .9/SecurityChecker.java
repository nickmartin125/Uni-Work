package securitychecker;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.lang.IndexOutOfBoundsException;
public class SecurityChecker 

{
    public static String passWordcheck()
    {
        Scanner kybrd = new Scanner (System.in);
        boolean valid = false;
        boolean match = false;
        String password = "";
        
        do
        {
           do{
            System.out.print("Please Enter Password: ");
            password = kybrd.nextLine();

            if (Character.isDigit(password.charAt(0))){
                System.out.println("Your Password cannot start with a number\n");
            }
            else if (password.length()<8){
                System.out.println("Password needs to be eight or more Characters");            
            } 
            else if (password.contains(" ")){
                System.out.println("Password cannot contain spaces");}
            
            valid = true;
           }
                
            while(!valid);
                System.out.print("Please Reenter Password: ");
                String passwordcheck = kybrd.nextLine();
                
            if (!password.equals(passwordcheck))
                System.out.println("Passwords do not match!");
            else
                match = true;
            
        }while(!match);
        
        return password;
    }

    public static void main(String[] args) 
    {
        Scanner kybrd = new Scanner (System.in);
        ArrayList <person> personList = new ArrayList <person>();
        int day;
        int month;
        int year;
        int option = 0;
        int trycount = 0;
        person tempPerson;
        
    do{    
     try
     {
        System.out.print("\n\nWelcome to DSSD\n"
               + "Please choose one of the following options,\n"
               + "1. New User.\n"
               + "2. Existing User.\n"
               + "99. To Exit.....\n"
               + "Choice: ");
        option = kybrd.nextInt();
        kybrd.nextLine();
        switch (option)
        {
            case 1:
                System.out.print("Please Enter First Name: ");
                String forname = kybrd.nextLine();
                System.out.print("Please Enter Surname: ");
                String surname = kybrd.nextLine();
                System.out.print("Please Enter Date of Birth: ");
                day = kybrd.nextInt();
                month = kybrd.nextInt();
                year = kybrd.nextInt(); 
                person b = new person();
                String password = passWordcheck();
                b.setName(forname,surname);
                b.setDOB(day,month,year);
                b.setPassword(password);
                personList.add(b);
                
            break;
            case 2:
                while(personList.size()>0)
                {
                int i = -1;
                System.out.print("Please Enter First Name: ");
                forname = kybrd.nextLine();
                System.out.print("Please Enter Surname: ");
                surname = kybrd.nextLine();
               do
               { 
                    i++;
                    tempPerson = personList.get(i);
               }
               while(!(tempPerson.getName().equalsIgnoreCase(forname+' '+surname))&&(!(forname.equals(' ')&&(!(surname.equals(' '))))));
                       System.out.print("Hi "+ tempPerson.getName()+", Please Enter Your Password below.\n");
                       while(trycount <3){
                       System.out.print("Password: ");
                       String Pass = kybrd.nextLine();
                       if (Pass.equals(tempPerson.getPassword()))
                       {
                           System.out.println("\n\nWelcome Back!!!");
                          break;
                       }
                       else
                       {
                           trycount++;
                       }
                       }
                       System.out.print("Please come back in Three Minutes\n");
                       Thread.sleep(180000);    
                       System.out.println("Please Try Again.");
                           
                } 
                System.out.println("Please Enter New user.\n\n");
                }
   
               

        }catch(InputMismatchException | InterruptedException | StringIndexOutOfBoundsException ime)
        {
        System.out.println("Please enter valid information/choice.");
        break;
        }
        catch(IndexOutOfBoundsException OOB)
        {
            System.out.print("Please Enter Name Information");
        }
    }while(option!=99);
    }
     
    
}

