package cansofpaint;


public class CansOfPaint {

//   into boxes with internal measurements of 0.60 x 0.30 x 0.35 metres (L x W x H).
    public static void main(String[] args) {
        double perCan = 5.1;
        double paintArea = (60+80*3.4);
        double Cans = (paintArea/perCan);
        int amountOfCans = (int)Math.ceil(Cans);
        double box = (amountOfCans/8);
        int amountOfBoxes = (int) box;
        double looseCans = (amountOfCans%amountOfBoxes);
       System.out.println("The customers paintable area is "+paintArea+" square meters.");
       System.out.println("One can of paint will cover "+perCan+" square meters.");
       System.out.println("The customer will need "+amountOfCans+" cans of paint.");
       System.out.println("This will be "+amountOfBoxes+" full boxes and "+(int) looseCans+" loose Can(s).");
    }
    
}
