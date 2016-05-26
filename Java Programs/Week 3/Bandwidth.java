package bandwidth;

import java.util.Scanner;
public class Bandwidth {

    
    public static void main(String[] args) {
        Scanner kybrd = new Scanner (System.in);
        int bPerMb = 125000;
        int users =200;
        int appA = 200000;
        int appB = 100000;
        int newApp = 350000;
        System.out.print("Please Enter available bandwidth in Mb: ");
        int mbAvailable = kybrd.nextInt();
        int capacity = mbAvailable * bPerMb;
        int usage = (users*appA)+(users*appB);
        int netAvail = (capacity-usage);
        int newAppUse = users*newApp;
        int afterApp = (capacity-usage-newAppUse)/125000;
        System.out.printf("The network capacity = %d Bps\n"
                + "Current usage = %d Bps\n"
                + "Current availability = %d Bps\n"
                + "New application requirement = %d Bps\n"
                + "Bandwidth available after installation of new application = %d Mbps\n\n",capacity,usage,netAvail,newAppUse,afterApp);
    }    
}
