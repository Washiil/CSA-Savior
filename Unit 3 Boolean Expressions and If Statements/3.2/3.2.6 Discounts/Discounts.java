import java.util.Scanner;

public class Discounts
{
    public static void main(String[] args)
    {
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        // Ask how many hours were you parked
        System.out.println("How many hours were you parked? ");
        int hours = input.nextInt();
        double price;
        
        // Compute cost - $4.25
        
        price = hours * 4.25;
        
        // If parked for more than 3 hours, apply 25% discount
        if (hours > 3) price = price * 0.75;
        
        // If cost is under $7, set cost to $7
        if (price < 7) price = 7;
        
        // Display the final cost
        
        System.out.println("You owe $" + price); 
    }
}
