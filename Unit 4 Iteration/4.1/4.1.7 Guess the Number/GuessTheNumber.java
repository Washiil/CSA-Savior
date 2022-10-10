import java.util.Scanner;

public class GuessTheNumber
{ 
    // This is the height of Mt. Everest.
    static int everestHeight = 8848;
    
    public static void main(String[] args)
    {
        
        System.out.println("Do you know how tall Mt. Everest is?");
        System.out.println("See if you can guess the height in meters.");
        
        // This calls the static method guessTheHeight. Notice that the method is outside 
        // of the main method. 
        guessTheHeight();
        
    }
    
    public static void guessTheHeight() 
    {
        Scanner input = new Scanner(System.in);
        int i = 0;
        while(i != everestHeight)
        {
            System.out.println("Guess the height: ");
            i = input.nextInt();
            
            if (i != everestHeight)
            {
                System.out.println("That's not it!");
            }
        }
        System.out.println("Right! Mt. Everest is 8848 meters tall!");
        // Your code goes here!
        // Allow the user to keep guessing until they guess the correct height
        
    }
}