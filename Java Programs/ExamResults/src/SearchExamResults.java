import java.util.*;

public class SearchExamResults
{
    public static void main(String[] args)
    {
        Scanner kybrd = new Scanner (System.in);
        ArrayList <Result> resultsArray = new ArrayList <>();

        input(resultsArray);
        sortByMark(resultsArray);
        output(resultsArray);
    }

    public static void input(ArrayList Result )
    {
        Scanner kybrd = new Scanner(System.in);
        String name = "";
        int mark;
        int i=1;
        do{
                
            System.out.println("Candidate "+(i));
            System.out.print("\tName: ");
            name = kybrd.nextLine();
            System.out.print("\tMark: ");
            mark = kybrd.nextInt();
            kybrd.nextLine();      
            Result a = new Result();
            a.setResult(name,mark);
            Result.add(a);
            i++;
        }while(mark!=-1);
    }

    public static void sortByMark(ArrayList <Result> array)
    {   Integer temp = 0;
        Result tempResult;
        for (int i = 0; i < array.size(); i++)
        {
            tempResult = array.get(i);
            if (tempResult.getMark()>=temp){
                array.remove(i);
                array.add(0, tempResult);
                temp = tempResult.getMark();
           }
        }
    }

    public static void output(ArrayList <Result> array)
    {
        System.out.println("\nExam results");
        System.out.println("============");

        for (Result tempResult : array) {
            System.out.printf("\t%-20s\t%d\n", tempResult.getName(), tempResult.getMark());
        }
    }
}




