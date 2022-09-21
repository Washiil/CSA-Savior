import java.util.Scanner;

public class MovieRatings
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter movie rating (as a decimal)");
        double baseRating = input.nextDouble();
        int roundedRating = (int) (baseRating + + 0.5);
        System.out.println("Rating rounded: " + roundedRating);
        // Start here!
       
    }
}