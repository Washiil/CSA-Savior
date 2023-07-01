import java.util.Scanner;

public class Bacteria
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many hours will the bacteria breed? ");
        int hours = input.nextInt();
        int bacteria = colonySize(hours);
        System.out.println("After " + hours + " hours, there will be " + bacteria);
    }
    
    public static int colonySize(int hour) {
        if (hour == 0) {
            return 7; // Base case: starting number of bacteria is 7
        } else {
            int previousHourSize = colonySize(hour - 1); // Recursive call to get previous hour size
            return previousHourSize + previousHourSize * 4; // Calculation for current hour size
        }
    }
}