import java.util.Scanner;

public class Berries
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Ask for a berry 
        System.out.println("Enter the initial of the berry: ");
        
        // Remember the Scanner object will take whole strings
        String order = input.nextLine();
        
        // Extract the first character using charAt
        char berry = order.charAt(0);

        if(berry == 'E') System.out.println("You ordered Elderberry");

        else if(berry == 'G') System.out.println("You ordered Gooseberry");

        else if(berry == 'L') System.out.println("You ordered Lingonberry");
        
        else System.out.println("Berry not recognized");
        // branches you will need before you write the code
    }
}