import java.util.Scanner;

public class Goals
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Ask for goal amount
        System.out.println("Enter your goal: ");
        int goal = input.nextInt();
        // Ask for actual amount
        System.out.println("Enter your actual amount: ");
        int trueValue = input.nextInt();
        // Compare numbers by creating three booleans
        System.out.println("Went over goal? " + (goal < trueValue));
        System.out.println("Did not meet goal? " + (trueValue < goal));
        System.out.println("Met goal exactly? " + (trueValue == goal));
        
        // Display results as instructed
        
    }
}
