import java.util.Scanner;

public class AddedSugar
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Ask the user for the grams of sugar
        System.out.println("How many grams of sugar have you eaten today? ");
        int grams = input.nextInt();
        
        boolean moreSugar = true;
        
        if (grams > 25) moreSugar = false;
        
        System.out.println("You can eat more sugar: " + moreSugar);
        
        // Use a boolean expression to print if they can eat more sugar
    }
}
