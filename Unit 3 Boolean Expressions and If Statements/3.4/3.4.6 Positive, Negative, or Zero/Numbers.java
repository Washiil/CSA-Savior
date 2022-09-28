import java.util.Scanner;

public class Numbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int num1 = input.nextInt();
        
        if (num1 > 0)
        {
            System.out.println("The number is positive!" );
        }
        else if (num1 < 0)
        {
            System.out.println("The number is negative!" );
        }
        else if (num1 == 0) 
        {
            System.out.println("The number is neither positive nor negative!");
        }
    }
}