import java.util.Scanner;
import java.lang.*;

public class ExtremeMain
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Create an Extremes object
        Extremes extreme = new Extremes();

        // Ask the user to guess the maximum value of an Integer
        System.out.println("What is the maximum value of the number:");
        int maxGuess = input.nextInt();
        // Compute and display what they'd need to multiply by
        // to reach the maximum number
        int q1 = extreme.maxQuotient(maxGuess);
        System.out.println("You'd need to multiply your number by " + q1 + " to reach the max value!");

        // Ask the user to guess the minimum value of an Integer
        System.out.println("What is the maximum value of the number:");
        int minGuess = input.nextInt();
        // Compute and display what they'd need to multiply by
        // to reach the minimum number
        int q2 = extreme.minQuotient(minGuess);
        System.out.println("You'd need to multiply your number by " + q2 + " to reach the max value!");
    }
}