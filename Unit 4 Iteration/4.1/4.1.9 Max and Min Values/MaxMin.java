import java.util.Scanner;

public class MaxMin
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number or 0 to quit: ");
        int userNum = input.nextInt();
        
        int largest = userNum;
        int smallest = userNum;
        
        
        while (userNum != 0)
        {
            if (userNum > largest) largest = userNum;
            if (userNum < smallest) smallest = userNum;
            
            System.out.println("Results so far:");
            System.out.println("Largest number: "  + largest);
            System.out.println("Smallest number: " + smallest);
            
            System.out.println("Enter a number or 0 to quit: ");
            userNum = input.nextInt();
        }
    }
}